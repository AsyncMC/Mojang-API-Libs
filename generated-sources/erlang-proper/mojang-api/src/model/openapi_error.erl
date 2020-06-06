-module(openapi_error).

-include("openapi.hrl").

-export([openapi_error/0]).

-export_type([openapi_error/0]).

-type openapi_error() ::
  [ {'error', binary() }
  | {'errorMessage', binary() }
  ].

openapi_error() ->
  [ {'error', binary() }
  , {'errorMessage', binary() }
  ].
