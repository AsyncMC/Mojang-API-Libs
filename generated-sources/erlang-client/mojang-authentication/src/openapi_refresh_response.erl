-module(openapi_refresh_response).

-export([encode/1]).

-export_type([openapi_refresh_response/0]).

-type openapi_refresh_response() ::
    #{ 'accessToken' := binary(),
       'clientToken' => binary()
     }.

encode(#{ 'accessToken' := AccessToken,
          'clientToken' := ClientToken
        }) ->
    #{ 'accessToken' => AccessToken,
       'clientToken' => ClientToken
     }.
