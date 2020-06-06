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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CurrentPlayerIDs (
  /* The player UUID without hyphens */
  id: String,
  /* The current name being used by this player */
  name: String,
  /* If account has not been converted */
  legacy: Option[Boolean] = None,
  /* If the player has not puchased the game */
  demo: Option[Boolean] = None
) extends ApiModel


