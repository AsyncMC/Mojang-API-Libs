-module(openapi_order_statistics_response).

-export([encode/1]).

-export_type([openapi_order_statistics_response/0]).

-type openapi_order_statistics_response() ::
    #{ 'total' := integer(),
       'last24h' := integer(),
       'saleVelocityPerSeconds' := float()
     }.

encode(#{ 'total' := Total,
          'last24h' := Last24h,
          'saleVelocityPerSeconds' := SaleVelocityPerSeconds
        }) ->
    #{ 'total' => Total,
       'last24h' => Last24h,
       'saleVelocityPerSeconds' => SaleVelocityPerSeconds
     }.
