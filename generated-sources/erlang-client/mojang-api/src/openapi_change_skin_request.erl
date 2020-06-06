-module(openapi_change_skin_request).

-export([encode/1]).

-export_type([openapi_change_skin_request/0]).

-type openapi_change_skin_request() ::
    #{ 'model' => openapi_skin_model:openapi_skin_model(),
       'url' := binary()
     }.

encode(#{ 'model' := Model,
          'url' := Url
        }) ->
    #{ 'model' => Model,
       'url' => Url
     }.
