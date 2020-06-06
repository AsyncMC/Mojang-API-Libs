package com.github.asyncmc.mojang.authentication.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.authentication.java.vertx.model.GameProfileProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ReducedUserData   {
  
  private String id = ;
  private List<GameProfileProperty> properties = new ArrayList<>();

  public ReducedUserData () {

  }

  public ReducedUserData (String id, List<GameProfileProperty> properties) {
    this.id = id;
    this.properties = properties;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("properties")
  public List<GameProfileProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<GameProfileProperty> properties) {
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
    ReducedUserData reducedUserData = (ReducedUserData) o;
    return Objects.equals(id, reducedUserData.id) &&
        Objects.equals(properties, reducedUserData.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReducedUserData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
