package com.github.asyncmc.mojang.sessions.java.inflector.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.sessions.java.inflector.model.PlayerProfileProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-06T04:59:15.983452700-03:00[America/Sao_Paulo]")
public class PlayerProfile   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("legacy")
  private Boolean legacy = false;

  @JsonProperty("properties")
  private List<PlayerProfileProperty> properties = new ArrayList<PlayerProfileProperty>();

  /**
   * The player UUID without hyphens
   **/
  public PlayerProfile id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public PlayerProfile name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "jeb_", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
   **/
  public PlayerProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

  
  @ApiModelProperty(value = "Will appear in the response if the user has not migrated their minecraft.net account to Mojang.")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  /**
   * An array with all player properties, like skin and cape
   **/
  public PlayerProfile properties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An array with all player properties, like skin and cape")
  @JsonProperty("properties")
  public List<PlayerProfileProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerProfile playerProfile = (PlayerProfile) o;
    return Objects.equals(id, playerProfile.id) &&
        Objects.equals(name, playerProfile.name) &&
        Objects.equals(legacy, playerProfile.legacy) &&
        Objects.equals(properties, playerProfile.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, legacy, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

