package com.github.asyncmc.mojang.api.jaxrs.cxf.client.model;

import io.swagger.annotations.ApiModel;

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
  * The current player, demo and legacy status of a player identified by the id
 **/
@ApiModel(description="The current player, demo and legacy status of a player identified by the id")
public class CurrentPlayerIDs  {
  
  @ApiModelProperty(example = "38ba542eb5924231a54cca0f2eac2b54", required = true, value = "The player UUID without hyphens")
 /**
   * The player UUID without hyphens
  **/
  private String id;

  @ApiModelProperty(example = "Alonelord", required = true, value = "The current name being used by this player")
 /**
   * The current name being used by this player
  **/
  private String name;

  @ApiModelProperty(value = "If account has not been converted")
 /**
   * If account has not been converted
  **/
  private Boolean legacy = false;

  @ApiModelProperty(value = "If the player has not puchased the game")
 /**
   * If the player has not puchased the game
  **/
  private Boolean demo = false;
 /**
   * The player UUID without hyphens
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentPlayerIDs id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The current name being used by this player
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrentPlayerIDs name(String name) {
    this.name = name;
    return this;
  }

 /**
   * If account has not been converted
   * @return legacy
  **/
  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public CurrentPlayerIDs legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

 /**
   * If the player has not puchased the game
   * @return demo
  **/
  @JsonProperty("demo")
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public CurrentPlayerIDs demo(Boolean demo) {
    this.demo = demo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentPlayerIDs {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
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

