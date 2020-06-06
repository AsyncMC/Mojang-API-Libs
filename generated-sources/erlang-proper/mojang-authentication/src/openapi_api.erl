-module(openapi_api).

-export([ authenticate/1
        , invalidate/1
        , refresh/1
        , siginout/1
        , validate/1
        ]).

-define(BASE_URL, "").

%% @doc 
%% 
-spec authenticate(openapi_authentication_request:openapi_authentication_request()) ->
  openapi_utils:response().
authenticate(OpenapiAuthenticationRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/authenticate"],
  Body        = OpenapiAuthenticationRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec invalidate(openapi_access_keys:openapi_access_keys()) ->
  openapi_utils:response().
invalidate(OpenapiAccessKeys) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/invalidate"],
  Body        = OpenapiAccessKeys,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec refresh(openapi_refresh_request:openapi_refresh_request()) ->
  openapi_utils:response().
refresh(OpenapiRefreshRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/refresh"],
  Body        = OpenapiRefreshRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec siginout(openapi_username_password:openapi_username_password()) ->
  openapi_utils:response().
siginout(OpenapiUsernamePassword) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/signout"],
  Body        = OpenapiUsernamePassword,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec validate(openapi_access_keys:openapi_access_keys()) ->
  openapi_utils:response().
validate(OpenapiAccessKeys) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/validate"],
  Body        = OpenapiAccessKeys,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

