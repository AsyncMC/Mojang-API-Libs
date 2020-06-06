package com.github.asyncmc.mojang.sessions.java.vertx.model;

import java.util.Objects;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerTextureURL;

/**
 * Wraps the URL to the texture and configures the player&#39;s model
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerSkinURL extends PlayerTextureURL  {
  

  public PlayerSkinURL () {

  }

  public PlayerSkinURL () {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
