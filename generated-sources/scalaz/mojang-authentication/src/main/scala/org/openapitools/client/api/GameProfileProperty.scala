package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import GameProfileProperty._

case class GameProfileProperty (
  name: Option[String],
value: Option[String])

object GameProfileProperty {
  import DateTimeCodecs._

  implicit val GameProfilePropertyCodecJson: CodecJson[GameProfileProperty] = CodecJson.derive[GameProfileProperty]
  implicit val GameProfilePropertyDecoder: EntityDecoder[GameProfileProperty] = jsonOf[GameProfileProperty]
  implicit val GameProfilePropertyEncoder: EntityEncoder[GameProfileProperty] = jsonEncoderOf[GameProfileProperty]
}
