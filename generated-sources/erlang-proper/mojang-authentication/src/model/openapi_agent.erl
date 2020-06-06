-module(openapi_agent).

-include("openapi.hrl").

-export([openapi_agent/0]).

-export_type([openapi_agent/0]).

-type openapi_agent() ::
  [ {'name', binary() }
  | {'version', integer() }
  ].

openapi_agent() ->
  [ {'name', elements([<<"Minecraft">>, <<"Scrolls">>]) }
  , {'version', integer() }
  ].
