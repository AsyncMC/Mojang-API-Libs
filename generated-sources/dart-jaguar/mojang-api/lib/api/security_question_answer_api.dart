import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/security_answer.dart';
import 'package:openapi/model/security_challenge.dart';
import 'package:openapi/model/error.dart';


part 'security_question_answer_api.jretro.dart';

@GenApiClient()
class SecurityQuestionAnswerApi extends _$SecurityQuestionAnswerApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    SecurityQuestionAnswerApi({this.base, this.serializers});

    /// Check if security questions are needed
    ///
    /// 
    @GetReq(path: "/user/security/location", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<void> checkSecurityStatus(
    );

    /// Get list of questions
    ///
    /// 
    @GetReq(path: "/user/security/challenges", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<List<SecurityChallenge>> listPendingSecurityQuestions(
    );

    /// Send back the answers
    ///
    /// 
    @PostReq(path: "/user/security/location", metadata: {"auth": [ {"type": "http", "name": "PlayerAccessToken" }]})
    Future<void> sendSecurityQuestionAnswers(
        
        @AsJson() List<SecurityAnswer> securityAnswer
    );


}
