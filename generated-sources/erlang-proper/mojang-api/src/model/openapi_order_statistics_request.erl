-module(openapi_order_statistics_request).

-include("openapi.hrl").

-export([openapi_order_statistics_request/0]).

-export_type([openapi_order_statistics_request/0]).

-type openapi_order_statistics_request() ::
  [ {'metricKeys', list(openapi_order_statistic:openapi_order_statistic()) }
  ].

openapi_order_statistics_request() ->
  [ {'metricKeys', list(openapi_order_statistic:openapi_order_statistic()) }
  ].
