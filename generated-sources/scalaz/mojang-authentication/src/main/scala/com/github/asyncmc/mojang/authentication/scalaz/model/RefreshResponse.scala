package com.github.asyncmc.mojang.authentication.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import RefreshResponse._

case class RefreshResponse (
  accessToken: String,
clientToken: Option[String])

object RefreshResponse {
  import DateTimeCodecs._

  implicit val RefreshResponseCodecJson: CodecJson[RefreshResponse] = CodecJson.derive[RefreshResponse]
  implicit val RefreshResponseDecoder: EntityDecoder[RefreshResponse] = jsonOf[RefreshResponse]
  implicit val RefreshResponseEncoder: EntityEncoder[RefreshResponse] = jsonEncoderOf[RefreshResponse]
}
