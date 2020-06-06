import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/order_statistics_response.dart';
import 'package:openapi/model/order_statistics_request.dart';


part 'miscellaneous_api.jretro.dart';

@GenApiClient()
class MiscellaneousApi extends _$MiscellaneousApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    MiscellaneousApi({this.base, this.serializers});

    /// Get statistics on the sales of Minecraft.
    ///
    /// 
    @PostReq(path: "/orders/statistics", metadata: {"auth": [ {"type": "http", "name": "MojangStatisticsToken" }]})
    Future<OrderStatisticsResponse> getOrdersStatistics(
        
        @AsJson() OrderStatisticsRequest orderStatisticsRequest
    );


}
