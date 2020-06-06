package com.github.asyncmc.mojang.api.scalaz.model

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrderStatistic._

case class OrderStatistic (
  
object OrderStatistic {
  import DateTimeCodecs._

  implicit val OrderStatisticCodecJson: CodecJson[OrderStatistic] = CodecJson.derive[OrderStatistic]
  implicit val OrderStatisticDecoder: EntityDecoder[OrderStatistic] = jsonOf[OrderStatistic]
  implicit val OrderStatisticEncoder: EntityEncoder[OrderStatistic] = jsonEncoderOf[OrderStatistic]
}
