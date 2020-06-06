@isTest
private class OASSecurityQuestionAnswerApiTest {
    /**
     * Check if security questions are needed
     *
     * 
     */
    @isTest
    private static void checkSecurityStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASSecurityQuestionAnswerApi api;
        String js = '';

        client = new OASClient();
        api = new OASSecurityQuestionAnswerApi(client);
        api.checkSecurityStatus();
    }

    /**
     * Get list of questions
     *
     * 
     */
    @isTest
    private static void listPendingSecurityQuestionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASSecurityQuestionAnswerApi api;
        List<OASSecurityChallenge> response;
        List<OASSecurityChallenge> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSecurityQuestionAnswerApi(client);

        js = JSON.serialize(new List<OASSecurityChallenge>{OASSecurityChallenge.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSecurityChallenge>{OASSecurityChallenge.getExample()};
        response = (List<OASSecurityChallenge>) api.listPendingSecurityQuestions();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Send back the answers
     *
     * 
     */
    @isTest
    private static void sendSecurityQuestionAnswersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSSecurityAnswer' => new List<OASSecurityAnswer>{OASSecurityAnswer.getExample()}
        };

        OASClient client;
        OASSecurityQuestionAnswerApi api;
        String js = '';

        client = new OASClient();
        api = new OASSecurityQuestionAnswerApi(client);
        api.sendSecurityQuestionAnswers(params);
    }
}