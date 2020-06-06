-module(openapi_api).

-export([ change_player_skin/2
        , reset_player_skin/1
        , upload_player_skin/2
        ]).

-define(BASE_URL, "").

%% @doc Changes the player skin by URL
%% This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
-spec change_player_skin(binary(), binary()) ->
  openapi_utils:response().
change_player_skin(StrippedUuid, Url) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user/profile/", StrippedUuid, "/skin"],
  Body        = {form, [, {<<"url">>, Url]++openapi_utils:optional_params(['model'], _OptionalParams)},
  ContentType = hd(["application/x-www-form-urlencoded"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Resets the player skin to default
%% 
-spec reset_player_skin(binary()) ->
  openapi_utils:response().
reset_player_skin(StrippedUuid) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user/profile/", StrippedUuid, "/skin"],
  Body        = [],
  ContentType = <<"text/plain">>,

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Changes the player skin by upload
%% This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
-spec upload_player_skin(binary(), binary()) ->
  openapi_utils:response().
upload_player_skin(StrippedUuid, File) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user/profile/", StrippedUuid, "/skin"],
  Body        = {form, [, {<<"file">>, File]++openapi_utils:optional_params(['model'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

