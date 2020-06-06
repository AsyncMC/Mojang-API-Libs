package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param accessToken 
 * @param clientToken 
 */
case class AccessKeys(accessToken: String,
                clientToken: Option[String]
                )

object AccessKeys {
    /**
     * Creates the codec for converting AccessKeys from and to JSON.
     */
    implicit val decoder: Decoder[AccessKeys] = deriveDecoder
    implicit val encoder: ObjectEncoder[AccessKeys] = deriveEncoder
}
