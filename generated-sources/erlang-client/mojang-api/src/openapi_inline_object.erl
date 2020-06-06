-module(openapi_inline_object).

-export([encode/1]).

-export_type([openapi_inline_object/0]).

-type openapi_inline_object() ::
    #{ 'model' => openapi_skin_model:openapi_skin_model(),
       'file' := binary()
     }.

encode(#{ 'model' := Model,
          'file' := File
        }) ->
    #{ 'model' => Model,
       'file' => File
     }.
