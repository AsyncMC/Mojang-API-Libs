package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PlayerSkinURL
import org.openapitools.models.PlayerTextureURL

/**
 * Provide links to the player's skin and cape
 * @param SKIN 
 * @param CAPE 
 */
case class PlayerTexture(SKIN: Option[PlayerSkinURL],
                CAPE: Option[PlayerTextureURL]
                )

object PlayerTexture {
    /**
     * Creates the codec for converting PlayerTexture from and to JSON.
     */
    implicit val decoder: Decoder[PlayerTexture] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerTexture] = deriveEncoder
}
