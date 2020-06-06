-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('GetOrdersStatistics') ->
    [
        'OrderStatisticsRequest'
    ];


request_params('FindUniqueIdsByName') ->
    [
        'list'
    ];

request_params('GetNameHistory') ->
    [
        'stripped_uuid'
    ];

request_params('GetUniqueIdByName') ->
    [
        'username',
        'at'
    ];


request_params('CheckSecurityStatus') ->
    [
    ];

request_params('ListPendingSecurityQuestions') ->
    [
    ];

request_params('SendSecurityQuestionAnswers') ->
    [
        'list'
    ];


request_params('ChangePlayerSkin') ->
    [
        'stripped_uuid',
        'url',
        'model'
    ];

request_params('ResetPlayerSkin') ->
    [
        'stripped_uuid'
    ];

request_params('UploadPlayerSkin') ->
    [
        'stripped_uuid',
        'file',
        'model'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('GetOrdersStatistics', 'OrderStatisticsRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('FindUniqueIdsByName', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetNameHistory', 'stripped_uuid') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetUniqueIdByName', 'username') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetUniqueIdByName', 'at') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };


request_param_info('SendSecurityQuestionAnswers', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('ChangePlayerSkin', 'stripped_uuid') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ChangePlayerSkin', 'url') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ChangePlayerSkin', 'model') ->
    #{
        source =>   body,
        rules => [
            not_required
        ]
    };

request_param_info('ResetPlayerSkin', 'stripped_uuid') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadPlayerSkin', 'stripped_uuid') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadPlayerSkin', 'file') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadPlayerSkin', 'model') ->
    #{
        source =>   body,
        rules => [
            not_required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('GetOrdersStatistics', 200, Body, ValidatorState) ->
    validate_response_body('OrderStatisticsResponse', 'OrderStatisticsResponse', Body, ValidatorState);


validate_response('FindUniqueIdsByName', 200, Body, ValidatorState) ->
    validate_response_body('list', 'CurrentPlayerIDs', Body, ValidatorState);

validate_response('GetNameHistory', 200, Body, ValidatorState) ->
    validate_response_body('list', 'NameChange', Body, ValidatorState);
validate_response('GetNameHistory', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetUniqueIdByName', 200, Body, ValidatorState) ->
    validate_response_body('CurrentPlayerIDs', 'CurrentPlayerIDs', Body, ValidatorState);
validate_response('GetUniqueIdByName', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('GetUniqueIdByName', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CheckSecurityStatus', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('CheckSecurityStatus', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ListPendingSecurityQuestions', 200, Body, ValidatorState) ->
    validate_response_body('list', 'SecurityChallenge', Body, ValidatorState);

validate_response('SendSecurityQuestionAnswers', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('SendSecurityQuestionAnswers', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('ChangePlayerSkin', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('ChangePlayerSkin', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ResetPlayerSkin', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('ResetPlayerSkin', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UploadPlayerSkin', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('UploadPlayerSkin', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/definitions/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} | 
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req0) ->
    {QS, Req} = cowboy_req:qs_vals(Req0),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req0) ->
    {Headers, Req} = cowboy_req:headers(Req0),
    Value = openapi_utils:get_opt(openapi_utils:to_header(Name), Headers),
    {Value, Req};

get_value(binding, Name, Req0) ->
    {Bindings, Req} = cowboy_req:bindings(Req0),
    Value = openapi_utils:get_opt(openapi_utils:to_binding(Name), Bindings),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps]) 
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
