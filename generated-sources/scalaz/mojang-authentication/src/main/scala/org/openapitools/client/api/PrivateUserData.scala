package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PrivateUserData._

case class PrivateUserData (
  id: Option[File],
properties: Option[List[GameProfileProperty]])

object PrivateUserData {
  import DateTimeCodecs._

  implicit val PrivateUserDataCodecJson: CodecJson[PrivateUserData] = CodecJson.derive[PrivateUserData]
  implicit val PrivateUserDataDecoder: EntityDecoder[PrivateUserData] = jsonOf[PrivateUserData]
  implicit val PrivateUserDataEncoder: EntityEncoder[PrivateUserData] = jsonEncoderOf[PrivateUserData]
}
