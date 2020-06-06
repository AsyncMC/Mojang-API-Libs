/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.authentication.android.model;

import com.github.asyncmc.mojang.authentication.android.model.AccessKeys;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RefreshRequest extends AccessKeys {
  
  @SerializedName("accessToken")
  private String accessToken = null;
  @SerializedName("clientToken")
  private String clientToken = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    RefreshRequest refreshRequest = (RefreshRequest) o;
    return (this.accessToken == null ? refreshRequest.accessToken == null : this.accessToken.equals(refreshRequest.accessToken)) &&
        (this.clientToken == null ? refreshRequest.clientToken == null : this.clientToken.equals(refreshRequest.clientToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    result = 31 * result + (this.clientToken == null ? 0: this.clientToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshRequest {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  clientToken: ").append(clientToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
