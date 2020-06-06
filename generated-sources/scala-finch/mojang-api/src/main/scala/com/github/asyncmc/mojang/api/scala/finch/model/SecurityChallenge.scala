package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model.SecurityAnswerId
import com.github.asyncmc.mojang.api.scala.finch.model.SecurityQuestion

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 * @param question 
 * @param answer 
 */
case class SecurityChallenge(question: SecurityQuestion,
                answer: SecurityAnswerId
                )

object SecurityChallenge {
    /**
     * Creates the codec for converting SecurityChallenge from and to JSON.
     */
    implicit val decoder: Decoder[SecurityChallenge] = deriveDecoder
    implicit val encoder: ObjectEncoder[SecurityChallenge] = deriveEncoder
}
