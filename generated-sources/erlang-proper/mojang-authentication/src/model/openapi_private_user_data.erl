-module(openapi_private_user_data).

-include("openapi.hrl").

-export([openapi_private_user_data/0]).

-export_type([openapi_private_user_data/0]).

-type openapi_private_user_data() ::
  [ {'id', binary() }
  | {'properties', list(openapi_game_profile_property:openapi_game_profile_property()) }
  ].

openapi_private_user_data() ->
  [ {'id', binary() }
  , {'properties', list(openapi_game_profile_property:openapi_game_profile_property()) }
  ].
