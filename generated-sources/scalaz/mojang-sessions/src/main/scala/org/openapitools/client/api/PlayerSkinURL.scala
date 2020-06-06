package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerSkinURL._

case class PlayerSkinURL (
  /* The URL to the texture, must be in Mojang's domains. */
  url: String)

object PlayerSkinURL {
  import DateTimeCodecs._

  implicit val PlayerSkinURLCodecJson: CodecJson[PlayerSkinURL] = CodecJson.derive[PlayerSkinURL]
  implicit val PlayerSkinURLDecoder: EntityDecoder[PlayerSkinURL] = jsonOf[PlayerSkinURL]
  implicit val PlayerSkinURLEncoder: EntityEncoder[PlayerSkinURL] = jsonEncoderOf[PlayerSkinURL]
}
