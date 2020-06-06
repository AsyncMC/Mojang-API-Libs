package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="An object describing giving a bit of information about the error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.906240-03:00[America/Sao_Paulo]")
public class SessionApiError   {
  
  private String error;
  private String path;

  /**
   * A message describing the error
   **/
  
  @ApiModelProperty(example = "Bad Request", value = "A message describing the error")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   * The request path
   **/
  
  @ApiModelProperty(example = "/session/minecraft/profile/asdadsda", value = "The request path")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionApiError sessionApiError = (SessionApiError) o;
    return Objects.equals(error, sessionApiError.error) &&
        Objects.equals(path, sessionApiError.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionApiError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

