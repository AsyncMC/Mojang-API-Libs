package com.github.asyncmc.mojang.sessions.java.play.framework.model;

import com.github.asyncmc.mojang.sessions.java.play.framework.model.PlayerSkinURL;
import com.github.asyncmc.mojang.sessions.java.play.framework.model.PlayerTextureURL;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Provide links to the player&#39;s skin and cape
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:30.811111-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PlayerTexture   {
  @JsonProperty("SKIN")
  private PlayerSkinURL SKIN = null;

  @JsonProperty("CAPE")
  private PlayerTextureURL CAPE = null;

  public PlayerTexture SKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
    return this;
  }

   /**
   * Get SKIN
   * @return SKIN
  **/
  @Valid
  public PlayerSkinURL getSKIN() {
    return SKIN;
  }

  public void setSKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
  }

  public PlayerTexture CAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
    return this;
  }

   /**
   * Get CAPE
   * @return CAPE
  **/
  @Valid
  public PlayerTextureURL getCAPE() {
    return CAPE;
  }

  public void setCAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerTexture playerTexture = (PlayerTexture) o;
    return Objects.equals(SKIN, playerTexture.SKIN) &&
        Objects.equals(CAPE, playerTexture.CAPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SKIN, CAPE);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerTexture {\n");
    
    sb.append("    SKIN: ").append(toIndentedString(SKIN)).append("\n");
    sb.append("    CAPE: ").append(toIndentedString(CAPE)).append("\n");
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

