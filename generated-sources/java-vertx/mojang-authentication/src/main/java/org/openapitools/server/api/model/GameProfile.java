package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.File;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GameProfile   {
  
  private String agent = ;
  private String id = ;
  private String name = ;
  private File userId = ;
  private Long createdAt = ;
  private Boolean legacyProfile = ;
  private Boolean suspended = ;
  private Boolean paid = ;
  private Boolean migrated = ;
  private Boolean legacy = ;

  public GameProfile () {

  }

  public GameProfile (String agent, String id, String name, File userId, Long createdAt, Boolean legacyProfile, Boolean suspended, Boolean paid, Boolean migrated, Boolean legacy) {
    this.agent = agent;
    this.id = id;
    this.name = name;
    this.userId = userId;
    this.createdAt = createdAt;
    this.legacyProfile = legacyProfile;
    this.suspended = suspended;
    this.paid = paid;
    this.migrated = migrated;
    this.legacy = legacy;
  }

    
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("userId")
  public File getUserId() {
    return userId;
  }
  public void setUserId(File userId) {
    this.userId = userId;
  }

    
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("legacyProfile")
  public Boolean getLegacyProfile() {
    return legacyProfile;
  }
  public void setLegacyProfile(Boolean legacyProfile) {
    this.legacyProfile = legacyProfile;
  }

    
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

    
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

    
  @JsonProperty("migrated")
  public Boolean getMigrated() {
    return migrated;
  }
  public void setMigrated(Boolean migrated) {
    this.migrated = migrated;
  }

    
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }
  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
