-module(openapi_reduced_user_data).

-export([encode/1]).

-export_type([openapi_reduced_user_data/0]).

-type openapi_reduced_user_data() ::
    #{ 'id' => binary(),
       'properties' => list()
     }.

encode(#{ 'id' := Id,
          'properties' := Properties
        }) ->
    #{ 'id' => Id,
       'properties' => Properties
     }.
