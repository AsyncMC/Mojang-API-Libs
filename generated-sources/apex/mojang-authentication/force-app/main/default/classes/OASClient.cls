public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://authserver.mojang.com';
        calloutName = 'Mojang_Authentication_API';
    }
}
