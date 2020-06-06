package com.github.asyncmc.mojang.api.jaxrs.cxf.client.model;

import io.swagger.annotations.ApiModel;


/**
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 */
public enum SkinModel {
  
  EMPTY(""),
  
  SLIM("slim");

  private String value;

  SkinModel(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SkinModel fromValue(String text) {
    for (SkinModel b : SkinModel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
  
}

