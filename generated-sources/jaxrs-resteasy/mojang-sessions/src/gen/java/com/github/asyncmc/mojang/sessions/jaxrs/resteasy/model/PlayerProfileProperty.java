package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:10.317348300-03:00[America/Sao_Paulo]")
public class PlayerProfileProperty   {
  
  private String name;
  private byte[] value;
  private byte[] signature;

  /**
   * The property name
   **/
  
  @ApiModelProperty(example = "textures", required = true, value = "The property name")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The serialized property value in base64.
   **/
  
  @ApiModelProperty(required = true, value = "The serialized property value in base64.")
  @JsonProperty("value")
  @NotNull
  public byte[] getValue() {
    return value;
  }
  public void setValue(byte[] value) {
    this.value = value;
  }

  /**
   * signed data using Yggdrasil&#39;s private key
   **/
  
  @ApiModelProperty(value = "signed data using Yggdrasil's private key")
  @JsonProperty("signature")
  public byte[] getSignature() {
    return signature;
  }
  public void setSignature(byte[] signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerProfileProperty playerProfileProperty = (PlayerProfileProperty) o;
    return Objects.equals(name, playerProfileProperty.name) &&
        Objects.equals(value, playerProfileProperty.value) &&
        Objects.equals(signature, playerProfileProperty.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, signature);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

