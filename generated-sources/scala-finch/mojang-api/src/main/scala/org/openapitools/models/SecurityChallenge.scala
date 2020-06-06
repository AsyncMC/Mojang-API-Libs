package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SecurityAnswerId
import org.openapitools.models.SecurityQuestion

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
