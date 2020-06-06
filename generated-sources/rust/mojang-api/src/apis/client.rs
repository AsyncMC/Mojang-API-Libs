use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  miscellaneous_api: Box<::apis::MiscellaneousApi>,
  name_history_api: Box<::apis::NameHistoryApi>,
  security_question_answer_api: Box<::apis::SecurityQuestionAnswerApi>,
  skin_operations_api: Box<::apis::SkinOperationsApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      miscellaneous_api: Box::new(::apis::MiscellaneousApiClient::new(rc.clone())),
      name_history_api: Box::new(::apis::NameHistoryApiClient::new(rc.clone())),
      security_question_answer_api: Box::new(::apis::SecurityQuestionAnswerApiClient::new(rc.clone())),
      skin_operations_api: Box::new(::apis::SkinOperationsApiClient::new(rc.clone())),
    }
  }

  pub fn miscellaneous_api(&self) -> &::apis::MiscellaneousApi{
    self.miscellaneous_api.as_ref()
  }

  pub fn name_history_api(&self) -> &::apis::NameHistoryApi{
    self.name_history_api.as_ref()
  }

  pub fn security_question_answer_api(&self) -> &::apis::SecurityQuestionAnswerApi{
    self.security_question_answer_api.as_ref()
  }

  pub fn skin_operations_api(&self) -> &::apis::SkinOperationsApi{
    self.skin_operations_api.as_ref()
  }


}
