@isTest
private class OASNameHistoryApiTest {
    /**
     * Find the current UUID of multiple players at once
     *
     * Find the current players name, UUID, demo status and migration flag by the current players name. The &quot;at&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
     */
    @isTest
    private static void findUniqueIdsByNameTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'requestBody' => [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]
        };

        OASClient client;
        OASNameHistoryApi api;
        List<OASCurrentPlayerIDs> response;
        List<OASCurrentPlayerIDs> expectedResponse;
        String js = '';

        api = new OASNameHistoryApi(new OASClient());

        js = JSON.serialize(new List<OASCurrentPlayerIDs>{OASCurrentPlayerIDs.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCurrentPlayerIDs>{OASCurrentPlayerIDs.getExample()};
        response = (List<OASCurrentPlayerIDs>) api.findUniqueIdsByName(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Gets the full player\&#39;s name history
     *
     * 
     */
    @isTest
    private static void getNameHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'strippedUuid' => 38ba542eb5924231a54cca0f2eac2b54
        };

        OASClient client;
        OASNameHistoryApi api;
        List<OASNameChange> response;
        List<OASNameChange> expectedResponse;
        String js = '';

        api = new OASNameHistoryApi(new OASClient());

        api.getNameHistory(params);
    }

    /**
     * Find the UUID by name
     *
     * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
     */
    @isTest
    private static void getUniqueIdByNameTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'username' => LordofMC_Playerz,
            'at' => 1448533942
        };

        OASClient client;
        OASNameHistoryApi api;
        OASCurrentPlayerIDs response;
        OASCurrentPlayerIDs expectedResponse;
        String js = '';

        api = new OASNameHistoryApi(new OASClient());

        js = JSON.serialize(OASCurrentPlayerIDs.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCurrentPlayerIDs.getExample();
        response = (OASCurrentPlayerIDs) api.getUniqueIdByName(params);
        System.assertEquals(expectedResponse, response);
    }
}