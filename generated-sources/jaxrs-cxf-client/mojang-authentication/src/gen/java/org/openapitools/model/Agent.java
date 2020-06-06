package org.openapitools.model;

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
  * Identifies the software doing the request
 **/
@ApiModel(description="Identifies the software doing the request")
public class Agent  {
  
@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

@XmlEnumValue("Minecraft") MINECRAFT(String.valueOf("Minecraft")), @XmlEnumValue("Scrolls") SCROLLS(String.valueOf("Scrolls"));


    private String value;

    NameEnum (String v) {
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

  @ApiModelProperty(value = "The name of the game")
 /**
   * The name of the game
  **/
  private NameEnum name = NameEnum.MINECRAFT;

  @ApiModelProperty(value = "The agent version, usually 1.")
 /**
   * The agent version, usually 1.
  **/
  private Integer version = 1;
 /**
   * The name of the game
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    if (name == null) {
      return null;
    }
    return name.value();
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public Agent name(NameEnum name) {
    this.name = name;
    return this;
  }

 /**
   * The agent version, usually 1.
   * @return version
  **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Agent version(Integer version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

