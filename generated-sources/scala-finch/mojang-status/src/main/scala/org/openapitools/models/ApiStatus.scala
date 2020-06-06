package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */
case class ApiStatus()

object ApiStatus {
    /**
     * Creates the codec for converting ApiStatus from and to JSON.
     */
    implicit val decoder: Decoder[ApiStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiStatus] = deriveEncoder
}
