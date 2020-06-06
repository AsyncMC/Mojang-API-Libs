-module(openapi_inline_object).

-include("openapi.hrl").

-export([openapi_inline_object/0]).

-export_type([openapi_inline_object/0]).

-type openapi_inline_object() ::
  [ {'model', openapi_skin_model:openapi_skin_model() }
  | {'file', binary() }
  ].

openapi_inline_object() ->
  [ {'model', openapi_skin_model:openapi_skin_model() }
  , {'file', binary() }
  ].
