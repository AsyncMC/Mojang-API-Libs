/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { SkinModel } from './skinModel';

export class InlineObject {
    'model'?: SkinModel;
    /**
    * The skin image in PNG format
    */
    'file': Buffer;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "model",
            "baseName": "model",
            "type": "SkinModel"
        },
        {
            "name": "file",
            "baseName": "file",
            "type": "Buffer"
        }    ];

    static getAttributeTypeMap() {
        return InlineObject.attributeTypeMap;
    }
}

