package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PlayerTexture;

@Canonical
class PlayerProfileTexturePropertyValue {
    /* UNIX timestamp in milliseconds */
    Long timestamp = 

    /* The player UUID without hyphens */
    String profileId = 

    /* The player's name */
    String profileName = 

    /* Only present if unsigned was set to false in the request */
    Boolean signatureRequired = false

    PlayerTexture textures = null

}
