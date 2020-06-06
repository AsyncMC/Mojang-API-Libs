package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
* Values: green,yellow,red
*/
enum class ApiStatus(val value: String) {

    green("green"),

    yellow("yellow"),

    red("red");

}

