package com.github.asyncmc.mojang.sessions.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerProfileProperty   {
  
  private String name = ;
  private byte[] value = ;
  private byte[] signature = ;

  public PlayerProfileProperty () {

  }

  public PlayerProfileProperty (String name, byte[] value, byte[] signature) {
    this.name = name;
    this.value = value;
    this.signature = signature;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("value")
  public byte[] getValue() {
    return value;
  }
  public void setValue(byte[] value) {
    this.value = value;
  }

    
  @JsonProperty("signature")
  public byte[] getSignature() {
    return signature;
  }
  public void setSignature(byte[] signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
