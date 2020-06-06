//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
                      GetOrdersStatisticsResponse,
                      FindUniqueIdsByNameResponse,
                      GetNameHistoryResponse,
                      GetUniqueIdByNameResponse,
                      CheckSecurityStatusResponse,
                      ListPendingSecurityQuestionsResponse,
                      SendSecurityQuestionAnswersResponse,
                      ChangePlayerSkinResponse,
                      ResetPlayerSkinResponse,
                      UploadPlayerSkinResponse
};
use openapi_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{

    /// Get statistics on the sales of Minecraft.
    fn get_orders_statistics(&self, order_statistics_request: models::OrderStatisticsRequest, context: &C) -> Box<Future<Item=GetOrdersStatisticsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_orders_statistics({:?}) - X-Span-ID: {:?}", order_statistics_request, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Find the current UUID of multiple players at once
    fn find_unique_ids_by_name(&self, string: &Vec<String>, context: &C) -> Box<Future<Item=FindUniqueIdsByNameResponse, Error=ApiError>> {
        let context = context.clone();
        println!("find_unique_ids_by_name({:?}) - X-Span-ID: {:?}", string, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Gets the full player's name history
    fn get_name_history(&self, stripped_uuid: String, context: &C) -> Box<Future<Item=GetNameHistoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_name_history(\"{}\") - X-Span-ID: {:?}", stripped_uuid, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Find the UUID by name
    fn get_unique_id_by_name(&self, username: String, at: Option<i64>, context: &C) -> Box<Future<Item=GetUniqueIdByNameResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_unique_id_by_name(\"{}\", {:?}) - X-Span-ID: {:?}", username, at, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Check if security questions are needed
    fn check_security_status(&self, context: &C) -> Box<Future<Item=CheckSecurityStatusResponse, Error=ApiError>> {
        let context = context.clone();
        println!("check_security_status() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get list of questions
    fn list_pending_security_questions(&self, context: &C) -> Box<Future<Item=ListPendingSecurityQuestionsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("list_pending_security_questions() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Send back the answers
    fn send_security_question_answers(&self, security_answer: &Vec<models::SecurityAnswer>, context: &C) -> Box<Future<Item=SendSecurityQuestionAnswersResponse, Error=ApiError>> {
        let context = context.clone();
        println!("send_security_question_answers({:?}) - X-Span-ID: {:?}", security_answer, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Changes the player skin by URL
    fn change_player_skin(&self, stripped_uuid: String, url: String, model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=ChangePlayerSkinResponse, Error=ApiError>> {
        let context = context.clone();
        println!("change_player_skin(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", stripped_uuid, url, model, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Resets the player skin to default
    fn reset_player_skin(&self, stripped_uuid: String, context: &C) -> Box<Future<Item=ResetPlayerSkinResponse, Error=ApiError>> {
        let context = context.clone();
        println!("reset_player_skin(\"{}\") - X-Span-ID: {:?}", stripped_uuid, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Changes the player skin by upload
    fn upload_player_skin(&self, stripped_uuid: String, file: swagger::ByteArray, model: Option<models::models::SkinModel>, context: &C) -> Box<Future<Item=UploadPlayerSkinResponse, Error=ApiError>> {
        let context = context.clone();
        println!("upload_player_skin(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", stripped_uuid, file, model, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
