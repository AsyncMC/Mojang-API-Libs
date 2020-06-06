@isTest
private class OASLoginApiTest {
    /**
     * Gets the player\&#39;s game profile
     *
     * This will return the player\&#39;s username plus any additional information about them (e.g. skins).\nThis has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     */
    @isTest
    private static void getPlayerProfileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'strippedUuid' => 853c80ef3c3749fdaa49938b674adae6,
            'unsigned' => Boolean.getExample()
        };

        OASClient client;
        OASLoginApi api;
        OASPlayerProfile response;
        OASPlayerProfile expectedResponse;
        String js = '';

        api = new OASLoginApi(new OASClient());

        js = JSON.serialize(OASPlayerProfile.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPlayerProfile.getExample();
        response = (OASPlayerProfile) api.getPlayerProfile(params);
        System.assertEquals(expectedResponse, response);
    }
}