package com.github.asyncmc.mojang.api.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 */
public enum SkinModel {
  
  EMPTY(""),
  
  SLIM("slim");

  private final String value;

  SkinModel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SkinModel fromValue(String text) {
    for (SkinModel b : SkinModel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

