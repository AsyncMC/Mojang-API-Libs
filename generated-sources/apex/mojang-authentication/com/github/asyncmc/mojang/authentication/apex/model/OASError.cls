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
 * This is returned when the request fails
 */
public class OASError {
    /**
     * Get error
     * @return error
     */
    public String error { get; set; }

    /**
     * Get errorMessage
     * @return errorMessage
     */
    public String errorMessage { get; set; }

    public static OASError getExample() {
        OASError error = new OASError();
          error.error = 'IllegalArgumentException';
          error.errorMessage = 'Invalid timestamp.';
        return error;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASError) {           
            OASError error = (OASError) obj;
            return this.error == error.error
                && this.errorMessage == error.errorMessage;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (error == null ? 0 : System.hashCode(error));
        hashCode = (17 * hashCode) + (errorMessage == null ? 0 : System.hashCode(errorMessage));
        return hashCode;
    }
}
