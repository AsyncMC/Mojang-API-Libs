//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
                      GetBlockedServerHashesResponse,
                      GetPlayerProfileResponse
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

    /// A list of SHA1 hashes of banned servers
    fn get_blocked_server_hashes(&self, context: &C) -> Box<Future<Item=GetBlockedServerHashesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_blocked_server_hashes() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Gets the player's game profile
    fn get_player_profile(&self, stripped_uuid: String, unsigned: Option<bool>, context: &C) -> Box<Future<Item=GetPlayerProfileResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_player_profile(\"{}\", {:?}) - X-Span-ID: {:?}", stripped_uuid, unsigned, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
