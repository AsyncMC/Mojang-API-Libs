-module(openapi_login_api).

-export([get_player_profile/2, get_player_profile/3]).

-define(BASE_URL, "").

%% @doc Gets the player's game profile
%% This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
-spec get_player_profile(ctx:ctx(), binary()) -> {ok, openapi_player_profile:openapi_player_profile(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_player_profile(Ctx, StrippedUuid) ->
    get_player_profile(Ctx, StrippedUuid, #{}).

-spec get_player_profile(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_player_profile:openapi_player_profile(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_player_profile(Ctx, StrippedUuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/session/minecraft/profile/", StrippedUuid, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['unsigned'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


