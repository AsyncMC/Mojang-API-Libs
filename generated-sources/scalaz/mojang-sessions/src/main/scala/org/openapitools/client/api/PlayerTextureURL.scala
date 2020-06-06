package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PlayerTextureURL._

case class PlayerTextureURL (
  /* The URL to the texture, must be in Mojang's domains. */
  url: String)

object PlayerTextureURL {
  import DateTimeCodecs._

  implicit val PlayerTextureURLCodecJson: CodecJson[PlayerTextureURL] = CodecJson.derive[PlayerTextureURL]
  implicit val PlayerTextureURLDecoder: EntityDecoder[PlayerTextureURL] = jsonOf[PlayerTextureURL]
  implicit val PlayerTextureURLEncoder: EntityEncoder[PlayerTextureURL] = jsonEncoderOf[PlayerTextureURL]
}
