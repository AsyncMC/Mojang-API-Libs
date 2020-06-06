package com.github.asyncmc.mojang.status.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
* Values: GREEN,YELLOW,RED
*/
enum class ApiStatus(val value: String) {

    GREEN("green"),

    YELLOW("yellow"),

    RED("red");

}

