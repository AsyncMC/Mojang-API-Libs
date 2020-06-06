package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AccessKeys

/**
 * 
 * @param accessToken 
 * @param clientToken 
 */
case class Authentication(accessToken: String,
                clientToken: Option[String]
                )

object Authentication {
    /**
     * Creates the codec for converting Authentication from and to JSON.
     */
    implicit val decoder: Decoder[Authentication] = deriveDecoder
    implicit val encoder: ObjectEncoder[Authentication] = deriveEncoder
}
