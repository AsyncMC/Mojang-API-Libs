-module(openapi_order_statistics_response).

-include("openapi.hrl").

-export([openapi_order_statistics_response/0]).

-export_type([openapi_order_statistics_response/0]).

-type openapi_order_statistics_response() ::
  [ {'total', integer() }
  | {'last24h', integer() }
  | {'saleVelocityPerSeconds', float() }
  ].

openapi_order_statistics_response() ->
  [ {'total', integer() }
  , {'last24h', integer() }
  , {'saleVelocityPerSeconds', float() }
  ].
