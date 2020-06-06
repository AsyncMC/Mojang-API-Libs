package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ReducedUserData._

case class ReducedUserData (
  id: Option[File],
properties: Option[List[GameProfileProperty]])

object ReducedUserData {
  import DateTimeCodecs._

  implicit val ReducedUserDataCodecJson: CodecJson[ReducedUserData] = CodecJson.derive[ReducedUserData]
  implicit val ReducedUserDataDecoder: EntityDecoder[ReducedUserData] = jsonOf[ReducedUserData]
  implicit val ReducedUserDataEncoder: EntityEncoder[ReducedUserData] = jsonEncoderOf[ReducedUserData]
}
