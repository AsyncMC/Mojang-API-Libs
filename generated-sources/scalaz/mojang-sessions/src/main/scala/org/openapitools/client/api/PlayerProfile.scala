package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerProfile._

case class PlayerProfile (
  /* The player UUID without hyphens */
  id: String,
name: String,
/* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
  legacy: Option[Boolean],
/* An array with all player properties, like skin and cape */
  properties: List[PlayerProfileProperty])

object PlayerProfile {
  import DateTimeCodecs._

  implicit val PlayerProfileCodecJson: CodecJson[PlayerProfile] = CodecJson.derive[PlayerProfile]
  implicit val PlayerProfileDecoder: EntityDecoder[PlayerProfile] = jsonOf[PlayerProfile]
  implicit val PlayerProfileEncoder: EntityEncoder[PlayerProfile] = jsonEncoderOf[PlayerProfile]
}
