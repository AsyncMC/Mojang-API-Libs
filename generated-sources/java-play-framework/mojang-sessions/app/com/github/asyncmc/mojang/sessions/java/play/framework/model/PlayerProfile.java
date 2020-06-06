package com.github.asyncmc.mojang.sessions.java.play.framework.model;

import com.github.asyncmc.mojang.sessions.java.play.framework.model.PlayerProfileProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PlayerProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:30.811111-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PlayerProfile   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("legacy")
  private Boolean legacy = false;

  @JsonProperty("properties")
  private List<PlayerProfileProperty> properties = new ArrayList<>();

  public PlayerProfile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The player UUID without hyphens
   * @return id
  **/
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PlayerProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

   /**
   * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
   * @return legacy
  **/
    public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public PlayerProfile properties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  public PlayerProfile addPropertiesItem(PlayerProfileProperty propertiesItem) {
    properties.add(propertiesItem);
    return this;
  }

   /**
   * An array with all player properties, like skin and cape
   * @return properties
  **/
  @NotNull
@Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

