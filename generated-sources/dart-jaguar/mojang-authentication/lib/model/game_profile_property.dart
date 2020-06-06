import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'game_profile_property.jser.dart';

class GameProfileProperty {
  
  @Alias('name')
  final String name;
  
  @Alias('value')
  final String value;
  

  GameProfileProperty(
    

{
     this.name = null,  
     this.value = null 
    
    }
  );

  @override
  String toString() {
    return 'GameProfileProperty[name=$name, value=$value, ]';
  }
}

@GenSerializer()
class GameProfilePropertySerializer extends Serializer<GameProfileProperty> with _$GameProfilePropertySerializer {

}
