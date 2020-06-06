-module(openapi_current_player_i_ds).

-include("openapi.hrl").

-export([openapi_current_player_i_ds/0]).

-export_type([openapi_current_player_i_ds/0]).

-type openapi_current_player_i_ds() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'legacy', boolean() }
  | {'demo', boolean() }
  ].

openapi_current_player_i_ds() ->
  [ {'id', binary() }
  , {'name', binary() }
  , {'legacy', boolean() }
  , {'demo', boolean() }
  ].
