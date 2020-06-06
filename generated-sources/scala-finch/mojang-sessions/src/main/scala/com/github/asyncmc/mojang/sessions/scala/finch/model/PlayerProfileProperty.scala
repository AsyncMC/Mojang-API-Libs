package com.github.asyncmc.mojang.sessions.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.sessions.scala.finch.model.ByteArray

/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 * @param name The property name
 * @param value The serialized property value in base64.
 * @param signature signed data using Yggdrasil's private key
 */
case class PlayerProfileProperty(name: String,
                value: ByteArray,
                signature: Option[ByteArray]
                )

object PlayerProfileProperty {
    /**
     * Creates the codec for converting PlayerProfileProperty from and to JSON.
     */
    implicit val decoder: Decoder[PlayerProfileProperty] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerProfileProperty] = deriveEncoder
}
