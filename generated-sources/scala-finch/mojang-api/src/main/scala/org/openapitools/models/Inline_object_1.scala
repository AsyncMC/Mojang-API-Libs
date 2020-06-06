package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SkinModel

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @param model 
 * @param url The URL which Mojang servers will download and apply the skin
 */
case class Inline_object_1(model: Option[SkinModel],
                url: String
                )

object Inline_object_1 {
    /**
     * Creates the codec for converting Inline_object_1 from and to JSON.
     */
    implicit val decoder: Decoder[Inline_object_1] = deriveDecoder
    implicit val encoder: ObjectEncoder[Inline_object_1] = deriveEncoder
}
