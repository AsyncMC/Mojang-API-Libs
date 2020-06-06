package com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The current player, demo and legacy status of a player identified by the id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T05:00:04.857622-03:00[America/Sao_Paulo]")
public class CurrentPlayerIDs   {
  

  private String id;

  private String name;

  private Boolean legacy = false;

  private Boolean demo = false;

  /**
   * The player UUID without hyphens
   **/
  
  @ApiModelProperty(example = "38ba542eb5924231a54cca0f2eac2b54", required = true, value = "The player UUID without hyphens")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The current name being used by this player
   **/
  
  @ApiModelProperty(example = "Alonelord", required = true, value = "The current name being used by this player")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * If account has not been converted
   **/
  
  @ApiModelProperty(value = "If account has not been converted")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  /**
   * If the player has not puchased the game
   **/
  
  @ApiModelProperty(value = "If the player has not puchased the game")
  @JsonProperty("demo")
  public Boolean getDemo() {
    return demo;
  }
  public void setDemo(Boolean demo) {
    this.demo = demo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentPlayerIDs currentPlayerIDs = (CurrentPlayerIDs) o;
    return Objects.equals(id, currentPlayerIDs.id) &&
        Objects.equals(name, currentPlayerIDs.name) &&
        Objects.equals(legacy, currentPlayerIDs.legacy) &&
        Objects.equals(demo, currentPlayerIDs.demo);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

