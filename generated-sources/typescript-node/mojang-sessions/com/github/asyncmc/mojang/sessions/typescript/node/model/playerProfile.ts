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

import { PlayerProfileProperty } from './playerProfileProperty';

export class PlayerProfile {
    /**
    * The player UUID without hyphens
    */
    'id': string;
    'name': string;
    /**
    * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
    */
    'legacy'?: boolean;
    /**
    * An array with all player properties, like skin and cape
    */
    'properties': Array<PlayerProfileProperty>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "legacy",
            "baseName": "legacy",
            "type": "boolean"
        },
        {
            "name": "properties",
            "baseName": "properties",
            "type": "Array<PlayerProfileProperty>"
        }    ];

    static getAttributeTypeMap() {
        return PlayerProfile.attributeTypeMap;
    }
}

