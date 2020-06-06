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

import * as models from './models';

/**
 * This is obtained by decoding the \"textures\" property
 */
export interface PlayerProfileTexturePropertyValue {
    /**
     * UNIX timestamp in milliseconds
     */
    "timestamp": number;
    /**
     * The player UUID without hyphens
     */
    "profileId": string;
    /**
     * The player's name
     */
    "profileName": string;
    /**
     * Only present if unsigned was set to false in the request
     */
    "signatureRequired"?: boolean;
    "textures"?: models.PlayerTexture;
}

