
package com.github.asyncmc.mojang.api.scala.gatling.model


case class Error (
    _error: Option[String],
    _errorMessage: Option[String]
)
object Error {
    def toStringBody(var_error: Object, var_errorMessage: Object) =
        s"""
        | {
        | "error":$var_error,"errorMessage":$var_errorMessage
        | }
        """.stripMargin
}
