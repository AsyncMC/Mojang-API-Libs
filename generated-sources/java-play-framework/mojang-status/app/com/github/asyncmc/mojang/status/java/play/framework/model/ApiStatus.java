package com.github.asyncmc.mojang.status.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */
public enum ApiStatus {
  
  GREEN("green"),
  
  YELLOW("yellow"),
  
  RED("red");

  private final String value;

  ApiStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApiStatus fromValue(String text) {
    for (ApiStatus b : ApiStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

