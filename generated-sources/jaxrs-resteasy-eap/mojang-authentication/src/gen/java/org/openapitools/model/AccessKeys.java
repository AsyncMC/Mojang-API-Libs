package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-05T23:34:11.580636300-03:00[America/Sao_Paulo]")
public class AccessKeys   {
  

  private String accessToken;

  private String clientToken;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accessToken")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

