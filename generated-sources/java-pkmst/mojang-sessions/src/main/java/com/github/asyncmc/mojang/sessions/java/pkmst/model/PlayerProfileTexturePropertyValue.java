package com.github.asyncmc.mojang.sessions.java.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerTexture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * This is obtained by decoding the \&quot;textures\&quot; property
 */
@ApiModel(description = "This is obtained by decoding the \"textures\" property")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:35.513066100-03:00[America/Sao_Paulo]")

public class PlayerProfileTexturePropertyValue   {
  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("profileId")
  private String profileId;

  @JsonProperty("profileName")
  private String profileName;

  @JsonProperty("signatureRequired")
  private Boolean signatureRequired = false;

  @JsonProperty("textures")
  private PlayerTexture textures = null;

  public PlayerProfileTexturePropertyValue timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * UNIX timestamp in milliseconds
   * @return timestamp
  **/
  @ApiModelProperty(example = "1591397469867", required = true, value = "UNIX timestamp in milliseconds")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public PlayerProfileTexturePropertyValue profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The player UUID without hyphens
   * @return profileId
  **/
  @ApiModelProperty(example = "853c80ef3c3749fdaa49938b674adae6", required = true, value = "The player UUID without hyphens")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public PlayerProfileTexturePropertyValue profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * The player's name
   * @return profileName
  **/
  @ApiModelProperty(example = "jeb_", required = true, value = "The player's name")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public PlayerProfileTexturePropertyValue signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

   /**
   * Only present if unsigned was set to false in the request
   * @return signatureRequired
  **/
  @ApiModelProperty(value = "Only present if unsigned was set to false in the request")
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

  public PlayerProfileTexturePropertyValue textures(PlayerTexture textures) {
    this.textures = textures;
    return this;
  }

   /**
   * Get textures
   * @return textures
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.timestamp, playerProfileTexturePropertyValue.timestamp) &&
        Objects.equals(this.profileId, playerProfileTexturePropertyValue.profileId) &&
        Objects.equals(this.profileName, playerProfileTexturePropertyValue.profileName) &&
        Objects.equals(this.signatureRequired, playerProfileTexturePropertyValue.signatureRequired) &&
        Objects.equals(this.textures, playerProfileTexturePropertyValue.textures);
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

