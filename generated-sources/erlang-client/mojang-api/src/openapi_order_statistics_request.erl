-module(openapi_order_statistics_request).

-export([encode/1]).

-export_type([openapi_order_statistics_request/0]).

-type openapi_order_statistics_request() ::
    #{ 'metricKeys' := list()
     }.

encode(#{ 'metricKeys' := MetricKeys
        }) ->
    #{ 'metricKeys' => MetricKeys
     }.
