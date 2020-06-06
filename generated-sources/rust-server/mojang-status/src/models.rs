#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


/// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
/// Enumeration of values.
/// Since this enum's variants do not hold data, we can easily define them them as `#[repr(C)]`
/// which helps with FFI.
#[allow(non_camel_case_types)]
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, PartialOrd, Serialize, Deserialize, Eq, Ord)]
pub enum ApiStatus { 
    #[serde(rename = "green")]
    GREEN,
    #[serde(rename = "yellow")]
    YELLOW,
    #[serde(rename = "red")]
    RED,
}

impl ::std::fmt::Display for ApiStatus {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        match *self { 
            ApiStatus::GREEN => write!(f, "{}", "green"),
            ApiStatus::YELLOW => write!(f, "{}", "yellow"),
            ApiStatus::RED => write!(f, "{}", "red"),
        }
    }
}

impl ::std::str::FromStr for ApiStatus {
    type Err = ();
    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "green" => Ok(ApiStatus::GREEN),
            "yellow" => Ok(ApiStatus::YELLOW),
            "red" => Ok(ApiStatus::RED),
            _ => Err(()),
        }
    }
}
