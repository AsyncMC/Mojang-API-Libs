-module(openapi_name_history_api).

-export([find_unique_ids_by_name/2, find_unique_ids_by_name/3,
         get_name_history/2, get_name_history/3,
         get_unique_id_by_name/2, get_unique_id_by_name/3]).

-define(BASE_URL, "").

%% @doc Find the current UUID of multiple players at once
%% Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
-spec find_unique_ids_by_name(ctx:ctx(), list()) -> {ok, [openapi_current_player_i_ds:openapi_current_player_i_ds()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
find_unique_ids_by_name(Ctx, Binary) ->
    find_unique_ids_by_name(Ctx, Binary, #{}).

-spec find_unique_ids_by_name(ctx:ctx(), list(), maps:map()) -> {ok, [openapi_current_player_i_ds:openapi_current_player_i_ds()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
find_unique_ids_by_name(Ctx, Binary, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/profiles/minecraft"],
    QS = [],
    Headers = [],
    Body1 = Binary,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Gets the full player's name history
%% 
-spec get_name_history(ctx:ctx(), binary()) -> {ok, [openapi_name_change:openapi_name_change()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_name_history(Ctx, StrippedUuid) ->
    get_name_history(Ctx, StrippedUuid, #{}).

-spec get_name_history(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_name_change:openapi_name_change()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_name_history(Ctx, StrippedUuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/profiles/", StrippedUuid, "/names"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Find the UUID by name
%% Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
-spec get_unique_id_by_name(ctx:ctx(), binary()) -> {ok, openapi_current_player_i_ds:openapi_current_player_i_ds(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_unique_id_by_name(Ctx, Username) ->
    get_unique_id_by_name(Ctx, Username, #{}).

-spec get_unique_id_by_name(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_current_player_i_ds:openapi_current_player_i_ds(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_unique_id_by_name(Ctx, Username, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/users/profiles/minecraft/", Username, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['at'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


