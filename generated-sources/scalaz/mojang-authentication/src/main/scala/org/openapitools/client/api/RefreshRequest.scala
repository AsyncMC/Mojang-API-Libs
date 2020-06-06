package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import RefreshRequest._

case class RefreshRequest (
  accessToken: String,
clientToken: Option[String])

object RefreshRequest {
  import DateTimeCodecs._

  implicit val RefreshRequestCodecJson: CodecJson[RefreshRequest] = CodecJson.derive[RefreshRequest]
  implicit val RefreshRequestDecoder: EntityDecoder[RefreshRequest] = jsonOf[RefreshRequest]
  implicit val RefreshRequestEncoder: EntityEncoder[RefreshRequest] = jsonEncoderOf[RefreshRequest]
}
