package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerProfileTexturePropertyValue._

case class PlayerProfileTexturePropertyValue (
  /* UNIX timestamp in milliseconds */
  timestamp: Long,
/* The player UUID without hyphens */
  profileId: String,
/* The player's name */
  profileName: String,
/* Only present if unsigned was set to false in the request */
  signatureRequired: Option[Boolean],
textures: Option[PlayerTexture])

object PlayerProfileTexturePropertyValue {
  import DateTimeCodecs._

  implicit val PlayerProfileTexturePropertyValueCodecJson: CodecJson[PlayerProfileTexturePropertyValue] = CodecJson.derive[PlayerProfileTexturePropertyValue]
  implicit val PlayerProfileTexturePropertyValueDecoder: EntityDecoder[PlayerProfileTexturePropertyValue] = jsonOf[PlayerProfileTexturePropertyValue]
  implicit val PlayerProfileTexturePropertyValueEncoder: EntityEncoder[PlayerProfileTexturePropertyValue] = jsonEncoderOf[PlayerProfileTexturePropertyValue]
}
