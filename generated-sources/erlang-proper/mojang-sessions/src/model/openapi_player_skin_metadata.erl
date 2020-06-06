-module(openapi_player_skin_metadata).

-include("openapi.hrl").

-export([openapi_player_skin_metadata/0]).

-export_type([openapi_player_skin_metadata/0]).

-type openapi_player_skin_metadata() ::
  [ {'model', binary() }
  ].

openapi_player_skin_metadata() ->
  [ {'model', elements([<<"slim">>]) }
  ].
