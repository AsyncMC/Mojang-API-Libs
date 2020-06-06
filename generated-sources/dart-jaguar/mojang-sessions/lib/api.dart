library openapi.api;

import 'package:http/http.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';

import 'package:openapi/api/bans_api.dart';
import 'package:openapi/api/login_api.dart';

import 'package:openapi/model/player_profile.dart';
import 'package:openapi/model/player_profile_property.dart';
import 'package:openapi/model/player_profile_texture_property_value.dart';
import 'package:openapi/model/player_skin_metadata.dart';
import 'package:openapi/model/player_skin_url.dart';
import 'package:openapi/model/player_texture.dart';
import 'package:openapi/model/player_texture_url.dart';
import 'package:openapi/model/session_api_error.dart';


final jsonJaguarRepo = JsonRepo()
..add(PlayerProfileSerializer())
..add(PlayerProfilePropertySerializer())
..add(PlayerProfileTexturePropertyValueSerializer())
..add(PlayerSkinMetadataSerializer())
..add(PlayerSkinURLSerializer())
..add(PlayerTextureSerializer())
..add(PlayerTextureURLSerializer())
..add(SessionApiErrorSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://sessionserver.mojang.com";
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
    * Get BansApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    BansApi getBansApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return BansApi(base: base, serializers: serializers);
    }

    
    /**
    * Get LoginApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    LoginApi getLoginApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return LoginApi(base: base, serializers: serializers);
    }

    
}
