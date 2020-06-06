package com.github.asyncmc.mojang.api.groovy.model;

import groovy.transform.Canonical
import com.github.asyncmc.mojang.api.groovy.model.SkinModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChangeSkinRequest {
    SkinModel model = null

    /* The URL which Mojang servers will download and apply the skin */
    String url = 

}
