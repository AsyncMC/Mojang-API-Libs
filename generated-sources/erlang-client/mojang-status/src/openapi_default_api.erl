-module(openapi_default_api).

-export([check_statuses/1, check_statuses/2]).

-define(BASE_URL, "").

%% @doc Checks the Mojang service statuses
%% 
-spec check_statuses(ctx:ctx()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_statuses(Ctx) ->
    check_statuses(Ctx, #{}).

-spec check_statuses(ctx:ctx(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_statuses(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/check"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


