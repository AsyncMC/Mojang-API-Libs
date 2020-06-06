package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import NameChange._

case class NameChange (
  /* The new player name */
  name: String,
/* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
  changedToAt: Option[Long])

object NameChange {
  import DateTimeCodecs._

  implicit val NameChangeCodecJson: CodecJson[NameChange] = CodecJson.derive[NameChange]
  implicit val NameChangeDecoder: EntityDecoder[NameChange] = jsonOf[NameChange]
  implicit val NameChangeEncoder: EntityEncoder[NameChange] = jsonEncoderOf[NameChange]
}
