-module(openapi_player_skin_metadata).

-export([encode/1]).

-export_type([openapi_player_skin_metadata/0]).

-type openapi_player_skin_metadata() ::
    #{ 'model' => binary()
     }.

encode(#{ 'model' := Model
        }) ->
    #{ 'model' => Model
     }.
