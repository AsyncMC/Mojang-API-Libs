#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
extern crate serde;
#[macro_use]
extern crate serde_derive;
extern crate serde_json;


extern crate futures;
extern crate chrono;
#[macro_use]
extern crate lazy_static;
#[macro_use]
extern crate log;

// Logically this should be in the client and server modules, but rust doesn't allow `macro_use` from a module.
#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate hyper;

extern crate swagger;

#[macro_use]
extern crate url;

use futures::Stream;
use std::io::Error;

#[allow(unused_imports)]
use std::collections::HashMap;

pub use futures::Future;

#[cfg(any(feature = "client", feature = "server"))]
mod mimetypes;

pub use swagger::{ApiError, ContextWrapper};

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "2020-06-05.0.0";


#[derive(Debug, PartialEq)]
pub enum AuthenticateResponse {
    /// Successfully authenticated
    SuccessfullyAuthenticated ( models::Authentication ) ,
    /// Could not authenticate
    CouldNotAuthenticate ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum InvalidateResponse {
    /// The token have been invalidated
    TheTokenHaveBeenInvalidated ,
    /// Could not invalidate the token
    CouldNotInvalidateTheToken ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum RefreshResponse {
    /// Session refreshed successfully. Note: The old access token gets invalidated.
    SessionRefreshedSuccessfully ( models::RefreshResponse ) ,
    /// Could not refresh the session
    CouldNotRefreshTheSession ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum SiginoutResponse {
    /// All tokens have been invalidated
    AllTokensHaveBeenInvalidated ,
    /// Invalid username/password
    InvalidUsername ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum ValidateResponse {
    /// The token is valid
    TheTokenIsValid ,
    /// The token is not valid
    TheTokenIsNotValid ( models::Error ) ,
}


/// API
pub trait Api<C> {


    fn authenticate(&self, authentication_request: models::AuthenticationRequest, context: &C) -> Box<Future<Item=AuthenticateResponse, Error=ApiError>>;


    fn invalidate(&self, access_keys: models::AccessKeys, context: &C) -> Box<Future<Item=InvalidateResponse, Error=ApiError>>;


    fn refresh(&self, refresh_request: models::RefreshRequest, context: &C) -> Box<Future<Item=RefreshResponse, Error=ApiError>>;


    fn siginout(&self, username_password: models::UsernamePassword, context: &C) -> Box<Future<Item=SiginoutResponse, Error=ApiError>>;


    fn validate(&self, access_keys: models::AccessKeys, context: &C) -> Box<Future<Item=ValidateResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {


    fn authenticate(&self, authentication_request: models::AuthenticationRequest) -> Box<Future<Item=AuthenticateResponse, Error=ApiError>>;


    fn invalidate(&self, access_keys: models::AccessKeys) -> Box<Future<Item=InvalidateResponse, Error=ApiError>>;


    fn refresh(&self, refresh_request: models::RefreshRequest) -> Box<Future<Item=RefreshResponse, Error=ApiError>>;


    fn siginout(&self, username_password: models::UsernamePassword) -> Box<Future<Item=SiginoutResponse, Error=ApiError>>;


    fn validate(&self, access_keys: models::AccessKeys) -> Box<Future<Item=ValidateResponse, Error=ApiError>>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {


    fn authenticate(&self, authentication_request: models::AuthenticationRequest) -> Box<Future<Item=AuthenticateResponse, Error=ApiError>> {
        self.api().authenticate(authentication_request, &self.context())
    }


    fn invalidate(&self, access_keys: models::AccessKeys) -> Box<Future<Item=InvalidateResponse, Error=ApiError>> {
        self.api().invalidate(access_keys, &self.context())
    }


    fn refresh(&self, refresh_request: models::RefreshRequest) -> Box<Future<Item=RefreshResponse, Error=ApiError>> {
        self.api().refresh(refresh_request, &self.context())
    }


    fn siginout(&self, username_password: models::UsernamePassword) -> Box<Future<Item=SiginoutResponse, Error=ApiError>> {
        self.api().siginout(username_password, &self.context())
    }


    fn validate(&self, access_keys: models::AccessKeys) -> Box<Future<Item=ValidateResponse, Error=ApiError>> {
        self.api().validate(access_keys, &self.context())
    }

}

#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use self::client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

pub mod models;
