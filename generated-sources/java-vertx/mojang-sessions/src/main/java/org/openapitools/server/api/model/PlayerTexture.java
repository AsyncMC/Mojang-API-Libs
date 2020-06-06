package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.PlayerSkinURL;
import org.openapitools.server.api.model.PlayerTextureURL;

/**
 * Provide links to the player&#39;s skin and cape
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerTexture   {
  
  private PlayerSkinURL SKIN = null;
  private PlayerTextureURL CAPE = null;

  public PlayerTexture () {

  }

  public PlayerTexture (PlayerSkinURL SKIN, PlayerTextureURL CAPE) {
    this.SKIN = SKIN;
    this.CAPE = CAPE;
  }

    
  @JsonProperty("SKIN")
  public PlayerSkinURL getSKIN() {
    return SKIN;
  }
  public void setSKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
  }

    
  @JsonProperty("CAPE")
  public PlayerTextureURL getCAPE() {
    return CAPE;
  }
  public void setCAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
