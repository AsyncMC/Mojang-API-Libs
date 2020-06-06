/* 
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

/// PlayerProfileTexturePropertyValue : This is obtained by decoding the \"textures\" property

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct PlayerProfileTexturePropertyValue {
  /// UNIX timestamp in milliseconds
  #[serde(rename = "timestamp")]
  timestamp: i64,
  /// The player UUID without hyphens
  #[serde(rename = "profileId")]
  profile_id: String,
  /// The player's name
  #[serde(rename = "profileName")]
  profile_name: String,
  /// Only present if unsigned was set to false in the request
  #[serde(rename = "signatureRequired")]
  signature_required: Option<bool>,
  #[serde(rename = "textures")]
  textures: Option<::models::PlayerTexture>
}

impl PlayerProfileTexturePropertyValue {
  /// This is obtained by decoding the \"textures\" property
  pub fn new(timestamp: i64, profile_id: String, profile_name: String) -> PlayerProfileTexturePropertyValue {
    PlayerProfileTexturePropertyValue {
      timestamp: timestamp,
      profile_id: profile_id,
      profile_name: profile_name,
      signature_required: None,
      textures: None
    }
  }

  pub fn set_timestamp(&mut self, timestamp: i64) {
    self.timestamp = timestamp;
  }

  pub fn with_timestamp(mut self, timestamp: i64) -> PlayerProfileTexturePropertyValue {
    self.timestamp = timestamp;
    self
  }

  pub fn timestamp(&self) -> &i64 {
    &self.timestamp
  }


  pub fn set_profile_id(&mut self, profile_id: String) {
    self.profile_id = profile_id;
  }

  pub fn with_profile_id(mut self, profile_id: String) -> PlayerProfileTexturePropertyValue {
    self.profile_id = profile_id;
    self
  }

  pub fn profile_id(&self) -> &String {
    &self.profile_id
  }


  pub fn set_profile_name(&mut self, profile_name: String) {
    self.profile_name = profile_name;
  }

  pub fn with_profile_name(mut self, profile_name: String) -> PlayerProfileTexturePropertyValue {
    self.profile_name = profile_name;
    self
  }

  pub fn profile_name(&self) -> &String {
    &self.profile_name
  }


  pub fn set_signature_required(&mut self, signature_required: bool) {
    self.signature_required = Some(signature_required);
  }

  pub fn with_signature_required(mut self, signature_required: bool) -> PlayerProfileTexturePropertyValue {
    self.signature_required = Some(signature_required);
    self
  }

  pub fn signature_required(&self) -> Option<&bool> {
    self.signature_required.as_ref()
  }

  pub fn reset_signature_required(&mut self) {
    self.signature_required = None;
  }

  pub fn set_textures(&mut self, textures: ::models::PlayerTexture) {
    self.textures = Some(textures);
  }

  pub fn with_textures(mut self, textures: ::models::PlayerTexture) -> PlayerProfileTexturePropertyValue {
    self.textures = Some(textures);
    self
  }

  pub fn textures(&self) -> Option<&::models::PlayerTexture> {
    self.textures.as_ref()
  }

  pub fn reset_textures(&mut self) {
    self.textures = None;
  }

}


