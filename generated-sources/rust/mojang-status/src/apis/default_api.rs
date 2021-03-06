/* 
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;

use hyper;
use serde_json;
use futures::Future;

use super::{Error, configuration};
use super::request as __internal_request;

pub struct DefaultApiClient<C: hyper::client::Connect> {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::Connect> DefaultApiClient<C> {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> DefaultApiClient<C> {
        DefaultApiClient {
            configuration: configuration,
        }
    }
}

pub trait DefaultApi {
    fn check_statuses(&self, ) -> Box<Future<Item = Vec<::std::collections::HashMap<String, ::models::ApiStatus>>, Error = Error<serde_json::Value>>>;
}


impl<C: hyper::client::Connect>DefaultApi for DefaultApiClient<C> {
    fn check_statuses(&self, ) -> Box<Future<Item = Vec<::std::collections::HashMap<String, ::models::ApiStatus>>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/check".to_string())
            .execute(self.configuration.borrow())
    }

}
