library openapi.api;

import 'package:http/http.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';

import 'package:openapi/api/default_api.dart';

import 'package:openapi/model/access_keys.dart';
import 'package:openapi/model/agent.dart';
import 'package:openapi/model/authentication.dart';
import 'package:openapi/model/authentication_request.dart';
import 'package:openapi/model/error.dart';
import 'package:openapi/model/game_profile.dart';
import 'package:openapi/model/game_profile_property.dart';
import 'package:openapi/model/private_user_data.dart';
import 'package:openapi/model/profile_id.dart';
import 'package:openapi/model/reduced_user_data.dart';
import 'package:openapi/model/refresh_request.dart';
import 'package:openapi/model/refresh_response.dart';
import 'package:openapi/model/username_password.dart';


final jsonJaguarRepo = JsonRepo()
..add(AccessKeysSerializer())
..add(AgentSerializer())
..add(AuthenticationSerializer())
..add(AuthenticationRequestSerializer())
..add(ErrorSerializer())
..add(GameProfileSerializer())
..add(GameProfilePropertySerializer())
..add(PrivateUserDataSerializer())
..add(ProfileIdSerializer())
..add(ReducedUserDataSerializer())
..add(RefreshRequestSerializer())
..add(RefreshResponseSerializer())
..add(UsernamePasswordSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://authserver.mojang.com";
    Route _baseRoute;

    /**
    * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
    */
    JaguarApiGen({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? IOClient());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
    * Get DefaultApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    DefaultApi getDefaultApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return DefaultApi(base: base, serializers: serializers);
    }

    
}
