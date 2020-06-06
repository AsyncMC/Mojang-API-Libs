
package org.openapitools.client.model


case class PlayerTexture (
    _SKIN: Option[PlayerSkinURL],
    _CAPE: Option[PlayerTextureURL]
)
object PlayerTexture {
    def toStringBody(var_SKIN: Object, var_CAPE: Object) =
        s"""
        | {
        | "SKIN":$var_SKIN,"CAPE":$var_CAPE
        | }
        """.stripMargin
}
