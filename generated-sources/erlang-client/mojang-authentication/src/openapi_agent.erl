-module(openapi_agent).

-export([encode/1]).

-export_type([openapi_agent/0]).

-type openapi_agent() ::
    #{ 'name' => binary(),
       'version' => integer()
     }.

encode(#{ 'name' := Name,
          'version' := Version
        }) ->
    #{ 'name' => Name,
       'version' => Version
     }.
