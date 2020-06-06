-module(openapi_access_keys).

-export([encode/1]).

-export_type([openapi_access_keys/0]).

-type openapi_access_keys() ::
    #{ 'accessToken' := binary(),
       'clientToken' => binary()
     }.

encode(#{ 'accessToken' := AccessToken,
          'clientToken' := ClientToken
        }) ->
    #{ 'accessToken' => AccessToken,
       'clientToken' => ClientToken
     }.
