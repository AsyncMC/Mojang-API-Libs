-module(openapi_refresh_request).

-include("openapi.hrl").

-export([openapi_refresh_request/0]).

-export_type([openapi_refresh_request/0]).

-type openapi_refresh_request() ::
  [ {'accessToken', binary() }
  | {'clientToken', binary() }
  ].

openapi_refresh_request() ->
  [ {'accessToken', binary() }
  , {'clientToken', binary() }
  ].
