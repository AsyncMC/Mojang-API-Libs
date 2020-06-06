
package org.openapitools.client.model


case class Inline_object_1 (
    _model: Option[SkinModel],
    /* The URL which Mojang servers will download and apply the skin */
    _url: String
)
object Inline_object_1 {
    def toStringBody(var_model: Object, var_url: Object) =
        s"""
        | {
        | "model":$var_model,"url":$var_url
        | }
        """.stripMargin
}
