package com.github.asyncmc.mojang.sessions.java.inflector.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Wraps the URL to the texture
 **/

@ApiModel(description = "Wraps the URL to the texture")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-06T04:59:15.983452700-03:00[America/Sao_Paulo]")
public class PlayerTextureURL   {
  @JsonProperty("url")
  private String url;

  /**
   * The URL to the texture, must be in Mojang's domains.
   **/
  public PlayerTextureURL url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "http://textures.minecraft.net/texture/5786fe99be377dfb6858859f926c4dbc995751e91cee373468c5fbf4865e7151", required = true, value = "The URL to the texture, must be in Mojang's domains.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerTextureURL playerTextureURL = (PlayerTextureURL) o;
    return Objects.equals(url, playerTextureURL.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

