-module(openapi_name_change).

-include("openapi.hrl").

-export([openapi_name_change/0]).

-export_type([openapi_name_change/0]).

-type openapi_name_change() ::
  [ {'name', binary() }
  | {'changedToAt', integer() }
  ].

openapi_name_change() ->
  [ {'name', binary() }
  , {'changedToAt', integer() }
  ].
