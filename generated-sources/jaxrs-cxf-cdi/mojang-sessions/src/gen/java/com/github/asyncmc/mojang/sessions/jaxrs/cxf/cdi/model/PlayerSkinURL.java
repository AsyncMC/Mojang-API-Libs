package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.PlayerTextureURL;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Wraps the URL to the texture and configures the player&#39;s model
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Wraps the URL to the texture and configures the player's model")

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

