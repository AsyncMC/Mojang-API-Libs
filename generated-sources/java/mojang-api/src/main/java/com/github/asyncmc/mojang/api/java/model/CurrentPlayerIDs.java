/*
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.api.java.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The current player, demo and legacy status of a player identified by the id
 */
@ApiModel(description = "The current player, demo and legacy status of a player identified by the id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-06T02:32:26.085625400-03:00[America/Sao_Paulo]")
public class CurrentPlayerIDs {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LEGACY = "legacy";
  @SerializedName(SERIALIZED_NAME_LEGACY)
  private Boolean legacy = false;

  public static final String SERIALIZED_NAME_DEMO = "demo";
  @SerializedName(SERIALIZED_NAME_DEMO)
  private Boolean demo = false;

  public CurrentPlayerIDs id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The player UUID without hyphens
   * @return id
  **/
  @ApiModelProperty(example = "38ba542eb5924231a54cca0f2eac2b54", required = true, value = "The player UUID without hyphens")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentPlayerIDs name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The current name being used by this player
   * @return name
  **/
  @ApiModelProperty(example = "Alonelord", required = true, value = "The current name being used by this player")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrentPlayerIDs legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

   /**
   * If account has not been converted
   * @return legacy
  **/
  @ApiModelProperty(value = "If account has not been converted")
  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public CurrentPlayerIDs demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * If the player has not puchased the game
   * @return demo
  **/
  @ApiModelProperty(value = "If the player has not puchased the game")
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentPlayerIDs currentPlayerIDs = (CurrentPlayerIDs) o;
    return Objects.equals(this.id, currentPlayerIDs.id) &&
        Objects.equals(this.name, currentPlayerIDs.name) &&
        Objects.equals(this.legacy, currentPlayerIDs.legacy) &&
        Objects.equals(this.demo, currentPlayerIDs.demo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, legacy, demo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentPlayerIDs {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

