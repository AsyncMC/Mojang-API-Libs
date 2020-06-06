-module(openapi_inline_object_1).

-include("openapi.hrl").

-export([openapi_inline_object_1/0]).

-export_type([openapi_inline_object_1/0]).

-type openapi_inline_object_1() ::
  [ {'model', openapi_skin_model:openapi_skin_model() }
  | {'url', binary() }
  ].

openapi_inline_object_1() ->
  [ {'model', openapi_skin_model:openapi_skin_model() }
  , {'url', binary() }
  ].
