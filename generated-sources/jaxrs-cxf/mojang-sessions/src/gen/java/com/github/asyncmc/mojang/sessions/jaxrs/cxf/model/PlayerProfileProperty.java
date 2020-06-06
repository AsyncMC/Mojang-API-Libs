package com.github.asyncmc.mojang.sessions.jaxrs.cxf.model;

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
  * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 **/
@ApiModel(description="A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue")
public class PlayerProfileProperty  {
  
  @ApiModelProperty(example = "textures", required = true, value = "The property name")
 /**
   * The property name
  **/
  private String name;

  @ApiModelProperty(required = true, value = "The serialized property value in base64.")
 /**
   * The serialized property value in base64.
  **/
  private byte[] value;

  @ApiModelProperty(value = "signed data using Yggdrasil's private key")
 /**
   * signed data using Yggdrasil's private key
  **/
  private byte[] signature;
 /**
   * The property name
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

  public PlayerProfileProperty name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The serialized property value in base64.
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public PlayerProfileProperty value(byte[] value) {
    this.value = value;
    return this;
  }

 /**
   * signed data using Yggdrasil&#39;s private key
   * @return signature
  **/
  @JsonProperty("signature")
  public byte[] getSignature() {
    return signature;
  }

  public void setSignature(byte[] signature) {
    this.signature = signature;
  }

  public PlayerProfileProperty signature(byte[] signature) {
    this.signature = signature;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerProfileProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

