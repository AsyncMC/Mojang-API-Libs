package com.github.asyncmc.mojang.authentication.jaxrs.cxf.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameProfile  {
  
  @ApiModelProperty(value = "")
  private String agent;

  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String userId;

  @ApiModelProperty(value = "Unix timestamp in milliseconds")
 /**
   * Unix timestamp in milliseconds
  **/
  private Long createdAt;

  @ApiModelProperty(value = "")
  private Boolean legacyProfile;

  @ApiModelProperty(value = "")
  private Boolean suspended;

  @ApiModelProperty(value = "")
  private Boolean paid;

  @ApiModelProperty(value = "")
  private Boolean migrated;

  @ApiModelProperty(value = "")
  private Boolean legacy;
 /**
   * Get agent
   * @return agent
  **/
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public GameProfile agent(String agent) {
    this.agent = agent;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GameProfile id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameProfile name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GameProfile userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Unix timestamp in milliseconds
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public GameProfile createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Get legacyProfile
   * @return legacyProfile
  **/
  @JsonProperty("legacyProfile")
  public Boolean getLegacyProfile() {
    return legacyProfile;
  }

  public void setLegacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
  }

  public GameProfile legacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
    return this;
  }

 /**
   * Get suspended
   * @return suspended
  **/
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public GameProfile suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

 /**
   * Get paid
   * @return paid
  **/
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public GameProfile paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

 /**
   * Get migrated
   * @return migrated
  **/
  @JsonProperty("migrated")
  public Boolean getMigrated() {
    return migrated;
  }

  public void setMigrated(Boolean migrated) {
    this.migrated = migrated;
  }

  public GameProfile migrated(Boolean migrated) {
    this.migrated = migrated;
    return this;
  }

 /**
   * Get legacy
   * @return legacy
  **/
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public GameProfile legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

