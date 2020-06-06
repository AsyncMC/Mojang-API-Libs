import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'name_change.jser.dart';

class NameChange {
   /* The new player name */
  @Alias('name')
  final String name;
   /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
  @Alias('changedToAt')
  final int changedToAt;
  

  NameChange(
    

{
    
     this.name = null,   this.changedToAt = null 
    
    }
  );

  @override
  String toString() {
    return 'NameChange[name=$name, changedToAt=$changedToAt, ]';
  }
}

@GenSerializer()
class NameChangeSerializer extends Serializer<NameChange> with _$NameChangeSerializer {

}
