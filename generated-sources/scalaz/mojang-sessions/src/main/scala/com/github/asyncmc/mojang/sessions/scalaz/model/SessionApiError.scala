package com.github.asyncmc.mojang.sessions.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SessionApiError._

case class SessionApiError (
  /* A message describing the error */
  error: Option[String],
/* The request path */
  `path`: Option[String])

object SessionApiError {
  import DateTimeCodecs._

  implicit val SessionApiErrorCodecJson: CodecJson[SessionApiError] = CodecJson.derive[SessionApiError]
  implicit val SessionApiErrorDecoder: EntityDecoder[SessionApiError] = jsonOf[SessionApiError]
  implicit val SessionApiErrorEncoder: EntityEncoder[SessionApiError] = jsonEncoderOf[SessionApiError]
}
