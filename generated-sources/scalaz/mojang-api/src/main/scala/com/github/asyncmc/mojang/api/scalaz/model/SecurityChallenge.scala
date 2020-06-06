package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SecurityChallenge._

case class SecurityChallenge (
  question: SecurityQuestion,
answer: SecurityAnswerId)

object SecurityChallenge {
  import DateTimeCodecs._

  implicit val SecurityChallengeCodecJson: CodecJson[SecurityChallenge] = CodecJson.derive[SecurityChallenge]
  implicit val SecurityChallengeDecoder: EntityDecoder[SecurityChallenge] = jsonOf[SecurityChallenge]
  implicit val SecurityChallengeEncoder: EntityEncoder[SecurityChallenge] = jsonEncoderOf[SecurityChallenge]
}
