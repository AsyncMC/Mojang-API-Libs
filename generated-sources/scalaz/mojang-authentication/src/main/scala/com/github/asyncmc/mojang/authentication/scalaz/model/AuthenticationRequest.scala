package com.github.asyncmc.mojang.authentication.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AuthenticationRequest._

case class AuthenticationRequest (
  /* The Mojang account e-mail or username. Never store it. */
  username: String,
/* The Mojang account password, never store it. */
  password: String)

object AuthenticationRequest {
  import DateTimeCodecs._

  implicit val AuthenticationRequestCodecJson: CodecJson[AuthenticationRequest] = CodecJson.derive[AuthenticationRequest]
  implicit val AuthenticationRequestDecoder: EntityDecoder[AuthenticationRequest] = jsonOf[AuthenticationRequest]
  implicit val AuthenticationRequestEncoder: EntityEncoder[AuthenticationRequest] = jsonEncoderOf[AuthenticationRequest]
}
