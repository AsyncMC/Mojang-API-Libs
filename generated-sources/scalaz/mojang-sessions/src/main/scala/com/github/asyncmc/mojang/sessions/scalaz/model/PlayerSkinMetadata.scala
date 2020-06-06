package com.github.asyncmc.mojang.sessions.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerSkinMetadata._

case class PlayerSkinMetadata (
  /* The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent. */
  model: Option[Model])

object PlayerSkinMetadata {
  import DateTimeCodecs._
  sealed trait Model
  case object Slim extends Model

  object Model {
    def toModel(s: String): Option[Model] = s match {
      case "Slim" => Some(Slim)
      case _ => None
    }

    def fromModel(x: Model): String = x match {
      case Slim => "Slim"
    }
  }

  implicit val ModelEnumEncoder: EncodeJson[Model] =
    EncodeJson[Model](is => StringEncodeJson(Model.fromModel(is)))

  implicit val ModelEnumDecoder: DecodeJson[Model] =
    DecodeJson.optionDecoder[Model](n => n.string.flatMap(jStr => Model.toModel(jStr)), "Model failed to de-serialize")

  implicit val PlayerSkinMetadataCodecJson: CodecJson[PlayerSkinMetadata] = CodecJson.derive[PlayerSkinMetadata]
  implicit val PlayerSkinMetadataDecoder: EntityDecoder[PlayerSkinMetadata] = jsonOf[PlayerSkinMetadata]
  implicit val PlayerSkinMetadataEncoder: EntityEncoder[PlayerSkinMetadata] = jsonEncoderOf[PlayerSkinMetadata]
}
