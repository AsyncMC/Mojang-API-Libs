package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CurrentPlayerIDs {
    /* The player UUID without hyphens */
    String id = 

    /* The current name being used by this player */
    String name = 

    /* If account has not been converted */
    Boolean legacy = false

    /* If the player has not puchased the game */
    Boolean demo = false

}
