-module(openapi_player_texture).

-include("openapi.hrl").

-export([openapi_player_texture/0]).

-export_type([openapi_player_texture/0]).

-type openapi_player_texture() ::
  [ {'SKIN', openapi_player_skin_url:openapi_player_skin_url() }
  | {'CAPE', openapi_player_texture_url:openapi_player_texture_url() }
  ].

openapi_player_texture() ->
  [ {'SKIN', openapi_player_skin_url:openapi_player_skin_url() }
  , {'CAPE', openapi_player_texture_url:openapi_player_texture_url() }
  ].
