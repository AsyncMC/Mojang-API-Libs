@isTest
private class OASDefaultApiTest {
    /**
     * Checks the Mojang service statuses
     *
     * 
     */
    @isTest
    private static void checkStatusesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        List<Map<String, OASApiStatus>> response;
        List<Map<String, OASApiStatus>> expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.checkStatuses();
    }
}