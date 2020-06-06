import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/skin_model.dart';
import 'package:openapi/model/error.dart';


part 'skin_operations_api.jretro.dart';

@GenApiClient()
class SkinOperationsApi extends _$SkinOperationsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    SkinOperationsApi({this.base, this.serializers});

    /// Changes the player skin by URL
    ///
    /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
    @PostReq(path: "/user/profile/:stripped_uuid/skin", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<void> changePlayerSkin(
            @PathParam("stripped_uuid") String strippedUuid
        ,
        @AsFormField() SkinModel model, 
        
        @AsFormField() String url
    );

    /// Resets the player skin to default
    ///
    /// 
    @DeleteReq(path: "/user/profile/:stripped_uuid/skin", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<void> resetPlayerSkin(
            @PathParam("stripped_uuid") String strippedUuid
    );

    /// Changes the player skin by upload
    ///
    /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
    @PutReq(path: "/user/profile/:stripped_uuid/skin", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<void> uploadPlayerSkin(
            @PathParam("stripped_uuid") String strippedUuid
        ,
        @AsMultipartField() SkinModel model, 
        
        @AsMultipartField() MultipartFile file
    );


}
