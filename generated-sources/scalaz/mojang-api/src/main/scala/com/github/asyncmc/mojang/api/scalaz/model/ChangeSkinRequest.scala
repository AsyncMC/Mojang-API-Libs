package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ChangeSkinRequest._

case class ChangeSkinRequest (
  model: Option[SkinModel],
/* The URL which Mojang servers will download and apply the skin */
  url: String)

object ChangeSkinRequest {
  import DateTimeCodecs._

  implicit val ChangeSkinRequestCodecJson: CodecJson[ChangeSkinRequest] = CodecJson.derive[ChangeSkinRequest]
  implicit val ChangeSkinRequestDecoder: EntityDecoder[ChangeSkinRequest] = jsonOf[ChangeSkinRequest]
  implicit val ChangeSkinRequestEncoder: EntityEncoder[ChangeSkinRequest] = jsonEncoderOf[ChangeSkinRequest]
}
