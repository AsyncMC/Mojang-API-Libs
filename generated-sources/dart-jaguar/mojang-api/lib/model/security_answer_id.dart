import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'security_answer_id.jser.dart';

class SecurityAnswerId {
   /* A number giver by Mojang to reply a question */
  @Alias('id')
  final int id;
  

  SecurityAnswerId(
    

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'SecurityAnswerId[id=$id, ]';
  }
}

@GenSerializer()
class SecurityAnswerIdSerializer extends Serializer<SecurityAnswerId> with _$SecurityAnswerIdSerializer {

}
