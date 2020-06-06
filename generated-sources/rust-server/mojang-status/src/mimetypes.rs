/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for CheckStatuses
    lazy_static! {
        pub static ref CHECK_STATUSES_AN_ARRAY_WITH_SERVICE_STATUS_KEY: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

}
