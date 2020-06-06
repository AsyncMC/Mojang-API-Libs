-module(openapi_username_password).

-export([encode/1]).

-export_type([openapi_username_password/0]).

-type openapi_username_password() ::
    #{ 'username' := binary(),
       'password' := binary()
     }.

encode(#{ 'username' := Username,
          'password' := Password
        }) ->
    #{ 'username' => Username,
       'password' => Password
     }.
