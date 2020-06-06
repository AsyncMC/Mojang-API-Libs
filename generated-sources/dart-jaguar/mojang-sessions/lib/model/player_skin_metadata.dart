import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'player_skin_metadata.jser.dart';

class PlayerSkinMetadata {
   /* The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent. */
  @Alias('model')
  final String model;
  //enum modelEnum {  slim,  };

  PlayerSkinMetadata(
    

{
     this.model = null 
    
    }
  );

  @override
  String toString() {
    return 'PlayerSkinMetadata[model=$model, ]';
  }
}

@GenSerializer()
class PlayerSkinMetadataSerializer extends Serializer<PlayerSkinMetadata> with _$PlayerSkinMetadataSerializer {

}
