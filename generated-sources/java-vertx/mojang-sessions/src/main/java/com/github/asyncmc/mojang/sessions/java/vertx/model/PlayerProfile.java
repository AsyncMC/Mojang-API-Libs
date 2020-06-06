package com.github.asyncmc.mojang.sessions.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerProfileProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerProfile   {
  
  private String id = ;
  private String name = ;
  private Boolean legacy = false;
  private List<PlayerProfileProperty> properties = new ArrayList<>();

  public PlayerProfile () {

  }

  public PlayerProfile (String id, String name, Boolean legacy, List<PlayerProfileProperty> properties) {
    this.id = id;
    this.name = name;
    this.legacy = legacy;
    this.properties = properties;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

    
  @JsonProperty("properties")
  public List<PlayerProfileProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
