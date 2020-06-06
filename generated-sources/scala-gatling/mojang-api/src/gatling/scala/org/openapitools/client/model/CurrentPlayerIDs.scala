
package org.openapitools.client.model


case class CurrentPlayerIDs (
    /* The player UUID without hyphens */
    _id: String,
    /* The current name being used by this player */
    _name: String,
    /* If account has not been converted */
    _legacy: Option[Boolean],
    /* If the player has not puchased the game */
    _demo: Option[Boolean]
)
object CurrentPlayerIDs {
    def toStringBody(var_id: Object, var_name: Object, var_legacy: Object, var_demo: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"legacy":$var_legacy,"demo":$var_demo
        | }
        """.stripMargin
}
