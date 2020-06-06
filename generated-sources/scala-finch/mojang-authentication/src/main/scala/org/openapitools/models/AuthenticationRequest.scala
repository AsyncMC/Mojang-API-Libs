package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UsernamePassword

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 * @param username The Mojang account e-mail or username. Never store it.
 * @param password The Mojang account password, never store it.
 */
case class AuthenticationRequest(username: String,
                password: String
                )

object AuthenticationRequest {
    /**
     * Creates the codec for converting AuthenticationRequest from and to JSON.
     */
    implicit val decoder: Decoder[AuthenticationRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuthenticationRequest] = deriveEncoder
}
