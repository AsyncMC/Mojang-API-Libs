package org.openapitools.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GameProfileProperty;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReducedUserData  {
  
  @ApiModelProperty(value = "")
  private File id;

  @ApiModelProperty(value = "")
  private List<GameProfileProperty> properties = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public File getId() {
    return id;
  }

  public void setId(File id) {
    this.id = id;
  }

  public ReducedUserData id(File id) {
    this.id = id;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public List<GameProfileProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<GameProfileProperty> properties) {
    this.properties = properties;
  }

  public ReducedUserData properties(List<GameProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ReducedUserData addPropertiesItem(GameProfileProperty propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

