@isTest
private class OASMiscellaneousApiTest {
    /**
     * Get statistics on the sales of Minecraft.
     *
     * 
     */
    @isTest
    private static void getOrdersStatisticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSOrderStatisticsRequest' => OASOrderStatisticsRequest.getExample()
        };

        OASClient client;
        OASMiscellaneousApi api;
        OASOrderStatisticsResponse response;
        OASOrderStatisticsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMiscellaneousApi(client);

        js = JSON.serialize(OASOrderStatisticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOrderStatisticsResponse.getExample();
        response = (OASOrderStatisticsResponse) api.getOrdersStatistics(params);
        System.assertEquals(expectedResponse, response);
    }
}