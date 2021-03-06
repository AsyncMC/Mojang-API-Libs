/* 
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

/// AuthenticationRequest : Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct AuthenticationRequest {
  /// The Mojang account e-mail or username. Never store it.
  #[serde(rename = "username")]
  username: String,
  /// The Mojang account password, never store it.
  #[serde(rename = "password")]
  password: String
}

impl AuthenticationRequest {
  /// Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
  pub fn new(username: String, password: String) -> AuthenticationRequest {
    AuthenticationRequest {
      username: username,
      password: password
    }
  }

  pub fn set_username(&mut self, username: String) {
    self.username = username;
  }

  pub fn with_username(mut self, username: String) -> AuthenticationRequest {
    self.username = username;
    self
  }

  pub fn username(&self) -> &String {
    &self.username
  }


  pub fn set_password(&mut self, password: String) {
    self.password = password;
  }

  pub fn with_password(mut self, password: String) -> AuthenticationRequest {
    self.password = password;
    self
  }

  pub fn password(&self) -> &String {
    &self.password
  }


}



