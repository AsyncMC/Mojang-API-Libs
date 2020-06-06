package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ProfileId._

case class ProfileId (
  id: String,
/* The player name */
  name: String)

object ProfileId {
  import DateTimeCodecs._

  implicit val ProfileIdCodecJson: CodecJson[ProfileId] = CodecJson.derive[ProfileId]
  implicit val ProfileIdDecoder: EntityDecoder[ProfileId] = jsonOf[ProfileId]
  implicit val ProfileIdEncoder: EntityEncoder[ProfileId] = jsonEncoderOf[ProfileId]
}
