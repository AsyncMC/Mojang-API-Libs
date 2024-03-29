/*
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASRefreshRequest
 */
public class OASRefreshRequest extends OASAccessKeys implements OASAccessKeys {
    /**
     * Get accessToken
     * @return accessToken
     */
    public String accessToken { get; set; }

    /**
     * Get clientToken
     * @return clientToken
     */
    public String clientToken { get; set; }

    public static OASRefreshRequest getExample() {
        OASRefreshRequest refreshRequest = new OASRefreshRequest();
          refreshRequest.accessToken = '';
          refreshRequest.clientToken = '';
        return refreshRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRefreshRequest) {           
            OASRefreshRequest refreshRequest = (OASRefreshRequest) obj;
            return this.accessToken == refreshRequest.accessToken
                && this.clientToken == refreshRequest.clientToken;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (accessToken == null ? 0 : System.hashCode(accessToken));
        hashCode = (17 * hashCode) + (clientToken == null ? 0 : System.hashCode(clientToken));
        return hashCode;
    }
}

