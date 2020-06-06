package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SkinModel._

case class SkinModel (
  
object SkinModel {
  import DateTimeCodecs._

  implicit val SkinModelCodecJson: CodecJson[SkinModel] = CodecJson.derive[SkinModel]
  implicit val SkinModelDecoder: EntityDecoder[SkinModel] = jsonOf[SkinModel]
  implicit val SkinModelEncoder: EntityEncoder[SkinModel] = jsonEncoderOf[SkinModel]
}
