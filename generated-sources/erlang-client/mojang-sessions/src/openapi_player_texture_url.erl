-module(openapi_player_texture_url).

-export([encode/1]).

-export_type([openapi_player_texture_url/0]).

-type openapi_player_texture_url() ::
    #{ 'url' := binary()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
