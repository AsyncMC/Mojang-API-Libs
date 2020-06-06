/* 
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct PrivateUserData {
  #[serde(rename = "id")]
  id: Option<String>,
  #[serde(rename = "properties")]
  properties: Option<Vec<::models::GameProfileProperty>>
}

impl PrivateUserData {
  pub fn new() -> PrivateUserData {
    PrivateUserData {
      id: None,
      properties: None
    }
  }

  pub fn set_id(&mut self, id: String) {
    self.id = Some(id);
  }

  pub fn with_id(mut self, id: String) -> PrivateUserData {
    self.id = Some(id);
    self
  }

  pub fn id(&self) -> Option<&String> {
    self.id.as_ref()
  }

  pub fn reset_id(&mut self) {
    self.id = None;
  }

  pub fn set_properties(&mut self, properties: Vec<::models::GameProfileProperty>) {
    self.properties = Some(properties);
  }

  pub fn with_properties(mut self, properties: Vec<::models::GameProfileProperty>) -> PrivateUserData {
    self.properties = Some(properties);
    self
  }

  pub fn properties(&self) -> Option<&Vec<::models::GameProfileProperty>> {
    self.properties.as_ref()
  }

  pub fn reset_properties(&mut self) {
    self.properties = None;
  }

}


