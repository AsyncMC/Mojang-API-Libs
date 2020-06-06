#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
extern crate serde;
#[macro_use]
extern crate serde_derive;
extern crate serde_json;


extern crate futures;
extern crate chrono;
#[macro_use]
extern crate lazy_static;
#[macro_use]
extern crate log;

// Logically this should be in the client and server modules, but rust doesn't allow `macro_use` from a module.
#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate hyper;

extern crate swagger;

#[macro_use]
extern crate url;

use futures::Stream;
use std::io::Error;

#[allow(unused_imports)]
use std::collections::HashMap;

pub use futures::Future;

#[cfg(any(feature = "client", feature = "server"))]
mod mimetypes;

pub use swagger::{ApiError, ContextWrapper};

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "2020-06-05.0.0";


#[derive(Debug, PartialEq)]
pub enum GetOrdersStatisticsResponse {
    /// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
    AJsonObjectIsReturnedWithTheTotalAmountOfCopiesSold ( models::OrderStatisticsResponse ) ,
}

#[derive(Debug, PartialEq)]
pub enum FindUniqueIdsByNameResponse {
    /// An array containing all players found
    AnArrayContainingAllPlayersFound ( Vec<models::CurrentPlayerIDs> ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetNameHistoryResponse {
    /// A list of name changes, the first entry usually don't have a change time
    AListOfNameChanges ( Vec<models::NameChange> ) ,
    /// Username not found at the given time
    UsernameNotFoundAtTheGivenTime ,
}

#[derive(Debug, PartialEq)]
pub enum GetUniqueIdByNameResponse {
    /// The user was found
    TheUserWasFound ( models::CurrentPlayerIDs ) ,
    /// User not found
    UserNotFound ,
    /// If the timestamp is invalid
    IfTheTimestampIsInvalid ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum CheckSecurityStatusResponse {
    /// No check is needed.
    NoCheckIsNeeded ,
    /// A security check is needed or there is an other issue
    ASecurityCheckIsNeededOrThereIsAnOtherIssue ( Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum ListPendingSecurityQuestionsResponse {
    /// A list of security questions to be answered
    AListOfSecurityQuestionsToBeAnswered ( Vec<models::SecurityChallenge> ) ,
}

#[derive(Debug, PartialEq)]
pub enum SendSecurityQuestionAnswersResponse {
    /// The answers were accepted
    TheAnswersWereAccepted ,
    /// At least one answer we not accepted
    AtLeastOneAnswerWeNotAccepted ( Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum ChangePlayerSkinResponse {
    /// The skin has been changed. The response has no body
    TheSkinHasBeenChanged ,
    /// Upon error the server will send back a JSON with the error. (Success is a blank payload)
    UponErrorTheServerWillSendBackAJSONWithTheError ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum ResetPlayerSkinResponse {
    /// The skin has been changed. The response has no body
    TheSkinHasBeenChanged ,
    /// Upon error the server will send back a JSON with the error. (Success is a blank payload)
    UponErrorTheServerWillSendBackAJSONWithTheError ( models::Error ) ,
}

#[derive(Debug, PartialEq)]
pub enum UploadPlayerSkinResponse {
    /// The skin has been changed. The response has no body
    TheSkinHasBeenChanged ,
    /// Upon error the server will send back a JSON with the error. (Success is a blank payload)
    UponErrorTheServerWillSendBackAJSONWithTheError ( models::Error ) ,
}


/// API
pub trait Api<C> {

    /// Get statistics on the sales of Minecraft.
    fn get_orders_statistics(&self, order_statistics_request: models::OrderStatisticsRequest, context: &C) -> Box<Future<Item=GetOrdersStatisticsResponse, Error=ApiError>>;

    /// Find the current UUID of multiple players at once
    fn find_unique_ids_by_name(&self, string: &Vec<String>, context: &C) -> Box<Future<Item=FindUniqueIdsByNameResponse, Error=ApiError>>;

    /// Gets the full player's name history
    fn get_name_history(&self, stripped_uuid: String, context: &C) -> Box<Future<Item=GetNameHistoryResponse, Error=ApiError>>;

    /// Find the UUID by name
    fn get_unique_id_by_name(&self, username: String, at: Option<i64>, context: &C) -> Box<Future<Item=GetUniqueIdByNameResponse, Error=ApiError>>;

    /// Check if security questions are needed
    fn check_security_status(&self, context: &C) -> Box<Future<Item=CheckSecurityStatusResponse, Error=ApiError>>;

    /// Get list of questions
    fn list_pending_security_questions(&self, context: &C) -> Box<Future<Item=ListPendingSecurityQuestionsResponse, Error=ApiError>>;

    /// Send back the answers
    fn send_security_question_answers(&self, security_answer: &Vec<models::SecurityAnswer>, context: &C) -> Box<Future<Item=SendSecurityQuestionAnswersResponse, Error=ApiError>>;

    /// Changes the player skin by URL
    fn change_player_skin(&self, stripped_uuid: String, url: String, model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=ChangePlayerSkinResponse, Error=ApiError>>;

    /// Resets the player skin to default
    fn reset_player_skin(&self, stripped_uuid: String, context: &C) -> Box<Future<Item=ResetPlayerSkinResponse, Error=ApiError>>;

    /// Changes the player skin by upload
    fn upload_player_skin(&self, stripped_uuid: String, file: swagger::ByteArray, model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=UploadPlayerSkinResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {

    /// Get statistics on the sales of Minecraft.
    fn get_orders_statistics(&self, order_statistics_request: models::OrderStatisticsRequest) -> Box<Future<Item=GetOrdersStatisticsResponse, Error=ApiError>>;

    /// Find the current UUID of multiple players at once
    fn find_unique_ids_by_name(&self, string: &Vec<String>) -> Box<Future<Item=FindUniqueIdsByNameResponse, Error=ApiError>>;

    /// Gets the full player's name history
    fn get_name_history(&self, stripped_uuid: String) -> Box<Future<Item=GetNameHistoryResponse, Error=ApiError>>;

    /// Find the UUID by name
    fn get_unique_id_by_name(&self, username: String, at: Option<i64>) -> Box<Future<Item=GetUniqueIdByNameResponse, Error=ApiError>>;

    /// Check if security questions are needed
    fn check_security_status(&self) -> Box<Future<Item=CheckSecurityStatusResponse, Error=ApiError>>;

    /// Get list of questions
    fn list_pending_security_questions(&self) -> Box<Future<Item=ListPendingSecurityQuestionsResponse, Error=ApiError>>;

    /// Send back the answers
    fn send_security_question_answers(&self, security_answer: &Vec<models::SecurityAnswer>) -> Box<Future<Item=SendSecurityQuestionAnswersResponse, Error=ApiError>>;

    /// Changes the player skin by URL
    fn change_player_skin(&self, stripped_uuid: String, url: String, model: Option<models::models::SkinModel>) -> Box<Future<Item=ChangePlayerSkinResponse, Error=ApiError>>;

    /// Resets the player skin to default
    fn reset_player_skin(&self, stripped_uuid: String) -> Box<Future<Item=ResetPlayerSkinResponse, Error=ApiError>>;

    /// Changes the player skin by upload
    fn upload_player_skin(&self, stripped_uuid: String, file: swagger::ByteArray, model: Option<models::models::SkinModel>) -> Box<Future<Item=UploadPlayerSkinResponse, Error=ApiError>>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {

    /// Get statistics on the sales of Minecraft.
    fn get_orders_statistics(&self, order_statistics_request: models::OrderStatisticsRequest) -> Box<Future<Item=GetOrdersStatisticsResponse, Error=ApiError>> {
        self.api().get_orders_statistics(order_statistics_request, &self.context())
    }

    /// Find the current UUID of multiple players at once
    fn find_unique_ids_by_name(&self, string: &Vec<String>) -> Box<Future<Item=FindUniqueIdsByNameResponse, Error=ApiError>> {
        self.api().find_unique_ids_by_name(string, &self.context())
    }

    /// Gets the full player's name history
    fn get_name_history(&self, stripped_uuid: String) -> Box<Future<Item=GetNameHistoryResponse, Error=ApiError>> {
        self.api().get_name_history(stripped_uuid, &self.context())
    }

    /// Find the UUID by name
    fn get_unique_id_by_name(&self, username: String, at: Option<i64>) -> Box<Future<Item=GetUniqueIdByNameResponse, Error=ApiError>> {
        self.api().get_unique_id_by_name(username, at, &self.context())
    }

    /// Check if security questions are needed
    fn check_security_status(&self) -> Box<Future<Item=CheckSecurityStatusResponse, Error=ApiError>> {
        self.api().check_security_status(&self.context())
    }

    /// Get list of questions
    fn list_pending_security_questions(&self) -> Box<Future<Item=ListPendingSecurityQuestionsResponse, Error=ApiError>> {
        self.api().list_pending_security_questions(&self.context())
    }

    /// Send back the answers
    fn send_security_question_answers(&self, security_answer: &Vec<models::SecurityAnswer>) -> Box<Future<Item=SendSecurityQuestionAnswersResponse, Error=ApiError>> {
        self.api().send_security_question_answers(security_answer, &self.context())
    }

    /// Changes the player skin by URL
    fn change_player_skin(&self, stripped_uuid: String, url: String, model: Option<models::models::SkinModel>) -> Box<Future<Item=ChangePlayerSkinResponse, Error=ApiError>> {
        self.api().change_player_skin(stripped_uuid, url, model, &self.context())
    }

    /// Resets the player skin to default
    fn reset_player_skin(&self, stripped_uuid: String) -> Box<Future<Item=ResetPlayerSkinResponse, Error=ApiError>> {
        self.api().reset_player_skin(stripped_uuid, &self.context())
    }

    /// Changes the player skin by upload
    fn upload_player_skin(&self, stripped_uuid: String, file: swagger::ByteArray, model: Option<models::models::SkinModel>) -> Box<Future<Item=UploadPlayerSkinResponse, Error=ApiError>> {
        self.api().upload_player_skin(stripped_uuid, file, model, &self.context())
    }

}

#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use self::client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

pub mod models;
