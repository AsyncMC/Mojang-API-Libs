-module(openapi_error).

-export([encode/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
    #{ 'error' => binary(),
       'errorMessage' => binary()
     }.

encode(#{ 'error' := Error,
          'errorMessage' := ErrorMessage
        }) ->
    #{ 'error' => Error,
       'errorMessage' => ErrorMessage
     }.
