/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.io.File;
import java.util.*;
import org.openapitools.client.model.GameProfileProperty;
import org.openapitools.client.model.ReducedUserData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PrivateUserData extends ReducedUserData {
  
  @SerializedName("id")
  private File id = null;
  @SerializedName("properties")
  private List<GameProfileProperty> properties = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public File getId() {
    return id;
  }
  public void setId(File id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    PrivateUserData privateUserData = (PrivateUserData) o;
    return (this.id == null ? privateUserData.id == null : this.id.equals(privateUserData.id)) &&
        (this.properties == null ? privateUserData.properties == null : this.properties.equals(privateUserData.properties));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.properties == null ? 0: this.properties.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateUserData {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
