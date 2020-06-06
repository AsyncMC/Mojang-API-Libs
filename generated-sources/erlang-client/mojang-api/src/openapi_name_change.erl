-module(openapi_name_change).

-export([encode/1]).

-export_type([openapi_name_change/0]).

-type openapi_name_change() ::
    #{ 'name' := binary(),
       'changedToAt' => integer()
     }.

encode(#{ 'name' := Name,
          'changedToAt' := ChangedToAt
        }) ->
    #{ 'name' => Name,
       'changedToAt' => ChangedToAt
     }.
