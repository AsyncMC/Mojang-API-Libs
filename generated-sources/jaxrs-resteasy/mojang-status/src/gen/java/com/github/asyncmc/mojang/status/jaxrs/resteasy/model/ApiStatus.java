package com.github.asyncmc.mojang.status.jaxrs.resteasy.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum ApiStatus {
    GREEN, YELLOW, RED
}
