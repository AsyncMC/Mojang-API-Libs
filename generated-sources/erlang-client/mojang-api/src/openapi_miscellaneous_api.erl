-module(openapi_miscellaneous_api).

-export([get_orders_statistics/2, get_orders_statistics/3]).

-define(BASE_URL, "").

%% @doc Get statistics on the sales of Minecraft.
%% 
-spec get_orders_statistics(ctx:ctx(), openapi_order_statistics_request:openapi_order_statistics_request()) -> {ok, openapi_order_statistics_response:openapi_order_statistics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_orders_statistics(Ctx, OpenapiOrderStatisticsRequest) ->
    get_orders_statistics(Ctx, OpenapiOrderStatisticsRequest, #{}).

-spec get_orders_statistics(ctx:ctx(), openapi_order_statistics_request:openapi_order_statistics_request(), maps:map()) -> {ok, openapi_order_statistics_response:openapi_order_statistics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_orders_statistics(Ctx, OpenapiOrderStatisticsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/orders/statistics"],
    QS = [],
    Headers = [],
    Body1 = OpenapiOrderStatisticsRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


