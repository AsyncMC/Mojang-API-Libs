import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/username_password.dart';
part 'authentication_request.jser.dart';

class AuthenticationRequest {
   /* The Mojang account e-mail or username. Never store it. */
  @Alias('username')
  final String username;
   /* The Mojang account password, never store it. */
  @Alias('password')
  final String password;
  

  AuthenticationRequest(
    

{
    
     this.username = null,  
     this.password = null 
    }
  );

  @override
  String toString() {
    return 'AuthenticationRequest[username=$username, password=$password, ]';
  }
}

@GenSerializer()
class AuthenticationRequestSerializer extends Serializer<AuthenticationRequest> with _$AuthenticationRequestSerializer {

}
