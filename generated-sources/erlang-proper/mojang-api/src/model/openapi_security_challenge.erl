-module(openapi_security_challenge).

-include("openapi.hrl").

-export([openapi_security_challenge/0]).

-export_type([openapi_security_challenge/0]).

-type openapi_security_challenge() ::
  [ {'question', openapi_security_question:openapi_security_question() }
  | {'answer', openapi_security_answer_id:openapi_security_answer_id() }
  ].

openapi_security_challenge() ->
  [ {'question', openapi_security_question:openapi_security_question() }
  , {'answer', openapi_security_answer_id:openapi_security_answer_id() }
  ].
