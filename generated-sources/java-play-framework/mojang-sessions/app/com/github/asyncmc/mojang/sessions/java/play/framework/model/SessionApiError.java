package com.github.asyncmc.mojang.sessions.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * An object describing giving a bit of information about the error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:39.234134100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

