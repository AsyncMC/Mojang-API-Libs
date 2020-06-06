
package org.openapitools.client.model


case class Agent (
    /* The name of the game */
    _name: Option[String],
    /* The agent version, usually 1. */
    _version: Option[Integer]
)
object Agent {
    def toStringBody(var_name: Object, var_version: Object) =
        s"""
        | {
        | "name":$var_name,"version":$var_version
        | }
        """.stripMargin
}
