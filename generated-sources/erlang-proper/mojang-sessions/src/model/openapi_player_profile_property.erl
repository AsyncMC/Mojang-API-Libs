-module(openapi_player_profile_property).

-include("openapi.hrl").

-export([openapi_player_profile_property/0]).

-export_type([openapi_player_profile_property/0]).

-type openapi_player_profile_property() ::
  [ {'name', binary() }
  | {'value', openapi_byte_array:openapi_byte_array() }
  | {'signature', openapi_byte_array:openapi_byte_array() }
  ].

openapi_player_profile_property() ->
  [ {'name', binary() }
  , {'value', binary() }
  , {'signature', binary() }
  ].
