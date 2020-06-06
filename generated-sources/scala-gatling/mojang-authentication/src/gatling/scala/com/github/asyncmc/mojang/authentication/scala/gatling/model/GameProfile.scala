
package com.github.asyncmc.mojang.authentication.scala.gatling.model


case class GameProfile (
    _agent: Option[String],
    _id: Option[String],
    _name: Option[String],
    _userId: Option[String],
    /* Unix timestamp in milliseconds */
    _createdAt: Option[Long],
    _legacyProfile: Option[Boolean],
    _suspended: Option[Boolean],
    _paid: Option[Boolean],
    _migrated: Option[Boolean],
    _legacy: Option[Boolean]
)
object GameProfile {
    def toStringBody(var_agent: Object, var_id: Object, var_name: Object, var_userId: Object, var_createdAt: Object, var_legacyProfile: Object, var_suspended: Object, var_paid: Object, var_migrated: Object, var_legacy: Object) =
        s"""
        | {
        | "agent":$var_agent,"id":$var_id,"name":$var_name,"userId":$var_userId,"createdAt":$var_createdAt,"legacyProfile":$var_legacyProfile,"suspended":$var_suspended,"paid":$var_paid,"migrated":$var_migrated,"legacy":$var_legacy
        | }
        """.stripMargin
}
