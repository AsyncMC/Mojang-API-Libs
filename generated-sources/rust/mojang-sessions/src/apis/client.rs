use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  bans_api: Box<::apis::BansApi>,
  login_api: Box<::apis::LoginApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      bans_api: Box::new(::apis::BansApiClient::new(rc.clone())),
      login_api: Box::new(::apis::LoginApiClient::new(rc.clone())),
    }
  }

  pub fn bans_api(&self) -> &::apis::BansApi{
    self.bans_api.as_ref()
  }

  pub fn login_api(&self) -> &::apis::LoginApi{
    self.login_api.as_ref()
  }


}
