/*
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.authentication.java.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GameProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-06T04:59:18.749321-03:00[America/Sao_Paulo]")
public class GameProfile {
  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private String agent;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Long createdAt;

  public static final String SERIALIZED_NAME_LEGACY_PROFILE = "legacyProfile";
  @SerializedName(SERIALIZED_NAME_LEGACY_PROFILE)
  private Boolean legacyProfile;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_PAID = "paid";
  @SerializedName(SERIALIZED_NAME_PAID)
  private Boolean paid;

  public static final String SERIALIZED_NAME_MIGRATED = "migrated";
  @SerializedName(SERIALIZED_NAME_MIGRATED)
  private Boolean migrated;

  public static final String SERIALIZED_NAME_LEGACY = "legacy";
  @SerializedName(SERIALIZED_NAME_LEGACY)
  private Boolean legacy;

  public GameProfile agent(String agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Unix timestamp in milliseconds")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.agent, gameProfile.agent) &&
        Objects.equals(this.id, gameProfile.id) &&
        Objects.equals(this.name, gameProfile.name) &&
        Objects.equals(this.userId, gameProfile.userId) &&
        Objects.equals(this.createdAt, gameProfile.createdAt) &&
        Objects.equals(this.legacyProfile, gameProfile.legacyProfile) &&
        Objects.equals(this.suspended, gameProfile.suspended) &&
        Objects.equals(this.paid, gameProfile.paid) &&
        Objects.equals(this.migrated, gameProfile.migrated) &&
        Objects.equals(this.legacy, gameProfile.legacy);
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

