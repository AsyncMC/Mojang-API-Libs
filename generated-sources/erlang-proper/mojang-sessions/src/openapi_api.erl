-module(openapi_api).

-export([ get_player_profile/1
        ]).

-define(BASE_URL, "").

%% @doc Gets the player's game profile
%% This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
-spec get_player_profile(binary()) ->
  openapi_utils:response().
get_player_profile(StrippedUuid) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/session/minecraft/profile/", StrippedUuid, ""],
  Body        = [],
  ContentType = <<"text/plain">>,
  QueryString = [<<"unsigned=">>, Unsigned, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

