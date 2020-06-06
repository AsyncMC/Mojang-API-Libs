-module(openapi_session_api_error).

-include("openapi.hrl").

-export([openapi_session_api_error/0]).

-export_type([openapi_session_api_error/0]).

-type openapi_session_api_error() ::
  [ {'error', binary() }
  | {'path', binary() }
  ].

openapi_session_api_error() ->
  [ {'error', binary() }
  , {'path', binary() }
  ].
