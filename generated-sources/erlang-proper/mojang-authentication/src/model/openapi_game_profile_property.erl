-module(openapi_game_profile_property).

-include("openapi.hrl").

-export([openapi_game_profile_property/0]).

-export_type([openapi_game_profile_property/0]).

-type openapi_game_profile_property() ::
  [ {'name', binary() }
  | {'value', binary() }
  ].

openapi_game_profile_property() ->
  [ {'name', binary() }
  , {'value', binary() }
  ].
