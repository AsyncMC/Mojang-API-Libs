package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Authentication._

case class Authentication (
  accessToken: String,
clientToken: Option[String])

object Authentication {
  import DateTimeCodecs._

  implicit val AuthenticationCodecJson: CodecJson[Authentication] = CodecJson.derive[Authentication]
  implicit val AuthenticationDecoder: EntityDecoder[Authentication] = jsonOf[Authentication]
  implicit val AuthenticationEncoder: EntityEncoder[Authentication] = jsonEncoderOf[Authentication]
}
