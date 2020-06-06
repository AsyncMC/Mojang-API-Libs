package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param username The Mojang account e-mail or username. Never store it.
 * @param password The Mojang account password, never store it.
 */
case class UsernamePassword(username: String,
                password: String
                )

object UsernamePassword {
    /**
     * Creates the codec for converting UsernamePassword from and to JSON.
     */
    implicit val decoder: Decoder[UsernamePassword] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsernamePassword] = deriveEncoder
}
