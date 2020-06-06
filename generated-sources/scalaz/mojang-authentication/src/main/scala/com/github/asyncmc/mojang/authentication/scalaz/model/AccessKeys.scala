package com.github.asyncmc.mojang.authentication.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AccessKeys._

case class AccessKeys (
  accessToken: String,
clientToken: Option[String])

object AccessKeys {
  import DateTimeCodecs._

  implicit val AccessKeysCodecJson: CodecJson[AccessKeys] = CodecJson.derive[AccessKeys]
  implicit val AccessKeysDecoder: EntityDecoder[AccessKeys] = jsonOf[AccessKeys]
  implicit val AccessKeysEncoder: EntityEncoder[AccessKeys] = jsonEncoderOf[AccessKeys]
}
