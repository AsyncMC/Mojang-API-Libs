#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AccessKeys {
    #[serde(rename = "accessToken")]
    pub access_token: String,

    #[serde(rename = "clientToken")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_token: Option<String>,

}

impl AccessKeys {
    pub fn new(access_token: String, ) -> AccessKeys {
        AccessKeys {
            access_token: access_token,
            client_token: None,
        }
    }
}

/// Identifies the software doing the request
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Agent {
    /// The name of the game
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The agent version, usually 1.
    #[serde(rename = "version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub version: Option<i32>,

}

impl Agent {
    pub fn new() -> Agent {
        Agent {
            name: Some("Minecraft".to_string()),
            version: Some(1),
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Authentication {
    #[serde(rename = "accessToken")]
    pub access_token: String,

    #[serde(rename = "clientToken")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_token: Option<String>,

}

impl Authentication {
    pub fn new(access_token: String, ) -> Authentication {
        Authentication {
            access_token: access_token,
            client_token: None,
        }
    }
}

/// Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct AuthenticationRequest {
    /// The Mojang account e-mail or username. Never store it.
    #[serde(rename = "username")]
    pub username: String,

    /// The Mojang account password, never store it.
    #[serde(rename = "password")]
    pub password: String,

}

impl AuthenticationRequest {
    pub fn new(username: String, password: String, ) -> AuthenticationRequest {
        AuthenticationRequest {
            username: username,
            password: password,
        }
    }
}

/// This is returned when the request fails
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Error {
    #[serde(rename = "error")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub error: Option<String>,

    #[serde(rename = "errorMessage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub error_message: Option<String>,

}

impl Error {
    pub fn new() -> Error {
        Error {
            error: None,
            error_message: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct GameProfile {
    #[serde(rename = "agent")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub agent: Option<String>,

    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "userId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<String>,

    /// Unix timestamp in milliseconds
    #[serde(rename = "createdAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub created_at: Option<i64>,

    #[serde(rename = "legacyProfile")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub legacy_profile: Option<bool>,

    #[serde(rename = "suspended")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub suspended: Option<bool>,

    #[serde(rename = "paid")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub paid: Option<bool>,

    #[serde(rename = "migrated")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub migrated: Option<bool>,

    #[serde(rename = "legacy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub legacy: Option<bool>,

}

impl GameProfile {
    pub fn new() -> GameProfile {
        GameProfile {
            agent: None,
            id: None,
            name: None,
            user_id: None,
            created_at: None,
            legacy_profile: None,
            suspended: None,
            paid: None,
            migrated: None,
            legacy: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct GameProfileProperty {
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

}

impl GameProfileProperty {
    pub fn new() -> GameProfileProperty {
        GameProfileProperty {
            name: None,
            value: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PrivateUserData {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "properties")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<Vec<models::GameProfileProperty>>,

}

impl PrivateUserData {
    pub fn new() -> PrivateUserData {
        PrivateUserData {
            id: None,
            properties: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct ProfileId {
    #[serde(rename = "id")]
    pub id: String,

    /// The player name
    #[serde(rename = "name")]
    pub name: String,

}

impl ProfileId {
    pub fn new(id: String, name: String, ) -> ProfileId {
        ProfileId {
            id: id,
            name: name,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct ReducedUserData {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "properties")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<Vec<models::GameProfileProperty>>,

}

impl ReducedUserData {
    pub fn new() -> ReducedUserData {
        ReducedUserData {
            id: None,
            properties: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct RefreshRequest {
    #[serde(rename = "accessToken")]
    pub access_token: String,

    #[serde(rename = "clientToken")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_token: Option<String>,

}

impl RefreshRequest {
    pub fn new(access_token: String, ) -> RefreshRequest {
        RefreshRequest {
            access_token: access_token,
            client_token: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct RefreshResponse {
    #[serde(rename = "accessToken")]
    pub access_token: String,

    #[serde(rename = "clientToken")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_token: Option<String>,

}

impl RefreshResponse {
    pub fn new(access_token: String, ) -> RefreshResponse {
        RefreshResponse {
            access_token: access_token,
            client_token: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct UsernamePassword {
    /// The Mojang account e-mail or username. Never store it.
    #[serde(rename = "username")]
    pub username: String,

    /// The Mojang account password, never store it.
    #[serde(rename = "password")]
    pub password: String,

}

impl UsernamePassword {
    pub fn new(username: String, password: String, ) -> UsernamePassword {
        UsernamePassword {
            username: username,
            password: password,
        }
    }
}
