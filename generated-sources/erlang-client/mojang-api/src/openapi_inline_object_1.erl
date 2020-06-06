-module(openapi_inline_object_1).

-export([encode/1]).

-export_type([openapi_inline_object_1/0]).

-type openapi_inline_object_1() ::
    #{ 'model' => openapi_skin_model:openapi_skin_model(),
       'url' := binary()
     }.

encode(#{ 'model' := Model,
          'url' := Url
        }) ->
    #{ 'model' => Model,
       'url' => Url
     }.
