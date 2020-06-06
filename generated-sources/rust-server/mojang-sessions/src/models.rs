#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerProfile {
    /// The player UUID without hyphens
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "name")]
    pub name: String,

    /// Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
    #[serde(rename = "legacy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub legacy: Option<bool>,

    /// An array with all player properties, like skin and cape
    #[serde(rename = "properties")]
    pub properties: Vec<models::PlayerProfileProperty>,

}

impl PlayerProfile {
    pub fn new(id: String, name: String, properties: Vec<models::PlayerProfileProperty>, ) -> PlayerProfile {
        PlayerProfile {
            id: id,
            name: name,
            legacy: Some(false),
            properties: properties,
        }
    }
}

/// A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerProfileProperty {
    /// The property name
    #[serde(rename = "name")]
    pub name: String,

    /// The serialized property value in base64.
    #[serde(rename = "value")]
    pub value: swagger::ByteArray,

    /// signed data using Yggdrasil's private key
    #[serde(rename = "signature")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signature: Option<swagger::ByteArray>,

}

impl PlayerProfileProperty {
    pub fn new(name: String, value: swagger::ByteArray, ) -> PlayerProfileProperty {
        PlayerProfileProperty {
            name: name,
            value: value,
            signature: None,
        }
    }
}

/// This is obtained by decoding the \"textures\" property
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerProfileTexturePropertyValue {
    /// UNIX timestamp in milliseconds
    #[serde(rename = "timestamp")]
    pub timestamp: i64,

    /// The player UUID without hyphens
    #[serde(rename = "profileId")]
    pub profile_id: String,

    /// The player's name
    #[serde(rename = "profileName")]
    pub profile_name: String,

    /// Only present if unsigned was set to false in the request
    #[serde(rename = "signatureRequired")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signature_required: Option<bool>,

    #[serde(rename = "textures")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub textures: Option<models::PlayerTexture>,

}

impl PlayerProfileTexturePropertyValue {
    pub fn new(timestamp: i64, profile_id: String, profile_name: String, ) -> PlayerProfileTexturePropertyValue {
        PlayerProfileTexturePropertyValue {
            timestamp: timestamp,
            profile_id: profile_id,
            profile_name: profile_name,
            signature_required: Some(false),
            textures: None,
        }
    }
}

/// Contains details about the skin
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerSkinMetadata {
    /// The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "model")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<String>,

}

impl PlayerSkinMetadata {
    pub fn new() -> PlayerSkinMetadata {
        PlayerSkinMetadata {
            model: None,
        }
    }
}

/// Wraps the URL to the texture and configures the player's model
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerSkinUrl {
    /// The URL to the texture, must be in Mojang's domains.
    #[serde(rename = "url")]
    pub url: String,

}

impl PlayerSkinUrl {
    pub fn new(url: String, ) -> PlayerSkinUrl {
        PlayerSkinUrl {
            url: url,
        }
    }
}

/// Provide links to the player's skin and cape
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerTexture {
    #[serde(rename = "SKIN")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub skin: Option<models::PlayerSkinUrl>,

    #[serde(rename = "CAPE")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cape: Option<models::PlayerTextureUrl>,

}

impl PlayerTexture {
    pub fn new() -> PlayerTexture {
        PlayerTexture {
            skin: None,
            cape: None,
        }
    }
}

/// Wraps the URL to the texture
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct PlayerTextureUrl {
    /// The URL to the texture, must be in Mojang's domains.
    #[serde(rename = "url")]
    pub url: String,

}

impl PlayerTextureUrl {
    pub fn new(url: String, ) -> PlayerTextureUrl {
        PlayerTextureUrl {
            url: url,
        }
    }
}

/// An object describing giving a bit of information about the error
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SessionApiError {
    /// A message describing the error
    #[serde(rename = "error")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub error: Option<String>,

    /// The request path
    #[serde(rename = "path")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub path: Option<String>,

}

impl SessionApiError {
    pub fn new() -> SessionApiError {
        SessionApiError {
            error: None,
            path: None,
        }
    }
}
