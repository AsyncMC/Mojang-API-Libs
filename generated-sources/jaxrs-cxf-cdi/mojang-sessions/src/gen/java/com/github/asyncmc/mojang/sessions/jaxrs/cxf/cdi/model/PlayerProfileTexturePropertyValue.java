package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.PlayerTexture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * This is obtained by decoding the \&quot;textures\&quot; property
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "This is obtained by decoding the \"textures\" property")

public class PlayerProfileTexturePropertyValue   {
  
  private Long timestamp;

  private String profileId;

  private String profileName;

  private Boolean signatureRequired = false;

  private PlayerTexture textures = null;


  /**
   * UNIX timestamp in milliseconds
   **/
  public PlayerProfileTexturePropertyValue timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1591397469867", required = true, value = "UNIX timestamp in milliseconds")
  @JsonProperty("timestamp")
  @NotNull
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * The player UUID without hyphens
   **/
  public PlayerProfileTexturePropertyValue profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  
  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
  @JsonProperty("profileId")
  @NotNull
  public String getProfileId() {
    return profileId;
  }
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  /**
   * The player&#39;s name
   **/
  public PlayerProfileTexturePropertyValue profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  
  @ApiModelProperty(example = "jeb_", required = true, value = "The player's name")
  @JsonProperty("profileName")
  @NotNull
  public String getProfileName() {
    return profileName;
  }
  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  /**
   * Only present if unsigned was set to false in the request
   **/
  public PlayerProfileTexturePropertyValue signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

  
  @ApiModelProperty(value = "Only present if unsigned was set to false in the request")
  @JsonProperty("signatureRequired")
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }
  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }


  /**
   **/
  public PlayerProfileTexturePropertyValue textures(PlayerTexture textures) {
    this.textures = textures;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("textures")
  public PlayerTexture getTextures() {
    return textures;
  }
  public void setTextures(PlayerTexture textures) {
    this.textures = textures;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerProfileTexturePropertyValue playerProfileTexturePropertyValue = (PlayerProfileTexturePropertyValue) o;
    return Objects.equals(timestamp, playerProfileTexturePropertyValue.timestamp) &&
        Objects.equals(profileId, playerProfileTexturePropertyValue.profileId) &&
        Objects.equals(profileName, playerProfileTexturePropertyValue.profileName) &&
        Objects.equals(signatureRequired, playerProfileTexturePropertyValue.signatureRequired) &&
        Objects.equals(textures, playerProfileTexturePropertyValue.textures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, profileId, profileName, signatureRequired, textures);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

