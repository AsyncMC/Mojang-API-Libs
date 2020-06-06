public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://sessionserver.mojang.com';
        calloutName = 'Mojang_Session_API';
    }
}
