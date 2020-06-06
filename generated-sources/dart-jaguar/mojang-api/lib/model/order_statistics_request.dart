import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/order_statistic.dart';
part 'order_statistics_request.jser.dart';

class OrderStatisticsRequest {
  
  @Alias('metricKeys')
  final List<OrderStatistic> metricKeys;
  

  OrderStatisticsRequest(
    

{
    
     this.metricKeys = const [] 
    }
  );

  @override
  String toString() {
    return 'OrderStatisticsRequest[metricKeys=$metricKeys, ]';
  }
}

@GenSerializer()
class OrderStatisticsRequestSerializer extends Serializer<OrderStatisticsRequest> with _$OrderStatisticsRequestSerializer {

}
