
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class ProfileId (
    _id: String,
    /* The player name */
    _name: String
)
object ProfileId {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
