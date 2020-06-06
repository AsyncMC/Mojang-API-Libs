package com.github.asyncmc.mojang.authentication.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AccessKeys
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:38.345670700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AccessKeys   {
  @JsonProperty("accessToken")
  private String accessToken;

  @JsonProperty("clientToken")
  private String clientToken;

  public AccessKeys accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessKeys clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
    public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeys accessKeys = (AccessKeys) o;
    return Objects.equals(accessToken, accessKeys.accessToken) &&
        Objects.equals(clientToken, accessKeys.clientToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, clientToken);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeys {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
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

