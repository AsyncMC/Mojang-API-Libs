package com.github.asyncmc.mojang.api.groovy.model;

import groovy.transform.Canonical
import com.github.asyncmc.mojang.api.groovy.model.SecurityAnswerId;
import com.github.asyncmc.mojang.api.groovy.model.SecurityQuestion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SecurityChallenge {
    SecurityQuestion question = null

    SecurityAnswerId answer = null

}
