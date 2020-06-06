/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for GetOrdersStatistics
    lazy_static! {
        pub static ref GET_ORDERS_STATISTICS_A_JSON_OBJECT_IS_RETURNED_WITH_THE_TOTAL_AMOUNT_OF_COPIES_SOLD: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FindUniqueIdsByName
    lazy_static! {
        pub static ref FIND_UNIQUE_IDS_BY_NAME_AN_ARRAY_CONTAINING_ALL_PLAYERS_FOUND: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetNameHistory
    lazy_static! {
        pub static ref GET_NAME_HISTORY_A_LIST_OF_NAME_CHANGES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetUniqueIdByName
    lazy_static! {
        pub static ref GET_UNIQUE_ID_BY_NAME_THE_USER_WAS_FOUND: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetUniqueIdByName
    lazy_static! {
        pub static ref GET_UNIQUE_ID_BY_NAME_IF_THE_TIMESTAMP_IS_INVALID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CheckSecurityStatus
    lazy_static! {
        pub static ref CHECK_SECURITY_STATUS_A_SECURITY_CHECK_IS_NEEDED_OR_THERE_IS_AN_OTHER_ISSUE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListPendingSecurityQuestions
    lazy_static! {
        pub static ref LIST_PENDING_SECURITY_QUESTIONS_A_LIST_OF_SECURITY_QUESTIONS_TO_BE_ANSWERED: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for SendSecurityQuestionAnswers
    lazy_static! {
        pub static ref SEND_SECURITY_QUESTION_ANSWERS_AT_LEAST_ONE_ANSWER_WE_NOT_ACCEPTED: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ChangePlayerSkin
    lazy_static! {
        pub static ref CHANGE_PLAYER_SKIN_UPON_ERROR_THE_SERVER_WILL_SEND_BACK_AJSON_WITH_THE_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ResetPlayerSkin
    lazy_static! {
        pub static ref RESET_PLAYER_SKIN_UPON_ERROR_THE_SERVER_WILL_SEND_BACK_AJSON_WITH_THE_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UploadPlayerSkin
    lazy_static! {
        pub static ref UPLOAD_PLAYER_SKIN_UPON_ERROR_THE_SERVER_WILL_SEND_BACK_AJSON_WITH_THE_ERROR: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;
   /// Create Mime objects for the request content types for GetOrdersStatistics
    lazy_static! {
        pub static ref GET_ORDERS_STATISTICS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for FindUniqueIdsByName
    lazy_static! {
        pub static ref FIND_UNIQUE_IDS_BY_NAME: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for SendSecurityQuestionAnswers
    lazy_static! {
        pub static ref SEND_SECURITY_QUESTION_ANSWERS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for ChangePlayerSkin
    lazy_static! {
        pub static ref CHANGE_PLAYER_SKIN: Mime = "application/x-www-form-urlencoded".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UploadPlayerSkin
    lazy_static! {
        pub static ref UPLOAD_PLAYER_SKIN: Mime = "multipart/form-data".parse().unwrap();
    }

}
