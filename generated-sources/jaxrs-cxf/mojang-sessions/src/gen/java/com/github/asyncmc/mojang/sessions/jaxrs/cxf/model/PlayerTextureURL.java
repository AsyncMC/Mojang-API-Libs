package com.github.asyncmc.mojang.sessions.jaxrs.cxf.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Wraps the URL to the texture
 **/
@ApiModel(description="Wraps the URL to the texture")
public class PlayerTextureURL  {
  
  @ApiModelProperty(example = "http://textures.minecraft.net/texture/5786fe99be377dfb6858859f926c4dbc995751e91cee373468c5fbf4865e7151", required = true, value = "The URL to the texture, must be in Mojang's domains.")
 /**
   * The URL to the texture, must be in Mojang's domains.
  **/
  private String url;
 /**
   * The URL to the texture, must be in Mojang&#39;s domains.
   * @return url
  **/
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PlayerTextureURL url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerTextureURL {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

