-module(openapi_skin_operations_api).

-export([change_player_skin/3, change_player_skin/4,
         reset_player_skin/2, reset_player_skin/3,
         upload_player_skin/3, upload_player_skin/4]).

-define(BASE_URL, "").

%% @doc Changes the player skin by URL
%% This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
-spec change_player_skin(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
change_player_skin(Ctx, StrippedUuid, Url) ->
    change_player_skin(Ctx, StrippedUuid, Url, #{}).

-spec change_player_skin(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
change_player_skin(Ctx, StrippedUuid, Url, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/user/profile/", StrippedUuid, "/skin"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"url">>, Url}]++openapi_utils:optional_params(['model'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/x-www-form-urlencoded">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Resets the player skin to default
%% 
-spec reset_player_skin(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reset_player_skin(Ctx, StrippedUuid) ->
    reset_player_skin(Ctx, StrippedUuid, #{}).

-spec reset_player_skin(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reset_player_skin(Ctx, StrippedUuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/user/profile/", StrippedUuid, "/skin"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Changes the player skin by upload
%% This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
-spec upload_player_skin(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_player_skin(Ctx, StrippedUuid, File) ->
    upload_player_skin(Ctx, StrippedUuid, File, #{}).

-spec upload_player_skin(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_player_skin(Ctx, StrippedUuid, File, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/user/profile/", StrippedUuid, "/skin"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}]++openapi_utils:optional_params(['model'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


