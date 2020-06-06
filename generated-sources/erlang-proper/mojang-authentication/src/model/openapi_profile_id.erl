-module(openapi_profile_id).

-include("openapi.hrl").

-export([openapi_profile_id/0]).

-export_type([openapi_profile_id/0]).

-type openapi_profile_id() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].

openapi_profile_id() ->
  [ {'id', binary() }
  , {'name', binary() }
  ].
