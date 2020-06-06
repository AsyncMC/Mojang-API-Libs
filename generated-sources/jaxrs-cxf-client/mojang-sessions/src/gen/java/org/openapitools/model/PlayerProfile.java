package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PlayerProfileProperty;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerProfile  {
  
  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
 /**
   * The player UUID without hyphens
  **/
  private String id;

  @ApiModelProperty(example = "jeb_", required = true, value = "")
  private String name;

  @ApiModelProperty(value = "Will appear in the response if the user has not migrated their minecraft.net account to Mojang.")
 /**
   * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
  **/
  private Boolean legacy = false;

  @ApiModelProperty(required = true, value = "An array with all player properties, like skin and cape")
 /**
   * An array with all player properties, like skin and cape
  **/
  private List<PlayerProfileProperty> properties = new ArrayList<PlayerProfileProperty>();
 /**
   * The player UUID without hyphens
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PlayerProfile id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerProfile name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
   * @return legacy
  **/
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public PlayerProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

 /**
   * An array with all player properties, like skin and cape
   * @return properties
  **/
  @JsonProperty("properties")
  public List<PlayerProfileProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
  }

  public PlayerProfile properties(List<PlayerProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  public PlayerProfile addPropertiesItem(PlayerProfileProperty propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

