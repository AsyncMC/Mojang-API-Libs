package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An object describing giving a bit of information about the error
 * @param error A message describing the error
 * @param path The request path
 */
case class SessionApiError(error: Option[String],
                path: Option[String]
                )

object SessionApiError {
    /**
     * Creates the codec for converting SessionApiError from and to JSON.
     */
    implicit val decoder: Decoder[SessionApiError] = deriveDecoder
    implicit val encoder: ObjectEncoder[SessionApiError] = deriveEncoder
}
