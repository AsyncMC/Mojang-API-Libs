-module(openapi_player_skin_url).

-include("openapi.hrl").

-export([openapi_player_skin_url/0]).

-export_type([openapi_player_skin_url/0]).

-type openapi_player_skin_url() ::
  [ {'url', binary() }
  ].

openapi_player_skin_url() ->
  [ {'url', binary() }
  ].
