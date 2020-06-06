-module(openapi_player_profile).

-export([encode/1]).

-export_type([openapi_player_profile/0]).

-type openapi_player_profile() ::
    #{ 'id' := binary(),
       'name' := binary(),
       'legacy' => boolean(),
       'properties' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'legacy' := Legacy,
          'properties' := Properties
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'legacy' => Legacy,
       'properties' => Properties
     }.
