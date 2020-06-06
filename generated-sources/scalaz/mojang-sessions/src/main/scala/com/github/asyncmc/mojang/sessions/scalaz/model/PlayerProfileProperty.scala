package com.github.asyncmc.mojang.sessions.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerProfileProperty._

case class PlayerProfileProperty (
  /* The property name */
  name: String,
/* The serialized property value in base64. */
  value: ByteArray,
/* signed data using Yggdrasil's private key */
  signature: Option[ByteArray])

object PlayerProfileProperty {
  import DateTimeCodecs._

  implicit val PlayerProfilePropertyCodecJson: CodecJson[PlayerProfileProperty] = CodecJson.derive[PlayerProfileProperty]
  implicit val PlayerProfilePropertyDecoder: EntityDecoder[PlayerProfileProperty] = jsonOf[PlayerProfileProperty]
  implicit val PlayerProfilePropertyEncoder: EntityEncoder[PlayerProfileProperty] = jsonEncoderOf[PlayerProfileProperty]
}
