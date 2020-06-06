package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.io.File
import org.openapitools.models.SkinModel

/**
 * 
 * @param model 
 * @param file The skin image in PNG format
 */
case class Inline_object(model: Option[SkinModel],
                file: File
                )

object Inline_object {
    /**
     * Creates the codec for converting Inline_object from and to JSON.
     */
    implicit val decoder: Decoder[Inline_object] = deriveDecoder
    implicit val encoder: ObjectEncoder[Inline_object] = deriveEncoder
}
