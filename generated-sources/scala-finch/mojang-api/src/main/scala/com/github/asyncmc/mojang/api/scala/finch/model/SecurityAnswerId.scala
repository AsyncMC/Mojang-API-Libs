package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A security question answer id given by Mojang
 * @param id A number giver by Mojang to reply a question
 */
case class SecurityAnswerId(id: Int
                )

object SecurityAnswerId {
    /**
     * Creates the codec for converting SecurityAnswerId from and to JSON.
     */
    implicit val decoder: Decoder[SecurityAnswerId] = deriveDecoder
    implicit val encoder: ObjectEncoder[SecurityAnswerId] = deriveEncoder
}
