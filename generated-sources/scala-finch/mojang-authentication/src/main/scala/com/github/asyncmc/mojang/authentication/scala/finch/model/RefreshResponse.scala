package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.authentication.scala.finch.model.RefreshRequest

/**
 * 
 * @param accessToken 
 * @param clientToken 
 */
case class RefreshResponse(accessToken: String,
                clientToken: Option[String]
                )

object RefreshResponse {
    /**
     * Creates the codec for converting RefreshResponse from and to JSON.
     */
    implicit val decoder: Decoder[RefreshResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[RefreshResponse] = deriveEncoder
}
