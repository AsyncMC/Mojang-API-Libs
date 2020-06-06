package com.github.asyncmc.mojang.authentication.jaxrs.spec.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class GameProfile   {
  
  private @Valid String agent;
  private @Valid String id;
  private @Valid String name;
  private @Valid String userId;
  private @Valid Long createdAt;
  private @Valid Boolean legacyProfile;
  private @Valid Boolean suspended;
  private @Valid Boolean paid;
  private @Valid Boolean migrated;
  private @Valid Boolean legacy;

  /**
   **/
  public GameProfile agent(String agent) {
    this.agent = agent;
    return this;
  }

  
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
  public GameProfile id(String id) {
    this.id = id;
    return this;
  }

  
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
  public GameProfile name(String name) {
    this.name = name;
    return this;
  }

  
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
  public GameProfile userId(String userId) {
    this.userId = userId;
    return this;
  }

  
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
  public GameProfile createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
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
  public GameProfile legacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
    return this;
  }

  
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
  public GameProfile suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  
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
  public GameProfile paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

  
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
  public GameProfile migrated(Boolean migrated) {
    this.migrated = migrated;
    return this;
  }

  
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
  public GameProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

  
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

