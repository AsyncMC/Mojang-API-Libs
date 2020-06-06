-module(openapi_player_profile).

-include("openapi.hrl").

-export([openapi_player_profile/0]).

-export_type([openapi_player_profile/0]).

-type openapi_player_profile() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'legacy', boolean() }
  | {'properties', list(openapi_player_profile_property:openapi_player_profile_property()) }
  ].

openapi_player_profile() ->
  [ {'id', binary() }
  , {'name', binary() }
  , {'legacy', boolean() }
  , {'properties', list(openapi_player_profile_property:openapi_player_profile_property()) }
  ].
