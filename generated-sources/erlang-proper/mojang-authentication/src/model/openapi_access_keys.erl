-module(openapi_access_keys).

-include("openapi.hrl").

-export([openapi_access_keys/0]).

-export_type([openapi_access_keys/0]).

-type openapi_access_keys() ::
  [ {'accessToken', binary() }
  | {'clientToken', binary() }
  ].

openapi_access_keys() ->
  [ {'accessToken', binary() }
  , {'clientToken', binary() }
  ].
