-module(openapi_upload_skin_request).

-export([encode/1]).

-export_type([openapi_upload_skin_request/0]).

-type openapi_upload_skin_request() ::
    #{ 'model' => openapi_skin_model:openapi_skin_model(),
       'file' := binary()
     }.

encode(#{ 'model' := Model,
          'file' := File
        }) ->
    #{ 'model' => Model,
       'file' => File
     }.
