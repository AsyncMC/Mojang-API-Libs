package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrderStatisticsRequest._

case class OrderStatisticsRequest (
  metricKeys: List[OrderStatistic])

object OrderStatisticsRequest {
  import DateTimeCodecs._

  implicit val OrderStatisticsRequestCodecJson: CodecJson[OrderStatisticsRequest] = CodecJson.derive[OrderStatisticsRequest]
  implicit val OrderStatisticsRequestDecoder: EntityDecoder[OrderStatisticsRequest] = jsonOf[OrderStatisticsRequest]
  implicit val OrderStatisticsRequestEncoder: EntityEncoder[OrderStatisticsRequest] = jsonEncoderOf[OrderStatisticsRequest]
}
