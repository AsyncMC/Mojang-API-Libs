-module(openapi_current_player_i_ds).

-export([encode/1]).

-export_type([openapi_current_player_i_ds/0]).

-type openapi_current_player_i_ds() ::
    #{ 'id' := binary(),
       'name' := binary(),
       'legacy' => boolean(),
       'demo' => boolean()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'legacy' := Legacy,
          'demo' := Demo
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'legacy' => Legacy,
       'demo' => Demo
     }.
