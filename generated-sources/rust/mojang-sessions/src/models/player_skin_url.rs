/* 
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

/// PlayerSkinUrl : Wraps the URL to the texture and configures the player's model

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct PlayerSkinUrl {
  /// The URL to the texture, must be in Mojang's domains.
  #[serde(rename = "url")]
  url: String
}

impl PlayerSkinUrl {
  /// Wraps the URL to the texture and configures the player's model
  pub fn new(url: String) -> PlayerSkinUrl {
    PlayerSkinUrl {
      url: url
    }
  }

  pub fn set_url(&mut self, url: String) {
    self.url = url;
  }

  pub fn with_url(mut self, url: String) -> PlayerSkinUrl {
    self.url = url;
    self
  }

  pub fn url(&self) -> &String {
    &self.url
  }


}



