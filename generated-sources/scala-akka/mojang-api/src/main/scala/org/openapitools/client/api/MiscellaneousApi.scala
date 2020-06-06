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
package org.openapitools.client.api

import org.openapitools.client.model.OrderStatisticsRequest
import org.openapitools.client.model.OrderStatisticsResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object MiscellaneousApi {

  /**
   * Expected answers:
   *   code 200 : OrderStatisticsResponse (A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.)
   * 
   * Available security schemes:
   *   MojangStatisticsToken (http)
   * 
   * @param orderStatisticsRequest The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
   */
  def getOrdersStatistics(orderStatisticsRequest: OrderStatisticsRequest)(implicit basicAuth: BasicCredentials): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.mojang.com", "/orders/statistics", "application/json")
      .withCredentials(basicAuth)
      .withBody(orderStatisticsRequest)
      .withSuccessResponse[OrderStatisticsResponse](200)
      

}
