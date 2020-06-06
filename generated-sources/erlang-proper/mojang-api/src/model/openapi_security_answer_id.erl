-module(openapi_security_answer_id).

-include("openapi.hrl").

-export([openapi_security_answer_id/0]).

-export_type([openapi_security_answer_id/0]).

-type openapi_security_answer_id() ::
  [ {'id', integer() }
  ].

openapi_security_answer_id() ->
  [ {'id', integer() }
  ].
