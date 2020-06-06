/*
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.sessions.java.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.asyncmc.mojang.sessions.java.model.PlayerSkinURL;
import com.github.asyncmc.mojang.sessions.java.model.PlayerTextureURL;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provide links to the player&#39;s skin and cape
 */
@ApiModel(description = "Provide links to the player's skin and cape")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-06T02:32:28.129510600-03:00[America/Sao_Paulo]")
public class PlayerTexture {
  public static final String SERIALIZED_NAME_S_K_I_N = "SKIN";
  @SerializedName(SERIALIZED_NAME_S_K_I_N)
  private PlayerSkinURL SKIN = null;

  public static final String SERIALIZED_NAME_C_A_P_E = "CAPE";
  @SerializedName(SERIALIZED_NAME_C_A_P_E)
  private PlayerTextureURL CAPE = null;

  public PlayerTexture SKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
    return this;
  }

   /**
   * Get SKIN
   * @return SKIN
  **/
  @ApiModelProperty(value = "")
  public PlayerSkinURL getSKIN() {
    return SKIN;
  }

  public void setSKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
  }

  public PlayerTexture CAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
    return this;
  }

   /**
   * Get CAPE
   * @return CAPE
  **/
  @ApiModelProperty(value = "")
  public PlayerTextureURL getCAPE() {
    return CAPE;
  }

  public void setCAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerTexture playerTexture = (PlayerTexture) o;
    return Objects.equals(this.SKIN, playerTexture.SKIN) &&
        Objects.equals(this.CAPE, playerTexture.CAPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SKIN, CAPE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerTexture {\n");
    
    sb.append("    SKIN: ").append(toIndentedString(SKIN)).append("\n");
    sb.append("    CAPE: ").append(toIndentedString(CAPE)).append("\n");
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
