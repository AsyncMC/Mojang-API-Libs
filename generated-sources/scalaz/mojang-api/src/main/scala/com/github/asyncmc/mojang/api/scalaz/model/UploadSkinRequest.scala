package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UploadSkinRequest._

case class UploadSkinRequest (
  model: Option[SkinModel],
/* The skin image in PNG format */
  file: File)

object UploadSkinRequest {
  import DateTimeCodecs._

  implicit val UploadSkinRequestCodecJson: CodecJson[UploadSkinRequest] = CodecJson.derive[UploadSkinRequest]
  implicit val UploadSkinRequestDecoder: EntityDecoder[UploadSkinRequest] = jsonOf[UploadSkinRequest]
  implicit val UploadSkinRequestEncoder: EntityEncoder[UploadSkinRequest] = jsonEncoderOf[UploadSkinRequest]
}
