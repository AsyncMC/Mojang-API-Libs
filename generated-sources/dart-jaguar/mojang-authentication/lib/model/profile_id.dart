import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'profile_id.jser.dart';

class ProfileId {
  
  @Alias('id')
  final String id;
   /* The player name */
  @Alias('name')
  final String name;
  

  ProfileId(
    

{
    
     this.id = null,  
     this.name = null 
    }
  );

  @override
  String toString() {
    return 'ProfileId[id=$id, name=$name, ]';
  }
}

@GenSerializer()
class ProfileIdSerializer extends Serializer<ProfileId> with _$ProfileIdSerializer {

}
