package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model.SecurityAnswerId

/**
 * A security question answer given by the player using the id given by Mojang
 * @param id A number giver by Mojang to reply a question
 */
case class SecurityAnswer(id: Int
                )

object SecurityAnswer {
    /**
     * Creates the codec for converting SecurityAnswer from and to JSON.
     */
    implicit val decoder: Decoder[SecurityAnswer] = deriveDecoder
    implicit val encoder: ObjectEncoder[SecurityAnswer] = deriveEncoder
}
