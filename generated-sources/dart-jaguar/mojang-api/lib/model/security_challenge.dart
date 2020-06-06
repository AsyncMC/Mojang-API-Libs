import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/security_question.dart';
import 'package:openapi/model/security_answer_id.dart';
part 'security_challenge.jser.dart';

class SecurityChallenge {
  
  @Alias('question')
  final SecurityQuestion question;
  
  @Alias('answer')
  final SecurityAnswerId answer;
  

  SecurityChallenge(
    

{
    
     this.question = null,  
     this.answer = null 
    }
  );

  @override
  String toString() {
    return 'SecurityChallenge[question=$question, answer=$answer, ]';
  }
}

@GenSerializer()
class SecurityChallengeSerializer extends Serializer<SecurityChallenge> with _$SecurityChallengeSerializer {

}
