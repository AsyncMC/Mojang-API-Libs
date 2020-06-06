
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class PrivateUserData (
    _id: Option[String],
    _properties: Option[List[GameProfileProperty]]
)
object PrivateUserData {
    def toStringBody(var_id: Object, var_properties: Object) =
        s"""
        | {
        | "id":$var_id,"properties":$var_properties
        | }
        """.stripMargin
}
