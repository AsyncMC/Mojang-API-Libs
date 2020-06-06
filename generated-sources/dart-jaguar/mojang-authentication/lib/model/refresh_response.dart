import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/refresh_request.dart';
part 'refresh_response.jser.dart';

class RefreshResponse {
  
  @Alias('accessToken')
  final String accessToken;
  
  @Alias('clientToken')
  final String clientToken;
  

  RefreshResponse(
    

{
    
     this.accessToken = null,   this.clientToken = null 
    
    }
  );

  @override
  String toString() {
    return 'RefreshResponse[accessToken=$accessToken, clientToken=$clientToken, ]';
  }
}

@GenSerializer()
class RefreshResponseSerializer extends Serializer<RefreshResponse> with _$RefreshResponseSerializer {

}
