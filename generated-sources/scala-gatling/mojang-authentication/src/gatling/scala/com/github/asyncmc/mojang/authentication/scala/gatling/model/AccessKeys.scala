
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class AccessKeys (
    _accessToken: String,
    _clientToken: Option[String]
)
object AccessKeys {
    def toStringBody(var_accessToken: Object, var_clientToken: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"clientToken":$var_clientToken
        | }
        """.stripMargin
}
