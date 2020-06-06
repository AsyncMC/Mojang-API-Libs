@isTest
private class OASBansApiTest {
    /**
     * A list of SHA1 hashes of banned servers
     *
     * Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect.\nClients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*.\nThis check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
     */
    @isTest
    private static void getBlockedServerHashesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASBansApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBansApi(new OASClient());

        api.getBlockedServerHashes();
    }
}