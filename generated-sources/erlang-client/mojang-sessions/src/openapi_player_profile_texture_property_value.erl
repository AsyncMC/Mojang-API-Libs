-module(openapi_player_profile_texture_property_value).

-export([encode/1]).

-export_type([openapi_player_profile_texture_property_value/0]).

-type openapi_player_profile_texture_property_value() ::
    #{ 'timestamp' := integer(),
       'profileId' := binary(),
       'profileName' := binary(),
       'signatureRequired' => boolean(),
       'textures' => openapi_player_texture:openapi_player_texture()
     }.

encode(#{ 'timestamp' := Timestamp,
          'profileId' := ProfileId,
          'profileName' := ProfileName,
          'signatureRequired' := SignatureRequired,
          'textures' := Textures
        }) ->
    #{ 'timestamp' => Timestamp,
       'profileId' => ProfileId,
       'profileName' => ProfileName,
       'signatureRequired' => SignatureRequired,
       'textures' => Textures
     }.
