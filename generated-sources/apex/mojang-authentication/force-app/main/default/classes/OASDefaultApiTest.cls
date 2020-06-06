@isTest
private class OASDefaultApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void authenticateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAuthenticationRequest' => OASAuthenticationRequest.getExample()
        };

        OASClient client;
        OASDefaultApi api;
        OASAuthentication response;
        OASAuthentication expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASAuthentication.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAuthentication.getExample();
        response = (OASAuthentication) api.authenticate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void invalidateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAccessKeys' => OASAccessKeys.getExample()
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.invalidate(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void refreshTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSRefreshRequest' => OASRefreshRequest.getExample()
        };

        OASClient client;
        OASDefaultApi api;
        OASRefreshResponse response;
        OASRefreshResponse expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASRefreshResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRefreshResponse.getExample();
        response = (OASRefreshResponse) api.refresh(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void siginoutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSUsernamePassword' => OASUsernamePassword.getExample()
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.siginout(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void validateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAccessKeys' => OASAccessKeys.getExample()
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.validate(params);
    }
}