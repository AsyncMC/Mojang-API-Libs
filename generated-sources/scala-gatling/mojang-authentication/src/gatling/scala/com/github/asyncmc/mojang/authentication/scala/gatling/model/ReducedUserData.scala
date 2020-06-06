
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class ReducedUserData (
    _id: Option[String],
    _properties: Option[List[GameProfileProperty]]
)
object ReducedUserData {
    def toStringBody(var_id: Object, var_properties: Object) =
        s"""
        | {
        | "id":$var_id,"properties":$var_properties
        | }
        """.stripMargin
}
