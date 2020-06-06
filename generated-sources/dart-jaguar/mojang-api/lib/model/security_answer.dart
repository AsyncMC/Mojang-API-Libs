import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/security_answer_id.dart';
part 'security_answer.jser.dart';

class SecurityAnswer {
   /* A number giver by Mojang to reply a question */
  @Alias('id')
  final int id;
  

  SecurityAnswer(
    

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'SecurityAnswer[id=$id, ]';
  }
}

@GenSerializer()
class SecurityAnswerSerializer extends Serializer<SecurityAnswer> with _$SecurityAnswerSerializer {

}
