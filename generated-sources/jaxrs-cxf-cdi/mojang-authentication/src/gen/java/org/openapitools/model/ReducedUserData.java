package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GameProfileProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ReducedUserData   {
  
  private File id;

  private List<GameProfileProperty> properties = null;


  /**
   **/
  public ReducedUserData id(File id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public File getId() {
    return id;
  }
  public void setId(File id) {
    this.id = id;
  }


  /**
   **/
  public ReducedUserData properties(List<GameProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public List<GameProfileProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<GameProfileProperty> properties) {
    this.properties = properties;
  }

  public ReducedUserData addPropertiesItem(GameProfileProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<GameProfileProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

