-module(openapi_authentication).

-include("openapi.hrl").

-export([openapi_authentication/0]).

-export_type([openapi_authentication/0]).

-type openapi_authentication() ::
  [ {'accessToken', binary() }
  | {'clientToken', binary() }
  ].

openapi_authentication() ->
  [ {'accessToken', binary() }
  , {'clientToken', binary() }
  ].
