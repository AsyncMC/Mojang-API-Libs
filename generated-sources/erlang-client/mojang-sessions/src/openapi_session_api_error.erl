-module(openapi_session_api_error).

-export([encode/1]).

-export_type([openapi_session_api_error/0]).

-type openapi_session_api_error() ::
    #{ 'error' => binary(),
       'path' => binary()
     }.

encode(#{ 'error' := Error,
          'path' := Path
        }) ->
    #{ 'error' => Error,
       'path' => Path
     }.
