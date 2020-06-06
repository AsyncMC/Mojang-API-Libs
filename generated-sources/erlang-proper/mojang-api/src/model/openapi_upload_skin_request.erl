-module(openapi_upload_skin_request).

-include("openapi.hrl").

-export([openapi_upload_skin_request/0]).

-export_type([openapi_upload_skin_request/0]).

-type openapi_upload_skin_request() ::
  [ {'model', openapi_skin_model:openapi_skin_model() }
  | {'file', binary() }
  ].

openapi_upload_skin_request() ->
  [ {'model', openapi_skin_model:openapi_skin_model() }
  , {'file', binary() }
  ].
