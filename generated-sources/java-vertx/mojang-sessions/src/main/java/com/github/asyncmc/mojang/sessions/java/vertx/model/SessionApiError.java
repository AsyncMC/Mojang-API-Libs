package com.github.asyncmc.mojang.sessions.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing giving a bit of information about the error
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SessionApiError   {
  
  private String error = ;
  private String path = ;

  public SessionApiError () {

  }

  public SessionApiError (String error, String path) {
    this.error = error;
    this.path = path;
  }

    
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

    
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
