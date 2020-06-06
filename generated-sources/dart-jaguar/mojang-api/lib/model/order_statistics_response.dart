import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'order_statistics_response.jser.dart';

class OrderStatisticsResponse {
   /* total amount sold */
  @Alias('total')
  final int total;
   /* total sold in last 24 hours */
  @Alias('last24h')
  final int last24h;
   /* decimal average sales per second */
  @Alias('saleVelocityPerSeconds')
  final double saleVelocityPerSeconds;
  

  OrderStatisticsResponse(
    

{
    
     this.total = null,  
     this.last24h = null,  
     this.saleVelocityPerSeconds = null 
    }
  );

  @override
  String toString() {
    return 'OrderStatisticsResponse[total=$total, last24h=$last24h, saleVelocityPerSeconds=$saleVelocityPerSeconds, ]';
  }
}

@GenSerializer()
class OrderStatisticsResponseSerializer extends Serializer<OrderStatisticsResponse> with _$OrderStatisticsResponseSerializer {

}
