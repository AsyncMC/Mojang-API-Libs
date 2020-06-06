-module(openapi_api).

-export([ check_statuses/0
        ]).

-define(BASE_URL, "").

%% @doc Checks the Mojang service statuses
%% 
-spec check_statuses() ->
  openapi_utils:response().
check_statuses() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/check"],
  Body        = [],
  ContentType = <<"text/plain">>,

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

