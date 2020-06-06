
package com.github.asyncmc.mojang.api.scala.gatling.model


case class ChangeSkinRequest (
    _model: Option[SkinModel],
    /* The URL which Mojang servers will download and apply the skin */
    _url: String
)
object ChangeSkinRequest {
    def toStringBody(var_model: Object, var_url: Object) =
        s"""
        | {
        | "model":$var_model,"url":$var_url
        | }
        """.stripMargin
}
