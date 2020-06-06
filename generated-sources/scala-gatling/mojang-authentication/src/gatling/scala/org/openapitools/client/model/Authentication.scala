
package org.openapitools.client.model


case class Authentication (
    _accessToken: String,
    _clientToken: Option[String]
)
object Authentication {
    def toStringBody(var_accessToken: Object, var_clientToken: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"clientToken":$var_clientToken
        | }
        """.stripMargin
}
