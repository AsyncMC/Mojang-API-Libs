-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

%%==============================================================================
%% PropEr callbacks
%%==============================================================================

command(State) ->
  Funs0 = [ {F, list_to_atom(atom_to_list(F) ++ "_args")}
            || {F, _} <- ?MODULE:module_info(exports)
          ],

  Funs1 = [ X || {_, FArgs} = X <- Funs0,
                 erlang:function_exported(?MODULE, FArgs, 1)
          ],
  proper_types:oneof([ {call, ?MODULE, F, ?MODULE:FArgs(State)}
                       || {F, FArgs} <- Funs1
                     ]).

precondition(S, {call, M, F, Args}) ->
  Pre = list_to_atom(atom_to_list(F) ++ "_pre"),
  case erlang:function_exported(M, Pre, 1) of
    true  -> M:Pre(S);
    false -> true
  end
  andalso
  case erlang:function_exported(M, Pre, 2) of
    true  -> M:Pre(S, Args);
    false -> true
  end.

next_state(S, Res, {call, M, F, Args}) ->
  Next = list_to_atom(atom_to_list(F) ++ "_next"),
  case erlang:function_exported(M, Next, 3) of
    true  -> M:Next(S, Res, Args);
    false -> S
  end.

postcondition(S, {call, M, F, Args}, Res) ->
  Post = list_to_atom(atom_to_list(F) ++ "_post"),
  case erlang:function_exported(M, Post, 3) of
    true  -> M:Post(S, Args, Res);
    false -> true
  end.

%%==============================================================================
%% authenticate
%%==============================================================================

authenticate(OpenapiAuthenticationRequest) ->
  openapi_api:authenticate(OpenapiAuthenticationRequest).

authenticate_args(S) ->
  Args = [openapi_authentication_request:openapi_authentication_request()],
  case erlang:function_exported(?MODULE, 'authenticate_args_custom', 2) of
    true -> ?MODULE:authenticate_args_custom(S, Args);
    false -> Args
  end.

%%==============================================================================
%% invalidate
%%==============================================================================

invalidate(OpenapiAccessKeys) ->
  openapi_api:invalidate(OpenapiAccessKeys).

invalidate_args(S) ->
  Args = [openapi_access_keys:openapi_access_keys()],
  case erlang:function_exported(?MODULE, 'invalidate_args_custom', 2) of
    true -> ?MODULE:invalidate_args_custom(S, Args);
    false -> Args
  end.

%%==============================================================================
%% refresh
%%==============================================================================

refresh(OpenapiRefreshRequest) ->
  openapi_api:refresh(OpenapiRefreshRequest).

refresh_args(S) ->
  Args = [openapi_refresh_request:openapi_refresh_request()],
  case erlang:function_exported(?MODULE, 'refresh_args_custom', 2) of
    true -> ?MODULE:refresh_args_custom(S, Args);
    false -> Args
  end.

%%==============================================================================
%% siginout
%%==============================================================================

siginout(OpenapiUsernamePassword) ->
  openapi_api:siginout(OpenapiUsernamePassword).

siginout_args(S) ->
  Args = [openapi_username_password:openapi_username_password()],
  case erlang:function_exported(?MODULE, 'siginout_args_custom', 2) of
    true -> ?MODULE:siginout_args_custom(S, Args);
    false -> Args
  end.

%%==============================================================================
%% validate
%%==============================================================================

validate(OpenapiAccessKeys) ->
  openapi_api:validate(OpenapiAccessKeys).

validate_args(S) ->
  Args = [openapi_access_keys:openapi_access_keys()],
  case erlang:function_exported(?MODULE, 'validate_args_custom', 2) of
    true -> ?MODULE:validate_args_custom(S, Args);
    false -> Args
  end.


%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Include file with setup, cleanup, initial_state
%% and state transitions callbacks
%%==============================================================================
-include("openapi_statem.hrl").
