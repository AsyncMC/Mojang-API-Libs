package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SecurityAnswerId._

case class SecurityAnswerId (
  /* A number giver by Mojang to reply a question */
  id: Integer)

object SecurityAnswerId {
  import DateTimeCodecs._

  implicit val SecurityAnswerIdCodecJson: CodecJson[SecurityAnswerId] = CodecJson.derive[SecurityAnswerId]
  implicit val SecurityAnswerIdDecoder: EntityDecoder[SecurityAnswerId] = jsonOf[SecurityAnswerId]
  implicit val SecurityAnswerIdEncoder: EntityEncoder[SecurityAnswerId] = jsonEncoderOf[SecurityAnswerId]
}
