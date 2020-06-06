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
package org.openapitools.client.api

import org.openapitools.client.model.AccessKeys
import org.openapitools.client.model.Authentication
import org.openapitools.client.model.AuthenticationRequest
import org.openapitools.client.model.Error
import org.openapitools.client.model.RefreshRequest
import org.openapitools.client.model.RefreshResponse
import org.openapitools.client.model.UsernamePassword
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * Expected answers:
   *   code 200 : Authentication (Successfully authenticated)
   *   code 400 : Error (Could not authenticate)
   * 
   * @param authenticationRequest 
   */
  def authenticate(authenticationRequest: AuthenticationRequest): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://authserver.mojang.com", "/authenticate", "application/json")
      .withBody(authenticationRequest)
      .withSuccessResponse[Authentication](200)
      .withErrorResponse[Error](400)
        /**
   * Expected answers:
   *   code 204 :  (The token have been invalidated)
   *   code 400 : Error (Could not invalidate the token)
   * 
   * @param accessKeys 
   */
  def invalidate(accessKeys: AccessKeys): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://authserver.mojang.com", "/invalidate", "application/json")
      .withBody(accessKeys)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Error](400)
        /**
   * Expected answers:
   *   code 200 : RefreshResponse (Session refreshed successfully. Note: The old access token gets invalidated.)
   *   code 400 : Error (Could not refresh the session)
   * 
   * @param refreshRequest 
   */
  def refresh(refreshRequest: RefreshRequest): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://authserver.mojang.com", "/refresh", "application/json")
      .withBody(refreshRequest)
      .withSuccessResponse[RefreshResponse](200)
      .withErrorResponse[Error](400)
        /**
   * Expected answers:
   *   code 204 :  (All tokens have been invalidated)
   *   code 400 : Error (Invalid username/password)
   * 
   * @param usernamePassword 
   */
  def siginout(usernamePassword: UsernamePassword): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://authserver.mojang.com", "/signout", "application/json")
      .withBody(usernamePassword)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Error](400)
        /**
   * Expected answers:
   *   code 204 :  (The token is valid)
   *   code 403 : Error (The token is not valid)
   * 
   * @param accessKeys 
   */
  def validate(accessKeys: AccessKeys): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://authserver.mojang.com", "/validate", "application/json")
      .withBody(accessKeys)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Error](403)
      

}
