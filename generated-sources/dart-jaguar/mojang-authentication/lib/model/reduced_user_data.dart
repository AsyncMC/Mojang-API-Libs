import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/game_profile_property.dart';
part 'reduced_user_data.jser.dart';

class ReducedUserData {
  
  @Alias('id')
  final MultipartFile id;
  
  @Alias('properties')
  final List<GameProfileProperty> properties;
  

  ReducedUserData(
    

{
     this.id = null,  
     this.properties = const [] 
    
    }
  );

  @override
  String toString() {
    return 'ReducedUserData[id=$id, properties=$properties, ]';
  }
}

@GenSerializer()
class ReducedUserDataSerializer extends Serializer<ReducedUserData> with _$ReducedUserDataSerializer {

}
