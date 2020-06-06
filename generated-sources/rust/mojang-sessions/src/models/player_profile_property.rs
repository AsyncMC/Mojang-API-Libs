/* 
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

/// PlayerProfileProperty : A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct PlayerProfileProperty {
  /// The property name
  #[serde(rename = "name")]
  name: String,
  /// The serialized property value in base64.
  #[serde(rename = "value")]
  value: String,
  /// signed data using Yggdrasil's private key
  #[serde(rename = "signature")]
  signature: Option<String>
}

impl PlayerProfileProperty {
  /// A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
  pub fn new(name: String, value: String) -> PlayerProfileProperty {
    PlayerProfileProperty {
      name: name,
      value: value,
      signature: None
    }
  }

  pub fn set_name(&mut self, name: String) {
    self.name = name;
  }

  pub fn with_name(mut self, name: String) -> PlayerProfileProperty {
    self.name = name;
    self
  }

  pub fn name(&self) -> &String {
    &self.name
  }


  pub fn set_value(&mut self, value: String) {
    self.value = value;
  }

  pub fn with_value(mut self, value: String) -> PlayerProfileProperty {
    self.value = value;
    self
  }

  pub fn value(&self) -> &String {
    &self.value
  }


  pub fn set_signature(&mut self, signature: String) {
    self.signature = Some(signature);
  }

  pub fn with_signature(mut self, signature: String) -> PlayerProfileProperty {
    self.signature = Some(signature);
    self
  }

  pub fn signature(&self) -> Option<&String> {
    self.signature.as_ref()
  }

  pub fn reset_signature(&mut self) {
    self.signature = None;
  }

}



