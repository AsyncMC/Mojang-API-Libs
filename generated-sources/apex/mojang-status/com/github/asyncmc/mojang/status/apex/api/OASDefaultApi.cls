/*
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

public class OASDefaultApi {
    OASClient client;

    public OASDefaultApi(OASClient client) {
        this.client = client;
    }

    public OASDefaultApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Checks the Mojang service statuses
     * 
     * @return List<Map<String, OASApiStatus>>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<Map<String, OASApiStatus>> checkStatuses() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<Map<String, OASApiStatus>>) client.invoke(
            'GET', '/check', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<Map<String, OASApiStatus>>.class
        );
    }
}