package com.github.asyncmc.mojang.sessions.scalaz.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._

import org.joda.time.DateTime

object DateTimeCodecs {
  implicit def dateTimeEncodeJson: EncodeJson[DateTime] =
    EncodeJson[DateTime](dt => StringEncodeJson(dt.toString))

  implicit def dateTimeDecodeJson: DecodeJson[DateTime] =
    DecodeJson.of[String].map(DateTime.parse(_)) setName "org.joda.time.DateTime"
}
