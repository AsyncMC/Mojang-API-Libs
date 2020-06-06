package com.github.asyncmc.mojang.authentication.groovy.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Agent {
    /* The name of the game */
    String name = NameEnum.MINECRAFT

    /* The agent version, usually 1. */
    Integer version = 1

}
