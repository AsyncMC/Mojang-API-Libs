package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PlayerProfileProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:15.936805500-03:00[America/Sao_Paulo]")
public class PlayerProfile   {
  
  private String id;
  private String name;
  private Boolean legacy = false;
  private List<PlayerProfileProperty> properties = new ArrayList<PlayerProfileProperty>();

  /**
   * The player UUID without hyphens
   **/
  
  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(example = "jeb_", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
   **/
  
  @ApiModelProperty(value = "Will appear in the response if the user has not migrated their minecraft.net account to Mojang.")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  /**
   * An array with all player properties, like skin and cape
   **/
  
  @ApiModelProperty(required = true, value = "An array with all player properties, like skin and cape")
  @JsonProperty("properties")
  @NotNull
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

