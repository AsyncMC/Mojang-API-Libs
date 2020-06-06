/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */
export interface PlayerProfileProperty { 
    /**
     * The property name
     */
    name: string;
    /**
     * The serialized property value in base64.
     */
    value: string;
    /**
     * signed data using Yggdrasil's private key
     */
    signature?: string;
}
