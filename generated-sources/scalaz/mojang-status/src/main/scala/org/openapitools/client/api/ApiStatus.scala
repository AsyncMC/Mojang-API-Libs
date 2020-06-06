package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ApiStatus._

case class ApiStatus (
  
object ApiStatus {
  import DateTimeCodecs._

  implicit val ApiStatusCodecJson: CodecJson[ApiStatus] = CodecJson.derive[ApiStatus]
  implicit val ApiStatusDecoder: EntityDecoder[ApiStatus] = jsonOf[ApiStatus]
  implicit val ApiStatusEncoder: EntityEncoder[ApiStatus] = jsonEncoderOf[ApiStatus]
}
