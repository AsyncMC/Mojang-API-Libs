package com.github.asyncmc.mojang.authentication.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AccessKeys   {
  
  private String accessToken = ;
  private String clientToken = ;

  public AccessKeys () {

  }

  public AccessKeys (String accessToken, String clientToken) {
    this.accessToken = accessToken;
    this.clientToken = clientToken;
  }

    
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

    
  @JsonProperty("clientToken")
  public String getClientToken() {
    return clientToken;
  }
  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
