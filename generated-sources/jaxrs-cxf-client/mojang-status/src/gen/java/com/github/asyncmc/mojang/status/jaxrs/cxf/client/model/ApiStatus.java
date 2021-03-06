package com.github.asyncmc.mojang.status.jaxrs.cxf.client.model;

import io.swagger.annotations.ApiModel;


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

