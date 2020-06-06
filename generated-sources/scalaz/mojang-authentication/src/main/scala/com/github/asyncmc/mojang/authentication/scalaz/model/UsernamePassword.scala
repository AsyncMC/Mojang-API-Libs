package com.github.asyncmc.mojang.authentication.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UsernamePassword._

case class UsernamePassword (
  /* The Mojang account e-mail or username. Never store it. */
  username: String,
/* The Mojang account password, never store it. */
  password: String)

object UsernamePassword {
  import DateTimeCodecs._

  implicit val UsernamePasswordCodecJson: CodecJson[UsernamePassword] = CodecJson.derive[UsernamePassword]
  implicit val UsernamePasswordDecoder: EntityDecoder[UsernamePassword] = jsonOf[UsernamePassword]
  implicit val UsernamePasswordEncoder: EntityEncoder[UsernamePassword] = jsonEncoderOf[UsernamePassword]
}
