-module(openapi_player_texture).

-export([encode/1]).

-export_type([openapi_player_texture/0]).

-type openapi_player_texture() ::
    #{ 'SKIN' => openapi_player_skin_url:openapi_player_skin_url(),
       'CAPE' => openapi_player_texture_url:openapi_player_texture_url()
     }.

encode(#{ 'SKIN' := SKIN,
          'CAPE' := CAPE
        }) ->
    #{ 'SKIN' => SKIN,
       'CAPE' => CAPE
     }.
