package com.github.asyncmc.mojang.sessions.java.pkmst.model;

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
 * An object describing giving a bit of information about the error
 */
@ApiModel(description = "An object describing giving a bit of information about the error")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T04:59:27.056873400-03:00[America/Sao_Paulo]")

public class SessionApiError   {
  @JsonProperty("error")
  private String error;

  @JsonProperty("path")
  private String path;

  public SessionApiError error(String error) {
    this.error = error;
    return this;
  }

   /**
   * A message describing the error
   * @return error
  **/
  @ApiModelProperty(example = "Bad Request", value = "A message describing the error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SessionApiError path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The request path
   * @return path
  **/
  @ApiModelProperty(example = "/session/minecraft/profile/asdadsda", value = "The request path")
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
    return Objects.equals(this.error, sessionApiError.error) &&
        Objects.equals(this.path, sessionApiError.path);
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

