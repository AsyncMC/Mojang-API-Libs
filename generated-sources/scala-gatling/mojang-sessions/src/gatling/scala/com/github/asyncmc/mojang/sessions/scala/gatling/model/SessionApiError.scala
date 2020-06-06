
package com.github.asyncmc.mojang.sessions.scala.gatling.model


case class SessionApiError (
    /* A message describing the error */
    _error: Option[String],
    /* The request path */
    _path: Option[String]
)
object SessionApiError {
    def toStringBody(var_error: Object, var_path: Object) =
        s"""
        | {
        | "error":$var_error,"path":$var_path
        | }
        """.stripMargin
}
