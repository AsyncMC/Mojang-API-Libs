package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.authentication.scala.finch.model.AccessKeys

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
