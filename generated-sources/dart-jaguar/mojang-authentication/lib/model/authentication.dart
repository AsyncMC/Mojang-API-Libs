import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/access_keys.dart';
part 'authentication.jser.dart';

class Authentication {
  
  @Alias('accessToken')
  final String accessToken;
  
  @Alias('clientToken')
  final String clientToken;
  

  Authentication(
    

{
    
     this.accessToken = null,   this.clientToken = null 
    
    }
  );

  @override
  String toString() {
    return 'Authentication[accessToken=$accessToken, clientToken=$clientToken, ]';
  }
}

@GenSerializer()
class AuthenticationSerializer extends Serializer<Authentication> with _$AuthenticationSerializer {

}
