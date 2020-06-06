/* 
 * Mojang Session API
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

pub struct BansApiClient<C: hyper::client::Connect> {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::Connect> BansApiClient<C> {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> BansApiClient<C> {
        BansApiClient {
            configuration: configuration,
        }
    }
}

pub trait BansApi {
    fn get_blocked_server_hashes(&self, ) -> Box<Future<Item = String, Error = Error<serde_json::Value>>>;
}


impl<C: hyper::client::Connect>BansApi for BansApiClient<C> {
    fn get_blocked_server_hashes(&self, ) -> Box<Future<Item = String, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/blockedservers".to_string())
            .execute(self.configuration.borrow())
    }

}