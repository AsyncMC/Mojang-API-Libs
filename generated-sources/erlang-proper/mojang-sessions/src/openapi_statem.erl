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
%% get_player_profile
%%==============================================================================

get_player_profile(StrippedUuid) ->
  openapi_api:get_player_profile(StrippedUuid).

get_player_profile_args(S) ->
  Args = [binary()],
  case erlang:function_exported(?MODULE, 'get_player_profile_args_custom', 2) of
    true -> ?MODULE:get_player_profile_args_custom(S, Args);
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
