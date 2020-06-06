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
 * Contains details about the skin
 */
export interface PlayerSkinMetadata { 
    /**
     * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
     */
    model?: PlayerSkinMetadata.ModelEnum;
}
export namespace PlayerSkinMetadata {
    export type ModelEnum = 'slim';
    export const ModelEnum = {
        Slim: 'slim' as ModelEnum
    }
}
