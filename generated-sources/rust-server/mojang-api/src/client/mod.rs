#![allow(unused_extern_crates)]
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate chrono;
extern crate url;
extern crate serde_urlencoded;


use hyper;
use hyper::header::{Headers, ContentType};
use hyper::Uri;
use self::url::percent_encoding::{utf8_percent_encode, PATH_SEGMENT_ENCODE_SET, QUERY_ENCODE_SET};
use futures;
use futures::{Future, Stream};
use futures::{future, stream};
use self::tokio_core::reactor::Handle;
use std::borrow::Cow;
use std::io::{Read, Error, ErrorKind};
use std::error;
use std::fmt;
use std::path::Path;
use std::sync::Arc;
use std::str;
use std::str::FromStr;

use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;

use swagger::{ApiError, XSpanId, XSpanIdString, Has, AuthData};

use {Api,
     GetOrdersStatisticsResponse,
     FindUniqueIdsByNameResponse,
     GetNameHistoryResponse,
     GetUniqueIdByNameResponse,
     CheckSecurityStatusResponse,
     ListPendingSecurityQuestionsResponse,
     SendSecurityQuestionAnswersResponse,
     ChangePlayerSkinResponse,
     ResetPlayerSkinResponse,
     UploadPlayerSkinResponse
     };
use models;

define_encode_set! {
    /// This encode set is used for object IDs
    ///
    /// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
    /// the vertical bar (|) is encoded.
    pub ID_ENCODE_SET = [PATH_SEGMENT_ENCODE_SET] | {'|'}
}

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: &str, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = Uri::from_str(input)?;

    let scheme = uri.scheme().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}", scheme, host, port))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<F> where
  F: Future<Item=hyper::Response, Error=hyper::Error> + 'static {
    client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
    base_path: String,
}

impl<F> fmt::Debug for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<F> Clone for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn clone(&self) -> Self {
        Client {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone()
        }
    }
}

impl Client<hyper::client::FutureResponse> {

    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    pub fn try_new_http(handle: Handle, base_path: &str) -> Result<Client<hyper::client::FutureResponse>, ClientInitError> {
        let http_connector = swagger::http_connector();
        Self::try_new_with_connector::<hyper::client::HttpConnector>(
            handle,
            base_path,
            Some("http"),
            http_connector,
        )
    }

