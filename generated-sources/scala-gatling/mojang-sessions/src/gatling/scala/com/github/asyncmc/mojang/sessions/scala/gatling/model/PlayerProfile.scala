
package com.github.asyncmc.mojang.sessions.scala.gatling.model


case class PlayerProfile (
    /* The player UUID without hyphens */
    _id: String,
    _name: String,
    /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
    _legacy: Option[Boolean],
    /* An array with all player properties, like skin and cape */
    _properties: List[PlayerProfileProperty]
)
object PlayerProfile {
    def toStringBody(var_id: Object, var_name: Object, var_legacy: Object, var_properties: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"legacy":$var_legacy,"properties":$var_properties
        | }
        """.stripMargin
}
