
package org.openapitools.client.model

import java.io.File

case class Inline_object (
    _model: Option[SkinModel],
    /* The skin image in PNG format */
    _file: File
)
object Inline_object {
    def toStringBody(var_model: Object, var_file: Object) =
        s"""
        | {
        | "model":$var_model,"file":$var_file
        | }
        """.stripMargin
}
