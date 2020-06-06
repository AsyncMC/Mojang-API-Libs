
package org.openapitools.client.model


case class SecurityAnswer (
    /* A number giver by Mojang to reply a question */
    _id: Integer
)
object SecurityAnswer {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
