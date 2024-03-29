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

package com.github.asyncmc.mojang.sessions.scala.httpclient.model


case class PlayerProfileTexturePropertyValue (
  // UNIX timestamp in milliseconds
  timestamp: Long,
  // The player UUID without hyphens
  profileId: String,
  // The player's name
  profileName: String,
  // Only present if unsigned was set to false in the request
  signatureRequired: Option[Boolean] = None,
  textures: Option[PlayerTexture] = None
)

