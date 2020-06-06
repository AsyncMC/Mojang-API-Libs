package com.github.asyncmc.mojang.sessions.groovy.model;

import groovy.transform.Canonical
import com.github.asyncmc.mojang.sessions.groovy.model.PlayerProfileProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

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
