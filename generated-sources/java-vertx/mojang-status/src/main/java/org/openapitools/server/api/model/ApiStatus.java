package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */
public enum ApiStatus {
  
  GREEN("green"),
  
  YELLOW("yellow"),
  
  RED("red");

  private String value;

  ApiStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApiStatus fromValue(String text) {
    for (ApiStatus b : ApiStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}