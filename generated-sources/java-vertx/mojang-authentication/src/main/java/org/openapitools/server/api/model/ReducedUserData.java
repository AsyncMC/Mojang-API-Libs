package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.GameProfileProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ReducedUserData   {
  
  private File id = ;
  private List<GameProfileProperty> properties = new ArrayList<>();

  public ReducedUserData () {

  }

  public ReducedUserData (File id, List<GameProfileProperty> properties) {
    this.id = id;
    this.properties = properties;
  }

    
  @JsonProperty("id")
  public File getId() {
    return id;
  }
  public void setId(File id) {
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
