-module(openapi_player_profile_texture_property_value).

-include("openapi.hrl").

-export([openapi_player_profile_texture_property_value/0]).

-export_type([openapi_player_profile_texture_property_value/0]).

-type openapi_player_profile_texture_property_value() ::
  [ {'timestamp', integer() }
  | {'profileId', binary() }
  | {'profileName', binary() }
  | {'signatureRequired', boolean() }
  | {'textures', openapi_player_texture:openapi_player_texture() }
  ].

openapi_player_profile_texture_property_value() ->
  [ {'timestamp', integer() }
  , {'profileId', binary() }
  , {'profileName', binary() }
  , {'signatureRequired', boolean() }
  , {'textures', openapi_player_texture:openapi_player_texture() }
  ].
