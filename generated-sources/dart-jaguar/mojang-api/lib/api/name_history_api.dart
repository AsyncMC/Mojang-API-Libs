import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/error.dart';
import 'package:openapi/model/name_change.dart';
import 'package:openapi/model/current_player_i_ds.dart';


part 'name_history_api.jretro.dart';

@GenApiClient()
class NameHistoryApi extends _$NameHistoryApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    NameHistoryApi({this.base, this.serializers});

    /// Find the current UUID of multiple players at once
    ///
    /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
    @PostReq(path: "/profiles/minecraft")
    Future<List<CurrentPlayerIDs>> findUniqueIdsByName(
        
        @AsJson() List<String> requestBody
    );

    /// Gets the full player&#39;s name history
    ///
    /// 
    @GetReq(path: "/user/profiles/:stripped_uuid/names")
    Future<List<NameChange>> getNameHistory(
            @PathParam("stripped_uuid") String strippedUuid
    );

    /// Find the UUID by name
    ///
    /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
    @GetReq(path: "/users/profiles/minecraft/:username")
    Future<CurrentPlayerIDs> getUniqueIdByName(
            @PathParam("username") String username
        ,
        @QueryParam("at") int at
    );


}
