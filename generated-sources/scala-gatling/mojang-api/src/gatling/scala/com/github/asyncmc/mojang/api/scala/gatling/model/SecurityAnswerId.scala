
package com.github.asyncmc.mojang.api.scala.gatling.model


case class SecurityAnswerId (
    /* A number giver by Mojang to reply a question */
    _id: Integer
)
object SecurityAnswerId {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
