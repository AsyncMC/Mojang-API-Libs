/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.status.android.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 **/
@ApiModel(description = "The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).")
public class ApiStatus {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiStatus apiStatus = (ApiStatus) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiStatus {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
