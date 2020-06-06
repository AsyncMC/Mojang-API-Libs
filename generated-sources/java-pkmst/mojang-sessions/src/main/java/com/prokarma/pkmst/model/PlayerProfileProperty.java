package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */
@ApiModel(description = "A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-05T23:33:30.052020900-03:00[America/Sao_Paulo]")

public class PlayerProfileProperty   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private byte[] value;

  @JsonProperty("signature")
  private byte[] signature;

  public PlayerProfileProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The property name
   * @return name
  **/
  @ApiModelProperty(example = "textures", required = true, value = "The property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerProfileProperty value(byte[] value) {
    this.value = value;
    return this;
  }

   /**
   * The serialized property value in base64.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The serialized property value in base64.")
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public PlayerProfileProperty signature(byte[] signature) {
    this.signature = signature;
    return this;
  }

   /**
   * signed data using Yggdrasil's private key
   * @return signature
  **/
  @ApiModelProperty(value = "signed data using Yggdrasil's private key")
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
    return Objects.equals(this.name, playerProfileProperty.name) &&
        Objects.equals(this.value, playerProfileProperty.value) &&
        Objects.equals(this.signature, playerProfileProperty.signature);
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

