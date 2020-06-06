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

package com.github.asyncmc.mojang.sessions.scalatra.model

case class PlayerProfileTexturePropertyValue(
  /* UNIX timestamp in milliseconds */
  timestamp: Long,

  /* The player UUID without hyphens */
  profileId: String,

  /* The player's name */
  profileName: String,

  /* Only present if unsigned was set to false in the request */
  signatureRequired: Option[Boolean],

  textures: Option[PlayerTexture]

 )