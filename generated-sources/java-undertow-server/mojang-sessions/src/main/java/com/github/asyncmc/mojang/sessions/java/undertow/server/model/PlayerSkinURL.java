package com.github.asyncmc.mojang.sessions.java.undertow.server.model;

import java.util.Objects;
import com.github.asyncmc.mojang.sessions.java.undertow.server.model.PlayerTextureURL;
import io.swagger.annotations.ApiModel;



/**
 * Wraps the URL to the texture and configures the player&#39;s model
 **/

@ApiModel(description = "Wraps the URL to the texture and configures the player's model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-06T02:32:42.773102900-03:00[America/Sao_Paulo]")
public class PlayerSkinURL extends PlayerTextureURL  {
  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSkinURL playerSkinURL = (PlayerSkinURL) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSkinURL {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

