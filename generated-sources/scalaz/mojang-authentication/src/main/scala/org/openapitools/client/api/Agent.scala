package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Agent._

case class Agent (
  /* The name of the game */
  name: Option[Name],
/* The agent version, usually 1. */
  version: Option[Integer])

object Agent {
  import DateTimeCodecs._
  sealed trait Name
  case object Minecraft extends Name
  case object Scrolls extends Name

  object Name {
    def toName(s: String): Option[Name] = s match {
      case "Minecraft" => Some(Minecraft)
      case "Scrolls" => Some(Scrolls)
      case _ => None
    }

    def fromName(x: Name): String = x match {
      case Minecraft => "Minecraft"
      case Scrolls => "Scrolls"
    }
  }

  implicit val NameEnumEncoder: EncodeJson[Name] =
    EncodeJson[Name](is => StringEncodeJson(Name.fromName(is)))

  implicit val NameEnumDecoder: DecodeJson[Name] =
    DecodeJson.optionDecoder[Name](n => n.string.flatMap(jStr => Name.toName(jStr)), "Name failed to de-serialize")

  implicit val AgentCodecJson: CodecJson[Agent] = CodecJson.derive[Agent]
  implicit val AgentDecoder: EntityDecoder[Agent] = jsonOf[Agent]
  implicit val AgentEncoder: EntityEncoder[Agent] = jsonEncoderOf[Agent]
}
