/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { GameProfileProperty } from './gameProfileProperty';
import { ReducedUserData } from './reducedUserData';

export class PrivateUserData extends ReducedUserData {

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(PrivateUserData.attributeTypeMap);
    }
}

