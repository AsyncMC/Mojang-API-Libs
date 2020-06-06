-module(openapi_security_answer).

-export([encode/1]).

-export_type([openapi_security_answer/0]).

-type openapi_security_answer() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
