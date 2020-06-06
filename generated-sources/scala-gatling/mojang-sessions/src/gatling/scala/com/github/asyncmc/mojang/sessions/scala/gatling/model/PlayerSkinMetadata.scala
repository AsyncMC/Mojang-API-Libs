
package com.github.asyncmc.mojang.sessions.scala.gatling.model


case class PlayerSkinMetadata (
    /* The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent. */
    _model: Option[String]
)
object PlayerSkinMetadata {
    def toStringBody(var_model: Object) =
        s"""
        | {
        | "model":$var_model
        | }
        """.stripMargin
}
