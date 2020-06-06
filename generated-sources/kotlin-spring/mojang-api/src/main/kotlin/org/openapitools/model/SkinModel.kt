package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
* Values: eMPTY,slim
*/
enum class SkinModel(val value: String) {

    eMPTY(""),

    slim("slim");

}

