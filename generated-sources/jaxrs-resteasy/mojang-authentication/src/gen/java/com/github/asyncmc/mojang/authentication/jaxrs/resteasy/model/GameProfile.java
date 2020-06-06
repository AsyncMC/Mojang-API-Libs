package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:09.430070900-03:00[America/Sao_Paulo]")
public class GameProfile   {
  
  private String agent;
  private String id;
  private String name;
  private String userId;
  private Long createdAt;
  private Boolean legacyProfile;
  private Boolean suspended;
  private Boolean paid;
  private Boolean migrated;
  private Boolean legacy;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Unix timestamp in milliseconds
   **/
  
  @ApiModelProperty(value = "Unix timestamp in milliseconds")
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legacyProfile")
  public Boolean getLegacyProfile() {
    return legacyProfile;
  }
  public void setLegacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("migrated")
  public Boolean getMigrated() {
    return migrated;
  }
  public void setMigrated(Boolean migrated) {
    this.migrated = migrated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameProfile gameProfile = (GameProfile) o;
    return Objects.equals(agent, gameProfile.agent) &&
        Objects.equals(id, gameProfile.id) &&
        Objects.equals(name, gameProfile.name) &&
        Objects.equals(userId, gameProfile.userId) &&
        Objects.equals(createdAt, gameProfile.createdAt) &&
        Objects.equals(legacyProfile, gameProfile.legacyProfile) &&
        Objects.equals(suspended, gameProfile.suspended) &&
        Objects.equals(paid, gameProfile.paid) &&
        Objects.equals(migrated, gameProfile.migrated) &&
        Objects.equals(legacy, gameProfile.legacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, id, name, userId, createdAt, legacyProfile, suspended, paid, migrated, legacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameProfile {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    legacyProfile: ").append(toIndentedString(legacyProfile)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    migrated: ").append(toIndentedString(migrated)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
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

