-module(openapi_security_question).

-include("openapi.hrl").

-export([openapi_security_question/0]).

-export_type([openapi_security_question/0]).

-type openapi_security_question() ::
  [ {'id', integer() }
  | {'question', binary() }
  ].

openapi_security_question() ->
  [ {'id', integer() }
  , {'question', binary() }
  ].
