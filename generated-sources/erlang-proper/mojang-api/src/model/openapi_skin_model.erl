-module(openapi_skin_model).

-include("openapi.hrl").

-export([openapi_skin_model/0]).

-export_type([openapi_skin_model/0]).

-type openapi_skin_model() ::
  binary().

openapi_skin_model() ->
  elements([<<"">>, <<"slim">>]).
  
