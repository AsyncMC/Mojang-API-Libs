import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/player_profile_property.dart';
part 'player_profile.jser.dart';

class PlayerProfile {
   /* The player UUID without hyphens */
  @Alias('id')
  final String id;
  
  @Alias('name')
  final String name;
   /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
  @Alias('legacy')
  final bool legacy;
   /* An array with all player properties, like skin and cape */
  @Alias('properties')
  final List<PlayerProfileProperty> properties;
  

  PlayerProfile(
    

{
    
     this.id = null,  
     this.name = null,   this.legacy = false,  
    
     this.properties = const [] 
    }
  );

  @override
  String toString() {
    return 'PlayerProfile[id=$id, name=$name, legacy=$legacy, properties=$properties, ]';
  }
}

@GenSerializer()
class PlayerProfileSerializer extends Serializer<PlayerProfile> with _$PlayerProfileSerializer {

}
