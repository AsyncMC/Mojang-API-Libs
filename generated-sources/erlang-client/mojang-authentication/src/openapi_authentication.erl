-module(openapi_authentication).

-export([encode/1]).

-export_type([openapi_authentication/0]).

-type openapi_authentication() ::
    #{ 'accessToken' := binary(),
       'clientToken' => binary()
     }.

encode(#{ 'accessToken' := AccessToken,
          'clientToken' := ClientToken
        }) ->
    #{ 'accessToken' => AccessToken,
       'clientToken' => ClientToken
     }.