    /// Create a client with a TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    pub fn try_new_https<CA>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = swagger::https_connector(ca_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    pub fn try_new_https_mutual<CA, K, C>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: C,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        C: AsRef<Path>,
    {
        let https_connector =
            swagger::https_mutual_connector(ca_certificate, client_key, client_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with
    /// `swagger::{http_connector, https_connector, https_mutual_connector}`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector_fn` - Function which returns an implementation of `hyper::client::Connect`
    pub fn try_new_with_connector<C>(
        handle: Handle,
        base_path: &str,
        protocol: Option<&'static str>,
        connector_fn: Box<Fn(&Handle) -> C + Send + Sync>,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        C: hyper::client::Connect + hyper::client::Service,
    {
        let connector = connector_fn(&handle);
        let client_service = Box::new(hyper::Client::configure().connector(connector).build(
            &handle,
        ));

        Ok(Client {
            client_service: Arc::new(client_service),
            base_path: into_base_path(base_path, protocol)?,
        })
    }

    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client.
    ///
    /// One should avoid relying on this function if possible, since it adds a dependency on the underlying transport
    /// implementation, which it would be better to abstract away. Therefore, using this function may lead to a loss of
    /// code generality, which may make it harder to move the application to a serverless environment, for example.
    ///
    /// The reason for this function's existence is to support legacy test code, which did mocking at the hyper layer.
    /// This is not a recommended way to write new tests. If other reasons are found for using this function, they
    /// should be mentioned here.
    #[deprecated(note="Use try_new_with_client_service instead")]
    pub fn try_new_with_hyper_client(
        hyper_client: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=hyper::client::FutureResponse>>>,
        handle: Handle,
        base_path: &str
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    {
        Ok(Client {
            client_service: hyper_client,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F> Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client Service.
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
                                       handle: Handle,
                                       base_path: &str)
                                    -> Result<Client<F>, ClientInitError>
    {
        Ok(Client {
            client_service: client_service,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F, C> Api<C> for Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static,
    C: Has<XSpanIdString> + Has<Option<AuthData>>{

    fn get_orders_statistics(&self, param_order_statistics_request: models::OrderStatisticsRequest, context: &C) -> Box<Future<Item=GetOrdersStatisticsResponse, Error=ApiError>> {


        let uri = format!(
            "{}/orders/statistics",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_order_statistics_request).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_ORDERS_STATISTICS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::OrderStatisticsResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrdersStatisticsResponse::AJsonObjectIsReturnedWithTheTotalAmountOfCopiesSold(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn find_unique_ids_by_name(&self, param_string: &Vec<String>, context: &C) -> Box<Future<Item=FindUniqueIdsByNameResponse, Error=ApiError>> {


        let uri = format!(
            "{}/profiles/minecraft",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_string).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::FIND_UNIQUE_IDS_BY_NAME.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::CurrentPlayerIDs>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FindUniqueIdsByNameResponse::AnArrayContainingAllPlayersFound(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_name_history(&self, param_stripped_uuid: String, context: &C) -> Box<Future<Item=GetNameHistoryResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/profiles/{stripped_uuid}/names",
            self.base_path, stripped_uuid=utf8_percent_encode(&param_stripped_uuid.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::NameChange>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetNameHistoryResponse::AListOfNameChanges(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetNameHistoryResponse::UsernameNotFoundAtTheGivenTime
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_unique_id_by_name(&self, param_username: String, param_at: Option<i64>, context: &C) -> Box<Future<Item=GetUniqueIdByNameResponse, Error=ApiError>> {

        // Query parameters
        let query_at = param_at.map_or_else(String::new, |query| format!("at={at}&", at=query.to_string()));


        let uri = format!(
            "{}/users/profiles/minecraft/{username}?{at}",
            self.base_path, username=utf8_percent_encode(&param_username.to_string(), ID_ENCODE_SET),
            at=utf8_percent_encode(&query_at, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::CurrentPlayerIDs>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetUniqueIdByNameResponse::TheUserWasFound(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetUniqueIdByNameResponse::UserNotFound
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetUniqueIdByNameResponse::IfTheTimestampIsInvalid(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn check_security_status(&self, context: &C) -> Box<Future<Item=CheckSecurityStatusResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/security/location",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            CheckSecurityStatusResponse::NoCheckIsNeeded
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CheckSecurityStatusResponse::ASecurityCheckIsNeededOrThereIsAnOtherIssue(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn list_pending_security_questions(&self, context: &C) -> Box<Future<Item=ListPendingSecurityQuestionsResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/security/challenges",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::SecurityChallenge>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListPendingSecurityQuestionsResponse::AListOfSecurityQuestionsToBeAnswered(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn send_security_question_answers(&self, param_security_answer: &Vec<models::SecurityAnswer>, context: &C) -> Box<Future<Item=SendSecurityQuestionAnswersResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/security/location",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_security_answer).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::SEND_SECURITY_QUESTION_ANSWERS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            SendSecurityQuestionAnswersResponse::TheAnswersWereAccepted
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            SendSecurityQuestionAnswersResponse::AtLeastOneAnswerWeNotAccepted(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn change_player_skin(&self, param_stripped_uuid: String, param_url: String, param_model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=ChangePlayerSkinResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/profile/{stripped_uuid}/skin",
            self.base_path, stripped_uuid=utf8_percent_encode(&param_stripped_uuid.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("model", param_model.map(|param| format!("{:?}", param))),
            ("url", Some(param_url)),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::CHANGE_PLAYER_SKIN.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            ChangePlayerSkinResponse::TheSkinHasBeenChanged
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ChangePlayerSkinResponse::UponErrorTheServerWillSendBackAJSONWithTheError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn reset_player_skin(&self, param_stripped_uuid: String, context: &C) -> Box<Future<Item=ResetPlayerSkinResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/profile/{stripped_uuid}/skin",
            self.base_path, stripped_uuid=utf8_percent_encode(&param_stripped_uuid.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            ResetPlayerSkinResponse::TheSkinHasBeenChanged
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ResetPlayerSkinResponse::UponErrorTheServerWillSendBackAJSONWithTheError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn upload_player_skin(&self, param_stripped_uuid: String, param_file: swagger::ByteArray, param_model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=UploadPlayerSkinResponse, Error=ApiError>> {


        let uri = format!(
            "{}/user/profile/{stripped_uuid}/skin",
            self.base_path, stripped_uuid=utf8_percent_encode(&param_stripped_uuid.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);

        let params = &[
            ("model", param_model.map(|param| format!("{:?}", param))),
            ("file", Some(format!("{:?}", param_file))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::UPLOAD_PLAYER_SKIN.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                204 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            UploadPlayerSkinResponse::TheSkinHasBeenChanged
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Error>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UploadPlayerSkinResponse::UponErrorTheServerWillSendBackAJSONWithTheError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

}

#[derive(Debug)]
pub enum ClientInitError {
    InvalidScheme,
    InvalidUri(hyper::error::UriError),
    MissingHost,
    SslError(openssl::error::ErrorStack)
}

impl From<hyper::error::UriError> for ClientInitError {
    fn from(err: hyper::error::UriError) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl From<openssl::error::ErrorStack> for ClientInitError {
    fn from(err: openssl::error::ErrorStack) -> ClientInitError {
        ClientInitError::SslError(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        (self as &fmt::Debug).fmt(f)
    }
}

impl error::Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}
