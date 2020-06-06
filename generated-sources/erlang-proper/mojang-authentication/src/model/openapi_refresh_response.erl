-module(openapi_refresh_response).

-include("openapi.hrl").

-export([openapi_refresh_response/0]).

-export_type([openapi_refresh_response/0]).

-type openapi_refresh_response() ::
  [ {'accessToken', binary() }
  | {'clientToken', binary() }
  ].

openapi_refresh_response() ->
  [ {'accessToken', binary() }
  , {'clientToken', binary() }
  ].
