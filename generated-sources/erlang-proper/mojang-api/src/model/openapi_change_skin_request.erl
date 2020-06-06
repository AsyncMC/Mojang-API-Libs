-module(openapi_change_skin_request).

-include("openapi.hrl").

-export([openapi_change_skin_request/0]).

-export_type([openapi_change_skin_request/0]).

-type openapi_change_skin_request() ::
  [ {'model', openapi_skin_model:openapi_skin_model() }
  | {'url', binary() }
  ].

openapi_change_skin_request() ->
  [ {'model', openapi_skin_model:openapi_skin_model() }
  , {'url', binary() }
  ].
