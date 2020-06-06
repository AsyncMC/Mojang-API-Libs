package com.github.asyncmc.mojang.authentication.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * GameProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:38.345670700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameProfile   {
  @JsonProperty("agent")
  private String agent;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("createdAt")
  private Long createdAt;

  @JsonProperty("legacyProfile")
  private Boolean legacyProfile;

  @JsonProperty("suspended")
  private Boolean suspended;

  @JsonProperty("paid")
  private Boolean paid;

  @JsonProperty("migrated")
  private Boolean migrated;

  @JsonProperty("legacy")
  private Boolean legacy;

  public GameProfile agent(String agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
    public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public GameProfile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GameProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameProfile userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GameProfile createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unix timestamp in milliseconds
   * @return createdAt
  **/
    public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public GameProfile legacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
    return this;
  }

   /**
   * Get legacyProfile
   * @return legacyProfile
  **/
    public Boolean getLegacyProfile() {
    return legacyProfile;
  }

  public void setLegacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
  }

  public GameProfile suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Get suspended
   * @return suspended
  **/
    public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public GameProfile paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
    public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public GameProfile migrated(Boolean migrated) {
    this.migrated = migrated;
    return this;
  }

   /**
   * Get migrated
   * @return migrated
  **/
    public Boolean getMigrated() {
    return migrated;
  }

  public void setMigrated(Boolean migrated) {
    this.migrated = migrated;
  }

  public GameProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

   /**
   * Get legacy
   * @return legacy
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

