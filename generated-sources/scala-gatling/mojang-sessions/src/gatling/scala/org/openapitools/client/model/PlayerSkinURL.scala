
package org.openapitools.client.model


case class PlayerSkinURL (
    /* The URL to the texture, must be in Mojang's domains. */
    _url: String
)
object PlayerSkinURL {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
