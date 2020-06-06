-module(openapi_player_profile_property).

-export([encode/1]).

-export_type([openapi_player_profile_property/0]).

-type openapi_player_profile_property() ::
    #{ 'name' := binary(),
       'value' := openapi_byte_array:openapi_byte_array(),
       'signature' => openapi_byte_array:openapi_byte_array()
     }.

encode(#{ 'name' := Name,
          'value' := Value,
          'signature' := Signature
        }) ->
    #{ 'name' => Name,
       'value' => Value,
       'signature' => Signature
     }.
