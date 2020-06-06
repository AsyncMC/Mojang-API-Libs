import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/api_status.dart';


part 'default_api.jretro.dart';

@GenApiClient()
class DefaultApi extends _$DefaultApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    DefaultApi({this.base, this.serializers});

    /// Checks the Mojang service statuses
    ///
    /// 
    @GetReq(path: "/check")
    Future<List<Map<String, ApiStatus>>> checkStatuses(
    );


}
