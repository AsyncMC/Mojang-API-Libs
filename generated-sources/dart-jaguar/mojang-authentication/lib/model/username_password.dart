import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'username_password.jser.dart';

class UsernamePassword {
   /* The Mojang account e-mail or username. Never store it. */
  @Alias('username')
  final String username;
   /* The Mojang account password, never store it. */
  @Alias('password')
  final String password;
  

  UsernamePassword(
    

{
    
     this.username = null,  
     this.password = null 
    }
  );

  @override
  String toString() {
    return 'UsernamePassword[username=$username, password=$password, ]';
  }
}

@GenSerializer()
class UsernamePasswordSerializer extends Serializer<UsernamePassword> with _$UsernamePasswordSerializer {

}
