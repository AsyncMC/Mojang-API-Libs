
package org.openapitools.client.model


case class NameChange (
    /* The new player name */
    _name: String,
    /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
    _changedToAt: Option[Long]
)
object NameChange {
    def toStringBody(var_name: Object, var_changedToAt: Object) =
        s"""
        | {
        | "name":$var_name,"changedToAt":$var_changedToAt
        | }
        """.stripMargin
}
