-module(openapi_security_answer_id).

-export([encode/1]).

-export_type([openapi_security_answer_id/0]).

-type openapi_security_answer_id() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
