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
package org.openapitools.server.models


/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @param total total amount sold
 * @param last24h total sold in last 24 hours
 * @param saleVelocityPerSeconds decimal average sales per second
 */
data class OrderStatisticsResponse (
    /* total amount sold */
    val total: kotlin.Long,
    /* total sold in last 24 hours */
    val last24h: kotlin.Long,
    /* decimal average sales per second */
    val saleVelocityPerSeconds: kotlin.Double
) {

}

