-module(openapi_security_question_answer_api).

-export([check_security_status/1, check_security_status/2,
         list_pending_security_questions/1, list_pending_security_questions/2,
         send_security_question_answers/2, send_security_question_answers/3]).

-define(BASE_URL, "").

%% @doc Check if security questions are needed
%% 
-spec check_security_status(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_security_status(Ctx) ->
    check_security_status(Ctx, #{}).

-spec check_security_status(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_security_status(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/security/location"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get list of questions
%% 
-spec list_pending_security_questions(ctx:ctx()) -> {ok, [openapi_security_challenge:openapi_security_challenge()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_pending_security_questions(Ctx) ->
    list_pending_security_questions(Ctx, #{}).

-spec list_pending_security_questions(ctx:ctx(), maps:map()) -> {ok, [openapi_security_challenge:openapi_security_challenge()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_pending_security_questions(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/security/challenges"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Send back the answers
%% 
-spec send_security_question_answers(ctx:ctx(), list()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
send_security_question_answers(Ctx, OpenapiSecurityAnswerArray) ->
    send_security_question_answers(Ctx, OpenapiSecurityAnswerArray, #{}).

-spec send_security_question_answers(ctx:ctx(), list(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
send_security_question_answers(Ctx, OpenapiSecurityAnswerArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/user/security/location"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSecurityAnswerArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


