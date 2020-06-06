-module(openapi_authentication_request).

-include("openapi.hrl").

-export([openapi_authentication_request/0]).

-export_type([openapi_authentication_request/0]).

-type openapi_authentication_request() ::
  [ {'username', binary() }
  | {'password', binary() }
  ].

openapi_authentication_request() ->
  [ {'username', binary() }
  , {'password', binary() }
  ].
