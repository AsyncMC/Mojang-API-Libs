package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PlayerSkinURL;
import org.openapitools.model.PlayerTextureURL;

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
  * Provide links to the player's skin and cape
 **/
@ApiModel(description="Provide links to the player's skin and cape")
public class PlayerTexture  {
  
  @ApiModelProperty(value = "")
  private PlayerSkinURL SKIN = null;

  @ApiModelProperty(value = "")
  private PlayerTextureURL CAPE = null;
 /**
   * Get SKIN
   * @return SKIN
  **/
  @JsonProperty("SKIN")
  public PlayerSkinURL getSKIN() {
    return SKIN;
  }

  public void setSKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
  }

  public PlayerTexture SKIN(PlayerSkinURL SKIN) {
    this.SKIN = SKIN;
    return this;
  }

 /**
   * Get CAPE
   * @return CAPE
  **/
  @JsonProperty("CAPE")
  public PlayerTextureURL getCAPE() {
    return CAPE;
  }

  public void setCAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
  }

  public PlayerTexture CAPE(PlayerTextureURL CAPE) {
    this.CAPE = CAPE;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

