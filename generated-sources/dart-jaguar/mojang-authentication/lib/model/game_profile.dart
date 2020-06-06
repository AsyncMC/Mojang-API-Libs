import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'game_profile.jser.dart';

class GameProfile {
  
  @Alias('agent')
  final String agent;
  
  @Alias('id')
  final String id;
  
  @Alias('name')
  final String name;
  
  @Alias('userId')
  final String userId;
   /* Unix timestamp in milliseconds */
  @Alias('createdAt')
  final int createdAt;
  
  @Alias('legacyProfile')
  final bool legacyProfile;
  
  @Alias('suspended')
  final bool suspended;
  
  @Alias('paid')
  final bool paid;
  
  @Alias('migrated')
  final bool migrated;
  
  @Alias('legacy')
  final bool legacy;
  

  GameProfile(
    

{
     this.agent = null,  
     this.id = null,  
     this.name = null,  
     this.userId = null,  
     this.createdAt = null,  
     this.legacyProfile = null,  
     this.suspended = null,  
     this.paid = null,  
     this.migrated = null,  
     this.legacy = null 
    
    }
  );

  @override
  String toString() {
    return 'GameProfile[agent=$agent, id=$id, name=$name, userId=$userId, createdAt=$createdAt, legacyProfile=$legacyProfile, suspended=$suspended, paid=$paid, migrated=$migrated, legacy=$legacy, ]';
  }
}

@GenSerializer()
class GameProfileSerializer extends Serializer<GameProfile> with _$GameProfileSerializer {

}
