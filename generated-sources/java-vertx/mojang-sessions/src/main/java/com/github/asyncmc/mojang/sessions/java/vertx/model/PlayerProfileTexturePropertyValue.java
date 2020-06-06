package com.github.asyncmc.mojang.sessions.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerTexture;

/**
 * This is obtained by decoding the \&quot;textures\&quot; property
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerProfileTexturePropertyValue   {
  
  private Long timestamp = ;
  private String profileId = ;
  private String profileName = ;
  private Boolean signatureRequired = false;
  private PlayerTexture textures = null;

  public PlayerProfileTexturePropertyValue () {

  }

  public PlayerProfileTexturePropertyValue (Long timestamp, String profileId, String profileName, Boolean signatureRequired, PlayerTexture textures) {
    this.timestamp = timestamp;
    this.profileId = profileId;
    this.profileName = profileName;
    this.signatureRequired = signatureRequired;
    this.textures = textures;
  }

    
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

    
  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

    
  @JsonProperty("profileName")
  public String getProfileName() {
    return profileName;
  }
  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

    
  @JsonProperty("signatureRequired")
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }
  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

    
  @JsonProperty("textures")
  public PlayerTexture getTextures() {
    return textures;
  }
  public void setTextures(PlayerTexture textures) {
    this.textures = textures;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
