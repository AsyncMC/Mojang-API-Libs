/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.sessions.android.model;

import com.github.asyncmc.mojang.sessions.android.model.PlayerTextureURL;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Wraps the URL to the texture and configures the player&#39;s model
 **/
@ApiModel(description = "Wraps the URL to the texture and configures the player's model")
public class PlayerSkinURL extends PlayerTextureURL {
  
  @SerializedName("url")
  private String url = null;

  /**
   * The URL to the texture, must be in Mojang's domains.
   **/
  @ApiModelProperty(required = true, value = "The URL to the texture, must be in Mojang's domains.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSkinURL playerSkinURL = (PlayerSkinURL) o;
    return (this.url == null ? playerSkinURL.url == null : this.url.equals(playerSkinURL.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSkinURL {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}