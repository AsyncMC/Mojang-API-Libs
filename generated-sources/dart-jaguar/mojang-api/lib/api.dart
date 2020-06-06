library openapi.api;

import 'package:http/http.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';

import 'package:openapi/api/miscellaneous_api.dart';
import 'package:openapi/api/name_history_api.dart';
import 'package:openapi/api/security_question_answer_api.dart';
import 'package:openapi/api/skin_operations_api.dart';

import 'package:openapi/model/current_player_i_ds.dart';
import 'package:openapi/model/error.dart';
import 'package:openapi/model/inline_object.dart';
import 'package:openapi/model/inline_object1.dart';
import 'package:openapi/model/name_change.dart';
import 'package:openapi/model/order_statistic.dart';
import 'package:openapi/model/order_statistics_request.dart';
import 'package:openapi/model/order_statistics_response.dart';
import 'package:openapi/model/security_answer.dart';
import 'package:openapi/model/security_answer_id.dart';
import 'package:openapi/model/security_challenge.dart';
import 'package:openapi/model/security_question.dart';
import 'package:openapi/model/skin_model.dart';


final jsonJaguarRepo = JsonRepo()
..add(CurrentPlayerIDsSerializer())
..add(ErrorSerializer())
..add(InlineObjectSerializer())
..add(InlineObject1Serializer())
..add(NameChangeSerializer())
..add(OrderStatisticSerializer())
..add(OrderStatisticsRequestSerializer())
..add(OrderStatisticsResponseSerializer())
..add(SecurityAnswerSerializer())
..add(SecurityAnswerIdSerializer())
..add(SecurityChallengeSerializer())
..add(SecurityQuestionSerializer())
..add(SkinModelSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://api.mojang.com";
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
    * Get MiscellaneousApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    MiscellaneousApi getMiscellaneousApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return MiscellaneousApi(base: base, serializers: serializers);
    }

    
    /**
    * Get NameHistoryApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    NameHistoryApi getNameHistoryApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return NameHistoryApi(base: base, serializers: serializers);
    }

    
    /**
    * Get SecurityQuestionAnswerApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    SecurityQuestionAnswerApi getSecurityQuestionAnswerApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return SecurityQuestionAnswerApi(base: base, serializers: serializers);
    }

    
    /**
    * Get SkinOperationsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    SkinOperationsApi getSkinOperationsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return SkinOperationsApi(base: base, serializers: serializers);
    }

    
}
