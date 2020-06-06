-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'GetOrdersStatistics' => #{
            path => "/orders/statistics",
            method => <<"POST">>,
            handler => 'openapi_miscellaneous_handler'
        },
        'FindUniqueIdsByName' => #{
            path => "/profiles/minecraft",
            method => <<"POST">>,
            handler => 'openapi_name_history_handler'
        },
        'GetNameHistory' => #{
            path => "/user/profiles/:stripped_uuid/names",
            method => <<"GET">>,
            handler => 'openapi_name_history_handler'
        },
        'GetUniqueIdByName' => #{
            path => "/users/profiles/minecraft/:username",
            method => <<"GET">>,
            handler => 'openapi_name_history_handler'
        },
        'CheckSecurityStatus' => #{
            path => "/user/security/location",
            method => <<"GET">>,
            handler => 'openapi_security_question_answer_handler'
        },
        'ListPendingSecurityQuestions' => #{
            path => "/user/security/challenges",
            method => <<"GET">>,
            handler => 'openapi_security_question_answer_handler'
        },
        'SendSecurityQuestionAnswers' => #{
            path => "/user/security/location",
            method => <<"POST">>,
            handler => 'openapi_security_question_answer_handler'
        },
        'ChangePlayerSkin' => #{
            path => "/user/profile/:stripped_uuid/skin",
            method => <<"POST">>,
            handler => 'openapi_skin_operations_handler'
        },
        'ResetPlayerSkin' => #{
            path => "/user/profile/:stripped_uuid/skin",
            method => <<"DELETE">>,
            handler => 'openapi_skin_operations_handler'
        },
        'UploadPlayerSkin' => #{
            path => "/user/profile/:stripped_uuid/skin",
            method => <<"PUT">>,
            handler => 'openapi_skin_operations_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


