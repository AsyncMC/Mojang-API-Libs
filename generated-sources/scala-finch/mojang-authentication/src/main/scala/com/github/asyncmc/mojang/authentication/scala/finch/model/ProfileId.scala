package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param name The player name
 */
case class ProfileId(id: String,
                name: String
                )

object ProfileId {
    /**
     * Creates the codec for converting ProfileId from and to JSON.
     */
    implicit val decoder: Decoder[ProfileId] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProfileId] = deriveEncoder
}
