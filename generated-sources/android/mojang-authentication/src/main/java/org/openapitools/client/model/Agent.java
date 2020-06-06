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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Identifies the software doing the request
 **/
@ApiModel(description = "Identifies the software doing the request")
public class Agent {
  
  public enum NameEnum {
     Minecraft,  Scrolls, 
  };
  @SerializedName("name")
  private NameEnum name = Minecraft;
  @SerializedName("version")
  private Integer version = 1;

  /**
   * The name of the game
   **/
  @ApiModelProperty(value = "The name of the game")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  /**
   * The agent version, usually 1.
   **/
  @ApiModelProperty(value = "The agent version, usually 1.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return (this.name == null ? agent.name == null : this.name.equals(agent.name)) &&
        (this.version == null ? agent.version == null : this.version.equals(agent.version));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
