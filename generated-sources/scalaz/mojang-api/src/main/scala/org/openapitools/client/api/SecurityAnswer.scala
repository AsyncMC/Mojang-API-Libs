package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SecurityAnswer._

case class SecurityAnswer (
  /* A number giver by Mojang to reply a question */
  id: Integer)

object SecurityAnswer {
  import DateTimeCodecs._

  implicit val SecurityAnswerCodecJson: CodecJson[SecurityAnswer] = CodecJson.derive[SecurityAnswer]
  implicit val SecurityAnswerDecoder: EntityDecoder[SecurityAnswer] = jsonOf[SecurityAnswer]
  implicit val SecurityAnswerEncoder: EntityEncoder[SecurityAnswer] = jsonEncoderOf[SecurityAnswer]
}
