
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class RefreshResponse (
    _accessToken: String,
    _clientToken: Option[String]
)
object RefreshResponse {
    def toStringBody(var_accessToken: Object, var_clientToken: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"clientToken":$var_clientToken
        | }
        """.stripMargin
}
