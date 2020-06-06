package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Wraps the URL to the texture
 * @param url The URL to the texture, must be in Mojang's domains.
 */
case class PlayerTextureURL(url: String
                )

object PlayerTextureURL {
    /**
     * Creates the codec for converting PlayerTextureURL from and to JSON.
     */
    implicit val decoder: Decoder[PlayerTextureURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerTextureURL] = deriveEncoder
}
