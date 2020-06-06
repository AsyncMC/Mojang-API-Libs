import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/player_texture.dart';
part 'player_profile_texture_property_value.jser.dart';

class PlayerProfileTexturePropertyValue {
   /* UNIX timestamp in milliseconds */
  @Alias('timestamp')
  final int timestamp;
   /* The player UUID without hyphens */
  @Alias('profileId')
  final String profileId;
   /* The player's name */
  @Alias('profileName')
  final String profileName;
   /* Only present if unsigned was set to false in the request */
  @Alias('signatureRequired')
  final bool signatureRequired;
  
  @Alias('textures')
  final PlayerTexture textures;
  

  PlayerProfileTexturePropertyValue(
    

{
    
     this.timestamp = null,  
     this.profileId = null,  
     this.profileName = null,   this.signatureRequired = false,  
     this.textures = null 
    
    }
  );

  @override
  String toString() {
    return 'PlayerProfileTexturePropertyValue[timestamp=$timestamp, profileId=$profileId, profileName=$profileName, signatureRequired=$signatureRequired, textures=$textures, ]';
  }
}

@GenSerializer()
class PlayerProfileTexturePropertyValueSerializer extends Serializer<PlayerProfileTexturePropertyValue> with _$PlayerProfileTexturePropertyValueSerializer {

}
