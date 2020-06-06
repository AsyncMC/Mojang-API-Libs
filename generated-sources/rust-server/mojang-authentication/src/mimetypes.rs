/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for Authenticate
    lazy_static! {
        pub static ref AUTHENTICATE_SUCCESSFULLY_AUTHENTICATED: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Authenticate
    lazy_static! {
        pub static ref AUTHENTICATE_COULD_NOT_AUTHENTICATE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Invalidate
    lazy_static! {
        pub static ref INVALIDATE_COULD_NOT_INVALIDATE_THE_TOKEN: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Refresh
    lazy_static! {
        pub static ref REFRESH_SESSION_REFRESHED_SUCCESSFULLY: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Refresh
    lazy_static! {
        pub static ref REFRESH_COULD_NOT_REFRESH_THE_SESSION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Siginout
    lazy_static! {
        pub static ref SIGINOUT_INVALID_USERNAME: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for Validate
    lazy_static! {
        pub static ref VALIDATE_THE_TOKEN_IS_NOT_VALID: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;
   /// Create Mime objects for the request content types for Authenticate
    lazy_static! {
        pub static ref AUTHENTICATE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for Invalidate
    lazy_static! {
        pub static ref INVALIDATE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for Refresh
    lazy_static! {
        pub static ref REFRESH: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for Siginout
    lazy_static! {
        pub static ref SIGINOUT: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for Validate
    lazy_static! {
        pub static ref VALIDATE: Mime = "application/json".parse().unwrap();
    }

}
