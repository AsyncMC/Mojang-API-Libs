-module(openapi_game_profile_property).

-export([encode/1]).

-export_type([openapi_game_profile_property/0]).

-type openapi_game_profile_property() ::
    #{ 'name' => binary(),
       'value' => binary()
     }.

encode(#{ 'name' := Name,
          'value' := Value
        }) ->
    #{ 'name' => Name,
       'value' => Value
     }.
