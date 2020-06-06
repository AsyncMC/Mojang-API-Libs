package com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Identifies the software doing the request
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Identifies the software doing the request")

public class Agent   {
  

@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

    @XmlEnumValue("Minecraft") MINECRAFT(String.valueOf("Minecraft")), @XmlEnumValue("Scrolls") SCROLLS(String.valueOf("Scrolls"));


    private String value;

    NameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NameEnum fromValue(String v) {
        for (NameEnum b : NameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private NameEnum name = NameEnum.MINECRAFT;

  private Integer version = 1;


  /**
   * The name of the game
   **/
  public Agent name(NameEnum name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the game")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * The agent version, usually 1.
   **/
  public Agent version(Integer version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "The agent version, usually 1.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(name, agent.name) &&
        Objects.equals(version, agent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

