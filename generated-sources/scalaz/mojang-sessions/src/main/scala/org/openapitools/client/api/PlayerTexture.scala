package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerTexture._

case class PlayerTexture (
  SKIN: Option[PlayerSkinURL],
CAPE: Option[PlayerTextureURL])

object PlayerTexture {
  import DateTimeCodecs._

  implicit val PlayerTextureCodecJson: CodecJson[PlayerTexture] = CodecJson.derive[PlayerTexture]
  implicit val PlayerTextureDecoder: EntityDecoder[PlayerTexture] = jsonOf[PlayerTexture]
  implicit val PlayerTextureEncoder: EntityEncoder[PlayerTexture] = jsonEncoderOf[PlayerTexture]
}
