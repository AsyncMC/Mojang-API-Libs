import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'player_profile_property.jser.dart';

class PlayerProfileProperty {
   /* The property name */
  @Alias('name')
  final String name;
   /* The serialized property value in base64. */
  @Alias('value')
  final String value;
   /* signed data using Yggdrasil's private key */
  @Alias('signature')
  final String signature;
  

  PlayerProfileProperty(
    

{
    
     this.name = null,  
     this.value = null,   this.signature = null 
    
    }
  );

  @override
  String toString() {
    return 'PlayerProfileProperty[name=$name, value=$value, signature=$signature, ]';
  }
}

@GenSerializer()
class PlayerProfilePropertySerializer extends Serializer<PlayerProfileProperty> with _$PlayerProfilePropertySerializer {

}
