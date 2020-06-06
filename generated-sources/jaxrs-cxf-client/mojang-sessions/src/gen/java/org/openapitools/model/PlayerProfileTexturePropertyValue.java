package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PlayerTexture;

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
  * This is obtained by decoding the \"textures\" property
 **/
@ApiModel(description="This is obtained by decoding the \"textures\" property")
public class PlayerProfileTexturePropertyValue  {
  
  @ApiModelProperty(example = "1591397469867", required = true, value = "UNIX timestamp in milliseconds")
 /**
   * UNIX timestamp in milliseconds
  **/
  private Long timestamp;

  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
 /**
   * The player UUID without hyphens
  **/
  private String profileId;

  @ApiModelProperty(example = "jeb_", required = true, value = "The player's name")
 /**
   * The player's name
  **/
  private String profileName;

  @ApiModelProperty(value = "Only present if unsigned was set to false in the request")
 /**
   * Only present if unsigned was set to false in the request
  **/
  private Boolean signatureRequired = false;

  @ApiModelProperty(value = "")
  private PlayerTexture textures = null;
 /**
   * UNIX timestamp in milliseconds
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public PlayerProfileTexturePropertyValue timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * The player UUID without hyphens
   * @return profileId
  **/
  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public PlayerProfileTexturePropertyValue profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

 /**
   * The player&#39;s name
   * @return profileName
  **/
  @JsonProperty("profileName")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public PlayerProfileTexturePropertyValue profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

 /**
   * Only present if unsigned was set to false in the request
   * @return signatureRequired
  **/
  @JsonProperty("signatureRequired")
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

  public PlayerProfileTexturePropertyValue signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

 /**
   * Get textures
   * @return textures
  **/
  @JsonProperty("textures")
  public PlayerTexture getTextures() {
    return textures;
  }

  public void setTextures(PlayerTexture textures) {
    this.textures = textures;
  }

  public PlayerProfileTexturePropertyValue textures(PlayerTexture textures) {
    this.textures = textures;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerProfileTexturePropertyValue {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    signatureRequired: ").append(toIndentedString(signatureRequired)).append("\n");
    sb.append("    textures: ").append(toIndentedString(textures)).append("\n");
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

