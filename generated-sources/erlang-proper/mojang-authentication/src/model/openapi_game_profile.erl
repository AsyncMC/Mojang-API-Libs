-module(openapi_game_profile).

-include("openapi.hrl").

-export([openapi_game_profile/0]).

-export_type([openapi_game_profile/0]).

-type openapi_game_profile() ::
  [ {'agent', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'userId', binary() }
  | {'createdAt', integer() }
  | {'legacyProfile', boolean() }
  | {'suspended', boolean() }
  | {'paid', boolean() }
  | {'migrated', boolean() }
  | {'legacy', boolean() }
  ].

openapi_game_profile() ->
  [ {'agent', binary() }
  , {'id', binary() }
  , {'name', binary() }
  , {'userId', binary() }
  , {'createdAt', integer() }
  , {'legacyProfile', boolean() }
  , {'suspended', boolean() }
  , {'paid', boolean() }
  , {'migrated', boolean() }
  , {'legacy', boolean() }
  ].
