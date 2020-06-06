-module(openapi_default_api).

-export([authenticate/2, authenticate/3,
         invalidate/2, invalidate/3,
         refresh/2, refresh/3,
         siginout/2, siginout/3,
         validate/2, validate/3]).

-define(BASE_URL, "").

%% @doc 
%% 
-spec authenticate(ctx:ctx(), openapi_authentication_request:openapi_authentication_request()) -> {ok, openapi_authentication:openapi_authentication(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
authenticate(Ctx, OpenapiAuthenticationRequest) ->
    authenticate(Ctx, OpenapiAuthenticationRequest, #{}).

-spec authenticate(ctx:ctx(), openapi_authentication_request:openapi_authentication_request(), maps:map()) -> {ok, openapi_authentication:openapi_authentication(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
authenticate(Ctx, OpenapiAuthenticationRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/authenticate"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAuthenticationRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec invalidate(ctx:ctx(), openapi_access_keys:openapi_access_keys()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
invalidate(Ctx, OpenapiAccessKeys) ->
    invalidate(Ctx, OpenapiAccessKeys, #{}).

-spec invalidate(ctx:ctx(), openapi_access_keys:openapi_access_keys(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
invalidate(Ctx, OpenapiAccessKeys, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/invalidate"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAccessKeys,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec refresh(ctx:ctx(), openapi_refresh_request:openapi_refresh_request()) -> {ok, openapi_refresh_response:openapi_refresh_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
refresh(Ctx, OpenapiRefreshRequest) ->
    refresh(Ctx, OpenapiRefreshRequest, #{}).

-spec refresh(ctx:ctx(), openapi_refresh_request:openapi_refresh_request(), maps:map()) -> {ok, openapi_refresh_response:openapi_refresh_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
refresh(Ctx, OpenapiRefreshRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/refresh"],
    QS = [],
    Headers = [],
    Body1 = OpenapiRefreshRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec siginout(ctx:ctx(), openapi_username_password:openapi_username_password()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
siginout(Ctx, OpenapiUsernamePassword) ->
    siginout(Ctx, OpenapiUsernamePassword, #{}).

-spec siginout(ctx:ctx(), openapi_username_password:openapi_username_password(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
siginout(Ctx, OpenapiUsernamePassword, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/signout"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUsernamePassword,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec validate(ctx:ctx(), openapi_access_keys:openapi_access_keys()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
validate(Ctx, OpenapiAccessKeys) ->
    validate(Ctx, OpenapiAccessKeys, #{}).

-spec validate(ctx:ctx(), openapi_access_keys:openapi_access_keys(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
validate(Ctx, OpenapiAccessKeys, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/validate"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAccessKeys,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


