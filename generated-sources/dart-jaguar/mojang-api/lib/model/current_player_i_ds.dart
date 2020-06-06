import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'current_player_i_ds.jser.dart';

class CurrentPlayerIDs {
   /* The player UUID without hyphens */
  @Alias('id')
  final String id;
   /* The current name being used by this player */
  @Alias('name')
  final String name;
   /* If account has not been converted */
  @Alias('legacy')
  final bool legacy;
   /* If the player has not puchased the game */
  @Alias('demo')
  final bool demo;
  

  CurrentPlayerIDs(
    

{
    
     this.id = null,  
     this.name = null,   this.legacy = false,  
     this.demo = false 
    
    }
  );

  @override
  String toString() {
    return 'CurrentPlayerIDs[id=$id, name=$name, legacy=$legacy, demo=$demo, ]';
  }
}

@GenSerializer()
class CurrentPlayerIDsSerializer extends Serializer<CurrentPlayerIDs> with _$CurrentPlayerIDsSerializer {

}
