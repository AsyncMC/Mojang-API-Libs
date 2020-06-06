import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/player_skin_url.dart';
import 'package:openapi/model/player_texture_url.dart';
part 'player_texture.jser.dart';

class PlayerTexture {
  
  @Alias('SKIN')
  final PlayerSkinURL SKIN;
  
  @Alias('CAPE')
  final PlayerTextureURL CAPE;
  

  PlayerTexture(
    

{
     this.SKIN = null,  
     this.CAPE = null 
    
    }
  );

  @override
  String toString() {
    return 'PlayerTexture[SKIN=$SKIN, CAPE=$CAPE, ]';
  }
}

@GenSerializer()
class PlayerTextureSerializer extends Serializer<PlayerTexture> with _$PlayerTextureSerializer {

}
