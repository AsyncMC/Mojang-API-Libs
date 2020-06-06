package com.github.asyncmc.mojang.sessions.groovy.model;

import groovy.transform.Canonical
import com.github.asyncmc.mojang.sessions.groovy.model.PlayerSkinURL;
import com.github.asyncmc.mojang.sessions.groovy.model.PlayerTextureURL;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PlayerTexture {
    PlayerSkinURL SKIN = null

    PlayerTextureURL CAPE = null

}
