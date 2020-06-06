package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PlayerSkinURL;
import org.openapitools.model.PlayerTextureURL;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Provide links to the player's skin and cape")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:15.936805500-03:00[America/Sao_Paulo]")
public class PlayerTexture   {
  
  private PlayerSkinURL SKIN = null;
  private PlayerTextureURL CAPE = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SKIN")
  public PlayerSkinURL getSKIN() {
    return SKIN;
  }
  public void setSKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CAPE")
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

