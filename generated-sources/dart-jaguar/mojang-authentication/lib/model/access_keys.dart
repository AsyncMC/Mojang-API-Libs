import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'access_keys.jser.dart';

class AccessKeys {
  
  @Alias('accessToken')
  final String accessToken;
  
  @Alias('clientToken')
  final String clientToken;
  

  AccessKeys(
    

{
    
     this.accessToken = null,   this.clientToken = null 
    
    }
  );

  @override
  String toString() {
    return 'AccessKeys[accessToken=$accessToken, clientToken=$clientToken, ]';
  }
}

@GenSerializer()
class AccessKeysSerializer extends Serializer<AccessKeys> with _$AccessKeysSerializer {

}
