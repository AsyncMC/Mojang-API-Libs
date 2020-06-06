-module(openapi_api_status).

-include("openapi.hrl").

-export([openapi_api_status/0]).

-export_type([openapi_api_status/0]).

-type openapi_api_status() ::
  binary().

openapi_api_status() ->
  elements([<<"green">>, <<"yellow">>, <<"red">>]).
  
