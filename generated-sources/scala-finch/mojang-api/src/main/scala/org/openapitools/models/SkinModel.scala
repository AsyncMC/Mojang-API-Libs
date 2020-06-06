package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 */
case class SkinModel()

object SkinModel {
    /**
     * Creates the codec for converting SkinModel from and to JSON.
     */
    implicit val decoder: Decoder[SkinModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[SkinModel] = deriveEncoder
}
