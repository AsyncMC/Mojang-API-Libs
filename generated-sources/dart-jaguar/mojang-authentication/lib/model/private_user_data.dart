import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/game_profile_property.dart';
import 'package:openapi/model/reduced_user_data.dart';
part 'private_user_data.jser.dart';

class PrivateUserData {
  
  @Alias('id')
  final MultipartFile id;
  
  @Alias('properties')
  final List<GameProfileProperty> properties;
  

  PrivateUserData(
    

{
     this.id = null,  
     this.properties = const [] 
    
    }
  );

  @override
  String toString() {
    return 'PrivateUserData[id=$id, properties=$properties, ]';
  }
}

@GenSerializer()
class PrivateUserDataSerializer extends Serializer<PrivateUserData> with _$PrivateUserDataSerializer {

}
