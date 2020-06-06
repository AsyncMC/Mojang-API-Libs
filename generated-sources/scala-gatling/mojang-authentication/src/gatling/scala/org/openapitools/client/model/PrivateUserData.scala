
package org.openapitools.client.model

import java.io.File

case class PrivateUserData (
    _id: Option[File],
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
