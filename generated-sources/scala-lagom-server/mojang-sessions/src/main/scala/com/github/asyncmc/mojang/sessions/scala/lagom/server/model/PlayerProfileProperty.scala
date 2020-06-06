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

case class PlayerProfileProperty (
            /* The property name */
                  name: String,
            /* The serialized property value in base64. */
                  value: String,
            /* signed data using Yggdrasil's private key */
                  signature: Option[String]
)

object PlayerProfileProperty {
implicit val format: Format[PlayerProfileProperty] = Json.format
}

