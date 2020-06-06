
package org.openapitools.client.model


case class PlayerTextureURL (
    /* The URL to the texture, must be in Mojang's domains. */
    _url: String
)
object PlayerTextureURL {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
