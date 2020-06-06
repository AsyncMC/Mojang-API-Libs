
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class GameProfileProperty (
    _name: Option[String],
    _value: Option[String]
)
object GameProfileProperty {
    def toStringBody(var_name: Object, var_value: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value
        | }
        """.stripMargin
}
