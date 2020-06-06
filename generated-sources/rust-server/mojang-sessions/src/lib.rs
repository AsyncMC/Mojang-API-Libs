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
pub enum GetBlockedServerHashesResponse {
    /// A list of SHA1 hashes, one hash per line
    AListOfSHA ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetPlayerProfileResponse {
    /// The player profile and all properties
    ThePlayerProfileAndAllProperties ( models::PlayerProfile ) ,
    /// UUID is invalid
    UUIDIsInvalid ( models::SessionApiError ) ,
}


/// API
pub trait Api<C> {

    /// A list of SHA1 hashes of banned servers
    fn get_blocked_server_hashes(&self, context: &C) -> Box<Future<Item=GetBlockedServerHashesResponse, Error=ApiError>>;

    /// Gets the player's game profile
    fn get_player_profile(&self, stripped_uuid: String, unsigned: Option<bool>, context: &C) -> Box<Future<Item=GetPlayerProfileResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {

    /// A list of SHA1 hashes of banned servers
    fn get_blocked_server_hashes(&self) -> Box<Future<Item=GetBlockedServerHashesResponse, Error=ApiError>>;

    /// Gets the player's game profile
    fn get_player_profile(&self, stripped_uuid: String, unsigned: Option<bool>) -> Box<Future<Item=GetPlayerProfileResponse, Error=ApiError>>;

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

    /// A list of SHA1 hashes of banned servers
    fn get_blocked_server_hashes(&self) -> Box<Future<Item=GetBlockedServerHashesResponse, Error=ApiError>> {
        self.api().get_blocked_server_hashes(&self.context())
    }

    /// Gets the player's game profile
    fn get_player_profile(&self, stripped_uuid: String, unsigned: Option<bool>) -> Box<Future<Item=GetPlayerProfileResponse, Error=ApiError>> {
        self.api().get_player_profile(stripped_uuid, unsigned, &self.context())
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
