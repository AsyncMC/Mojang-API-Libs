#![allow(missing_docs, unused_variables, trivial_casts)]

extern crate openapi_client;
#[allow(unused_extern_crates)]
extern crate futures;
#[allow(unused_extern_crates)]
#[macro_use]
extern crate swagger;
#[allow(unused_extern_crates)]
extern crate uuid;
extern crate clap;
extern crate tokio_core;

use swagger::{ContextBuilder, EmptyContext, XSpanIdString, Has, Push, AuthData};

#[allow(unused_imports)]
use futures::{Future, future, Stream, stream};
use tokio_core::reactor;
#[allow(unused_imports)]
use openapi_client::{ApiNoContext, ContextWrapperExt,
                      ApiError,
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
use clap::{App, Arg};

fn main() {
    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
    "FindUniqueIdsByName",
    "GetNameHistory",
    "GetUniqueIdByName",
    "CheckSecurityStatus",
    "ListPendingSecurityQuestions",
    "SendSecurityQuestionAnswers",
    "ChangePlayerSkin",
    "ResetPlayerSkin",
    "UploadPlayerSkin",
])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("api.mojang.com")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("80")
            .help("Port to contact"))
        .get_matches();

    let mut core = reactor::Core::new().unwrap();
    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());
    let client = if matches.is_present("https") {
        // Using Simple HTTPS
        openapi_client::Client::try_new_https(core.handle(), &base_url, "examples/ca.pem")
            .expect("Failed to create HTTPS client")
    } else {
        // Using HTTP
        openapi_client::Client::try_new_http(core.handle(), &base_url)
            .expect("Failed to create HTTP client")
    };

    let context: make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString) =
        make_context!(ContextBuilder, EmptyContext, None, XSpanIdString(self::uuid::Uuid::new_v4().to_string()));
    let client = client.with_context(context);

    match matches.value_of("operation") {

        // Disabled because there's no example.
        // Some("GetOrdersStatistics") => {
        //     let result = core.run(client.get_orders_statistics(???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("FindUniqueIdsByName") => {
            let result = core.run(client.find_unique_ids_by_name([ "joserobjr", "nonExistingPlayer", "maksimkurb" ]));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetNameHistory") => {
            let result = core.run(client.get_name_history("38ba542eb5924231a54cca0f2eac2b54".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetUniqueIdByName") => {
            let result = core.run(client.get_unique_id_by_name("LordofMC_Playerz".to_string(), Some(1448533942)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("CheckSecurityStatus") => {
            let result = core.run(client.check_security_status());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ListPendingSecurityQuestions") => {
            let result = core.run(client.list_pending_security_questions());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("SendSecurityQuestionAnswers") => {
            let result = core.run(client.send_security_question_answers(&Vec::new()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ChangePlayerSkin") => {
            let result = core.run(client.change_player_skin("38ba542eb5924231a54cca0f2eac2b54".to_string(), "url_example".to_string(), None));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ResetPlayerSkin") => {
            let result = core.run(client.reset_player_skin("38ba542eb5924231a54cca0f2eac2b54".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("UploadPlayerSkin") => {
            let result = core.run(client.upload_player_skin("38ba542eb5924231a54cca0f2eac2b54".to_string(), swagger::ByteArray(Vec::from("BINARY_DATA_HERE")), None));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        _ => {
            panic!("Invalid operation provided")
        }
    }
}

