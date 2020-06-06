/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for GetBlockedServerHashes
    lazy_static! {
        pub static ref GET_BLOCKED_SERVER_HASHES_A_LIST_OF_SHA: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPlayerProfile
    lazy_static! {
        pub static ref GET_PLAYER_PROFILE_THE_PLAYER_PROFILE_AND_ALL_PROPERTIES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPlayerProfile
    lazy_static! {
        pub static ref GET_PLAYER_PROFILE_UUID_IS_INVALID: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

}
