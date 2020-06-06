package com.github.asyncmc.mojang.sessions.java.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerSkinURL;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerTextureURL;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Provide links to the player&#39;s skin and cape
 */
@ApiModel(description = "Provide links to the player's skin and cape")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:35.513066100-03:00[America/Sao_Paulo]")

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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.SKIN, playerTexture.SKIN) &&
        Objects.equals(this.CAPE, playerTexture.CAPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SKIN, CAPE);
  }

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

