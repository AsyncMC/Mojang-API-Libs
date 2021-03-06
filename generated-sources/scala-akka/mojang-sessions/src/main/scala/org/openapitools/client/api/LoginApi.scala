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
package org.openapitools.client.api

import org.openapitools.client.model.PlayerProfile
import org.openapitools.client.model.SessionApiError
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object LoginApi {

  /**
   * This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
   * 
   * Expected answers:
   *   code 200 : PlayerProfile (The player profile and all properties)
   *   code 400 : SessionApiError (UUID is invalid)
   * 
   * @param strippedUuid The player UUID without hyphens
   * @param unsigned When set to false, the signature data are sent
   */
  def getPlayerProfile(strippedUuid: String, unsigned: Option[Boolean] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://sessionserver.mojang.com", "/session/minecraft/profile/{stripped_uuid}", "application/json")
      .withQueryParam("unsigned", unsigned)
      .withPathParam("stripped_uuid", strippedUuid)
      .withSuccessResponse[PlayerProfile](200)
      .withErrorResponse[SessionApiError](400)
      

}

