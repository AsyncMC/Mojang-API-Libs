package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PlayerTexture

/**
 * This is obtained by decoding the \"textures\" property
 * @param timestamp UNIX timestamp in milliseconds
 * @param profileId The player UUID without hyphens
 * @param profileName The player's name
 * @param signatureRequired Only present if unsigned was set to false in the request
 * @param textures 
 */
case class PlayerProfileTexturePropertyValue(timestamp: Long,
                profileId: String,
                profileName: String,
                signatureRequired: Option[Boolean],
                textures: Option[PlayerTexture]
                )

object PlayerProfileTexturePropertyValue {
    /**
     * Creates the codec for converting PlayerProfileTexturePropertyValue from and to JSON.
     */
    implicit val decoder: Decoder[PlayerProfileTexturePropertyValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerProfileTexturePropertyValue] = deriveEncoder
}
