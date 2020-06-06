package com.github.asyncmc.mojang.sessions.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:30.811111-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @NotNull
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
  @NotNull
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

