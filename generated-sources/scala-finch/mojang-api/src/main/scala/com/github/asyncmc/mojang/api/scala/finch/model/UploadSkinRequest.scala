package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model.SkinModel
import java.io.File

/**
 * 
 * @param model 
 * @param file The skin image in PNG format
 */
case class UploadSkinRequest(model: Option[SkinModel],
                file: File
                )

object UploadSkinRequest {
    /**
     * Creates the codec for converting UploadSkinRequest from and to JSON.
     */
    implicit val decoder: Decoder[UploadSkinRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UploadSkinRequest] = deriveEncoder
}
