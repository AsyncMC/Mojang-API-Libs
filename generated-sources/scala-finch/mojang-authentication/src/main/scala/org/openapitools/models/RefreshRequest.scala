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
case class RefreshRequest(accessToken: String,
                clientToken: Option[String]
                )

object RefreshRequest {
    /**
     * Creates the codec for converting RefreshRequest from and to JSON.
     */
    implicit val decoder: Decoder[RefreshRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[RefreshRequest] = deriveEncoder
}
