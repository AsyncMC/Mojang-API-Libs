-module(openapi_api_status).

-export([encode/1]).

-export_type([openapi_api_status/0]).

-type openapi_api_status() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
