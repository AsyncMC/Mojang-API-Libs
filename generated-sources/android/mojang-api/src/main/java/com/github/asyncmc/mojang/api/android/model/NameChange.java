/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.api.android.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A registered name change.
 **/
@ApiModel(description = "A registered name change.")
public class NameChange {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("changedToAt")
  private Long changedToAt = null;

  /**
   * The new player name
   **/
  @ApiModelProperty(required = true, value = "The new player name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
   **/
  @ApiModelProperty(value = "Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.")
  public Long getChangedToAt() {
    return changedToAt;
  }
  public void setChangedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameChange nameChange = (NameChange) o;
    return (this.name == null ? nameChange.name == null : this.name.equals(nameChange.name)) &&
        (this.changedToAt == null ? nameChange.changedToAt == null : this.changedToAt.equals(nameChange.changedToAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.changedToAt == null ? 0: this.changedToAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameChange {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  changedToAt: ").append(changedToAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}