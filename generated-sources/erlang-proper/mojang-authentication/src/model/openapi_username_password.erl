-module(openapi_username_password).

-include("openapi.hrl").

-export([openapi_username_password/0]).

-export_type([openapi_username_password/0]).

-type openapi_username_password() ::
  [ {'username', binary() }
  | {'password', binary() }
  ].

openapi_username_password() ->
  [ {'username', binary() }
  , {'password', binary() }
  ].
