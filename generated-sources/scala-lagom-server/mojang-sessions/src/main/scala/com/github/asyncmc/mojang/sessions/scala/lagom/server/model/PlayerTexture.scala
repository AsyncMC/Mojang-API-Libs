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

package com.github.asyncmc.mojang.sessions.scala.lagom.server.model
import play.api.libs.json._

case class PlayerTexture (
                  SKIN: Option[PlayerSkinURL],
                  CAPE: Option[PlayerTextureURL]
)

object PlayerTexture {
implicit val format: Format[PlayerTexture] = Json.format
}

