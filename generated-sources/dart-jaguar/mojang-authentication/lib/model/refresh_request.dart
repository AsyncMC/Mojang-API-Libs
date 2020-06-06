import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/access_keys.dart';
part 'refresh_request.jser.dart';

class RefreshRequest {
  
  @Alias('accessToken')
  final String accessToken;
  
  @Alias('clientToken')
  final String clientToken;
  

  RefreshRequest(
    

{
    
     this.accessToken = null,   this.clientToken = null 
    
    }
  );

  @override
  String toString() {
    return 'RefreshRequest[accessToken=$accessToken, clientToken=$clientToken, ]';
  }
}

@GenSerializer()
class RefreshRequestSerializer extends Serializer<RefreshRequest> with _$RefreshRequestSerializer {

}
