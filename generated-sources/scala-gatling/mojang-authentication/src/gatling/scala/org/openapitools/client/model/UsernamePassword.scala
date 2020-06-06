
package org.openapitools.client.model


case class UsernamePassword (
    /* The Mojang account e-mail or username. Never store it. */
    _username: String,
    /* The Mojang account password, never store it. */
    _password: String
)
object UsernamePassword {
    def toStringBody(var_username: Object, var_password: Object) =
        s"""
        | {
        | "username":$var_username,"password":$var_password
        | }
        """.stripMargin
}
