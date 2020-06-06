import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/session_api_error.dart';
import 'package:openapi/model/player_profile.dart';


part 'login_api.jretro.dart';

@GenApiClient()
class LoginApi extends _$LoginApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    LoginApi({this.base, this.serializers});

    /// Gets the player&#39;s game profile
    ///
    /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
    @GetReq(path: "/session/minecraft/profile/:stripped_uuid")
    Future<PlayerProfile> getPlayerProfile(
            @PathParam("stripped_uuid") String strippedUuid
        ,
        @QueryParam("unsigned") bool unsigned
    );


}
