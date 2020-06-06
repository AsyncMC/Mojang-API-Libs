-module(openapi_authentication_request).

-export([encode/1]).

-export_type([openapi_authentication_request/0]).

-type openapi_authentication_request() ::
    #{ 'username' := binary(),
       'password' := binary()
     }.

encode(#{ 'username' := Username,
          'password' := Password
        }) ->
    #{ 'username' => Username,
       'password' => Password
     }.
