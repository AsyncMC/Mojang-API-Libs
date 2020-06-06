
package com.github.asyncmc.mojang.api.scala.gatling.model

import java.io.File

case class UploadSkinRequest (
    _model: Option[SkinModel],
    /* The skin image in PNG format */
    _file: File
)
object UploadSkinRequest {
    def toStringBody(var_model: Object, var_file: Object) =
        s"""
        | {
        | "model":$var_model,"file":$var_file
        | }
        """.stripMargin
}
