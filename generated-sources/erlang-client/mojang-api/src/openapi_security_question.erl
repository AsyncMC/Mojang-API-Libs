-module(openapi_security_question).

-export([encode/1]).

-export_type([openapi_security_question/0]).

-type openapi_security_question() ::
    #{ 'id' := integer(),
       'question' := binary()
     }.

encode(#{ 'id' := Id,
          'question' := Question
        }) ->
    #{ 'id' => Id,
       'question' => Question
     }.
