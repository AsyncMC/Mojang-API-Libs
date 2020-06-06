//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
                      AuthenticateResponse,
                      InvalidateResponse,
                      RefreshResponse,
                      SiginoutResponse,
                      ValidateResponse
};
use openapi_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{


    fn authenticate(&self, authentication_request: models::AuthenticationRequest, context: &C) -> Box<Future<Item=AuthenticateResponse, Error=ApiError>> {
        let context = context.clone();
        println!("authenticate({:?}) - X-Span-ID: {:?}", authentication_request, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn invalidate(&self, access_keys: models::AccessKeys, context: &C) -> Box<Future<Item=InvalidateResponse, Error=ApiError>> {
        let context = context.clone();
        println!("invalidate({:?}) - X-Span-ID: {:?}", access_keys, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn refresh(&self, refresh_request: models::RefreshRequest, context: &C) -> Box<Future<Item=RefreshResponse, Error=ApiError>> {
        let context = context.clone();
        println!("refresh({:?}) - X-Span-ID: {:?}", refresh_request, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn siginout(&self, username_password: models::UsernamePassword, context: &C) -> Box<Future<Item=SiginoutResponse, Error=ApiError>> {
        let context = context.clone();
        println!("siginout({:?}) - X-Span-ID: {:?}", username_password, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn validate(&self, access_keys: models::AccessKeys, context: &C) -> Box<Future<Item=ValidateResponse, Error=ApiError>> {
        let context = context.clone();
        println!("validate({:?}) - X-Span-ID: {:?}", access_keys, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
