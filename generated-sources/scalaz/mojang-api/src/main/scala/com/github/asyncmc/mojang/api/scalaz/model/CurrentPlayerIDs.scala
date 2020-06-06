package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import CurrentPlayerIDs._

case class CurrentPlayerIDs (
  /* The player UUID without hyphens */
  id: String,
/* The current name being used by this player */
  name: String,
/* If account has not been converted */
  legacy: Option[Boolean],
/* If the player has not puchased the game */
  demo: Option[Boolean])

object CurrentPlayerIDs {
  import DateTimeCodecs._

  implicit val CurrentPlayerIDsCodecJson: CodecJson[CurrentPlayerIDs] = CodecJson.derive[CurrentPlayerIDs]
  implicit val CurrentPlayerIDsDecoder: EntityDecoder[CurrentPlayerIDs] = jsonOf[CurrentPlayerIDs]
  implicit val CurrentPlayerIDsEncoder: EntityEncoder[CurrentPlayerIDs] = jsonEncoderOf[CurrentPlayerIDs]
}
