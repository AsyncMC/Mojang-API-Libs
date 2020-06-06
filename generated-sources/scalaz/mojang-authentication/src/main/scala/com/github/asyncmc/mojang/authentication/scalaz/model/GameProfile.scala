package com.github.asyncmc.mojang.authentication.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import GameProfile._

case class GameProfile (
  agent: Option[String],
id: Option[String],
name: Option[String],
userId: Option[String],
/* Unix timestamp in milliseconds */
  createdAt: Option[Long],
legacyProfile: Option[Boolean],
suspended: Option[Boolean],
paid: Option[Boolean],
migrated: Option[Boolean],
legacy: Option[Boolean])

object GameProfile {
  import DateTimeCodecs._

  implicit val GameProfileCodecJson: CodecJson[GameProfile] = CodecJson.derive[GameProfile]
  implicit val GameProfileDecoder: EntityDecoder[GameProfile] = jsonOf[GameProfile]
  implicit val GameProfileEncoder: EntityEncoder[GameProfile] = jsonEncoderOf[GameProfile]
}
