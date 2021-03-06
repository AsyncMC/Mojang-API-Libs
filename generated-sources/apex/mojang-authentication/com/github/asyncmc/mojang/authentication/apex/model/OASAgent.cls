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
 * Identifies the software doing the request
 */
public class OASAgent {
    /**
     * The name of the game
     */
    public enum NameEnum {
        MINECRAFT,
        SCROLLS
    }

    /**
     * The name of the game
     * @return name
     */
    public NameEnum name { get; set; }

    /**
     * The agent version, usually 1.
     * @return version
     */
    public Integer version { get; set; }

    public OASAgent() {
        name = NameEnum.MINECRAFT;
        version = 1;
    }

    public static OASAgent getExample() {
        OASAgent agent = new OASAgent();
          agent.name = NameEnum.MINECRAFT;
          agent.version = 0;
        return agent;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAgent) {           
            OASAgent agent = (OASAgent) obj;
            return this.name == agent.name
                && this.version == agent.version;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (version == null ? 0 : System.hashCode(version));
        return hashCode;
    }
}

