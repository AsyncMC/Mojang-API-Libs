package com.github.asyncmc.mojang.api.jaxrs.cxf.model;

import io.swagger.annotations.ApiModel;
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

/**
  * A registered name change.
 **/
@ApiModel(description="A registered name change.")
public class NameChange  {
  
  @ApiModelProperty(example = "LordofMC_Playerz", required = true, value = "The new player name")
 /**
   * The new player name
  **/
  private String name;

  @ApiModelProperty(example = "1448677333000", value = "Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.")
 /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
  **/
  private Long changedToAt;
 /**
   * The new player name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameChange name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
   * @return changedToAt
  **/
  @JsonProperty("changedToAt")
  public Long getChangedToAt() {
    return changedToAt;
  }

  public void setChangedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
  }

  public NameChange changedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameChange {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changedToAt: ").append(toIndentedString(changedToAt)).append("\n");
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

