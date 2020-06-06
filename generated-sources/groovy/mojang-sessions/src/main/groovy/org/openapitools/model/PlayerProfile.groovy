package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PlayerProfileProperty;

@Canonical
class PlayerProfile {
    /* The player UUID without hyphens */
    String id = 

    String name = 

    /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
    Boolean legacy = false

    /* An array with all player properties, like skin and cape */
    List<PlayerProfileProperty> properties = new ArrayList<PlayerProfileProperty>()

}
