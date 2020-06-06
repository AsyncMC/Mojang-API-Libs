package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The current player, demo and legacy status of a player identified by the id
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class CurrentPlayerIDs   {
  
  private String id = ;
  private String name = ;
  private Boolean legacy = false;
  private Boolean demo = false;

  public CurrentPlayerIDs () {

  }

  public CurrentPlayerIDs (String id, String name, Boolean legacy, Boolean demo) {
    this.id = id;
    this.name = name;
    this.legacy = legacy;
    this.demo = demo;
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
