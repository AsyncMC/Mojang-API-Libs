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

public class OASNameHistoryApi {
    OASClient client;

    public OASNameHistoryApi(OASClient client) {
        this.client = client;
    }

    public OASNameHistoryApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Find the current UUID of multiple players at once
     * Find the current players name, UUID, demo status and migration flag by the current players name. The &quot;at&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
     * @param requestBody Array with the player names (required)
     * @return List<OASCurrentPlayerIDs>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASCurrentPlayerIDs> findUniqueIdsByName(Map<String, Object> params) {
        client.assertNotNull(params.get('requestBody'), 'requestBody');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASCurrentPlayerIDs>) client.invoke(
            'POST', '/profiles/minecraft',
            (List<String>) params.get('requestBody'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            List<OASCurrentPlayerIDs>.class
        );
    }
    /**
     * Gets the full player\&#39;s name history
     * 
     * @param strippedUuid The player UUID without hyphens (required)
     * @return List<OASNameChange>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASNameChange> getNameHistory(Map<String, Object> params) {
        client.assertNotNull(params.get('strippedUuid'), 'strippedUuid');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASNameChange>) client.invoke(
            'GET', '/user/profiles/{stripped_uuid}/names', '',
            query, form,
            new Map<String, Object>{
                'stripped_uuid' => (String) params.get('strippedUuid')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASNameChange>.class
        );
    }
    /**
     * Find the UUID by name
     * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
     * @param username The username in a given time, or in present if &quot;at&quot; is not sent (required)
     * @param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     * @return OASCurrentPlayerIDs
     * @throws OAS.ApiException if fails to make API call
     */
    public OASCurrentPlayerIDs getUniqueIdByName(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('at', (Long) params.get('at')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASCurrentPlayerIDs) client.invoke(
            'GET', '/users/profiles/minecraft/{username}', '',
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASCurrentPlayerIDs.class
        );
    }
}
