package com.github.asyncmc.mojang.api.spring.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 */
public enum SkinModel {
  
  EMPTY(""),
  
  SLIM("slim");

  private String value;

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

