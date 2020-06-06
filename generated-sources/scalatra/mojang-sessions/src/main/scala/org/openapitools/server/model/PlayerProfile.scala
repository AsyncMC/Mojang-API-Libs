/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class PlayerProfile(
  /* The player UUID without hyphens */
  id: String,

  name: String,

  /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
  legacy: Option[Boolean],

  /* An array with all player properties, like skin and cape */
  properties: List[PlayerProfileProperty]

 )
