-module(openapi_refresh_request).

-export([encode/1]).

-export_type([openapi_refresh_request/0]).

-type openapi_refresh_request() ::
    #{ 'accessToken' := binary(),
       'clientToken' => binary()
     }.

encode(#{ 'accessToken' := AccessToken,
          'clientToken' := ClientToken
        }) ->
    #{ 'accessToken' => AccessToken,
       'clientToken' => ClientToken
     }.
