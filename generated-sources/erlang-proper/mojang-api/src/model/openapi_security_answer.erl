-module(openapi_security_answer).

-include("openapi.hrl").

-export([openapi_security_answer/0]).

-export_type([openapi_security_answer/0]).

-type openapi_security_answer() ::
  [ {'id', integer() }
  ].

openapi_security_answer() ->
  [ {'id', integer() }
  ].
