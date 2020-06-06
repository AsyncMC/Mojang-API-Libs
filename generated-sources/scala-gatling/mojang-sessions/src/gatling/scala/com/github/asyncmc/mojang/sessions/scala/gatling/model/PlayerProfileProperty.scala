
package com.github.asyncmc.mojang.sessions.scala.gatling.model


case class PlayerProfileProperty (
    /* The property name */
    _name: String,
    /* The serialized property value in base64. */
    _value: String,
    /* signed data using Yggdrasil's private key */
    _signature: Option[String]
)
object PlayerProfileProperty {
    def toStringBody(var_name: Object, var_value: Object, var_signature: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value,"signature":$var_signature
        | }
        """.stripMargin
}
