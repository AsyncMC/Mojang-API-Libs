-module(openapi_profile_id).

-export([encode/1]).

-export_type([openapi_profile_id/0]).

-type openapi_profile_id() ::
    #{ 'id' := binary(),
       'name' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
