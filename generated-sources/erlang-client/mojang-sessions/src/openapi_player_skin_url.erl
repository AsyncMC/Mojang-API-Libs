-module(openapi_player_skin_url).

-export([encode/1]).

-export_type([openapi_player_skin_url/0]).

-type openapi_player_skin_url() ::
    #{ 'url' := binary()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
