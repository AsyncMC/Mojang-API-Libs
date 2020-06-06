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

import { OrderStatistic } from './orderStatistic';

/**
* The body of the request to get the order statistics
*/
export class OrderStatisticsRequest {
    'metricKeys': Array<OrderStatistic>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "metricKeys",
            "baseName": "metricKeys",
            "type": "Array<OrderStatistic>"
        }    ];

    static getAttributeTypeMap() {
        return OrderStatisticsRequest.attributeTypeMap;
    }
}
