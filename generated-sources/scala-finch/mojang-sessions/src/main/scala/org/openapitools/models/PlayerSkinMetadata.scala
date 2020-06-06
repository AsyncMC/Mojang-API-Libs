package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Contains details about the skin
 * @param model The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
 */
case class PlayerSkinMetadata(model: Option[String]
                )

object PlayerSkinMetadata {
    /**
     * Creates the codec for converting PlayerSkinMetadata from and to JSON.
     */
    implicit val decoder: Decoder[PlayerSkinMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerSkinMetadata] = deriveEncoder
}
