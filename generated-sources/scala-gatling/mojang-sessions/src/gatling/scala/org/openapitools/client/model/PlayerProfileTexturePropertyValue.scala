
package org.openapitools.client.model


case class PlayerProfileTexturePropertyValue (
    /* UNIX timestamp in milliseconds */
    _timestamp: Long,
    /* The player UUID without hyphens */
    _profileId: String,
    /* The player's name */
    _profileName: String,
    /* Only present if unsigned was set to false in the request */
    _signatureRequired: Option[Boolean],
    _textures: Option[PlayerTexture]
)
object PlayerProfileTexturePropertyValue {
    def toStringBody(var_timestamp: Object, var_profileId: Object, var_profileName: Object, var_signatureRequired: Object, var_textures: Object) =
        s"""
        | {
        | "timestamp":$var_timestamp,"profileId":$var_profileId,"profileName":$var_profileName,"signatureRequired":$var_signatureRequired,"textures":$var_textures
        | }
        """.stripMargin
}
