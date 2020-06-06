@isTest
private class OASSkinOperationsApiTest {
    /**
     * Changes the player skin by URL
     *
     * This will set the skin for the selected profile, but Mojang\&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     */
    @isTest
    private static void changePlayerSkinTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'strippedUuid' => 38ba542eb5924231a54cca0f2eac2b54,
            'url' => 'null',
            'model' => OASSkinModel.getExample()
        };

        OASClient client;
        OASSkinOperationsApi api;
        String js = '';

        client = new OASClient();
        api = new OASSkinOperationsApi(client);
        api.changePlayerSkin(params);
    }

    /**
     * Resets the player skin to default
     *
     * 
     */
    @isTest
    private static void resetPlayerSkinTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'strippedUuid' => 38ba542eb5924231a54cca0f2eac2b54
        };

        OASClient client;
        OASSkinOperationsApi api;
        String js = '';

        client = new OASClient();
        api = new OASSkinOperationsApi(client);
        api.resetPlayerSkin(params);
    }

    /**
     * Changes the player skin by upload
     *
     * This uploads a skin to Mojang\&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     */
    @isTest
    private static void uploadPlayerSkinTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'strippedUuid' => 38ba542eb5924231a54cca0f2eac2b54,
            'file' => Blob.valueOf('Sample text file\nContents'),
            'model' => OASSkinModel.getExample()
        };

        OASClient client;
        OASSkinOperationsApi api;
        String js = '';

        client = new OASClient();
        api = new OASSkinOperationsApi(client);
        api.uploadPlayerSkin(params);
    }
}