import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/authentication_request.dart';
import 'package:openapi/model/refresh_request.dart';
import 'package:openapi/model/refresh_response.dart';
import 'package:openapi/model/username_password.dart';
import 'package:openapi/model/error.dart';
import 'package:openapi/model/access_keys.dart';
import 'package:openapi/model/authentication.dart';


part 'default_api.jretro.dart';

@GenApiClient()
class DefaultApi extends _$DefaultApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    DefaultApi({this.base, this.serializers});

    /// 
    ///
    /// 
    @PostReq(path: "/authenticate")
    Future<Authentication> authenticate(
        
        @AsJson() AuthenticationRequest authenticationRequest
    );

    /// 
    ///
    /// 
    @PostReq(path: "/invalidate")
    Future<void> invalidate(
        
        @AsJson() AccessKeys accessKeys
    );

    /// 
    ///
    /// 
    @PostReq(path: "/refresh")
    Future<RefreshResponse> refresh(
        
        @AsJson() RefreshRequest refreshRequest
    );

    /// 
    ///
    /// 
    @PostReq(path: "/signout")
    Future<void> siginout(
        
        @AsJson() UsernamePassword usernamePassword
    );

    /// 
    ///
    /// 
    @PostReq(path: "/validate")
    Future<void> validate(
        
        @AsJson() AccessKeys accessKeys
    );


}
