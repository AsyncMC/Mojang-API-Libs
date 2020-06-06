package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Identifies the software doing the request
 * @param name The name of the game
 * @param version The agent version, usually 1.
 */
case class Agent(name: Option[String],
                version: Option[Int]
                )

object Agent {
    /**
     * Creates the codec for converting Agent from and to JSON.
     */
    implicit val decoder: Decoder[Agent] = deriveDecoder
    implicit val encoder: ObjectEncoder[Agent] = deriveEncoder
}
