package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrderStatisticsResponse._

case class OrderStatisticsResponse (
  /* total amount sold */
  total: Long,
/* total sold in last 24 hours */
  last24h: Long,
/* decimal average sales per second */
  saleVelocityPerSeconds: Double)

object OrderStatisticsResponse {
  import DateTimeCodecs._

  implicit val OrderStatisticsResponseCodecJson: CodecJson[OrderStatisticsResponse] = CodecJson.derive[OrderStatisticsResponse]
  implicit val OrderStatisticsResponseDecoder: EntityDecoder[OrderStatisticsResponse] = jsonOf[OrderStatisticsResponse]
  implicit val OrderStatisticsResponseEncoder: EntityEncoder[OrderStatisticsResponse] = jsonEncoderOf[OrderStatisticsResponse]
}
