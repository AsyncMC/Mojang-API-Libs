package com.github.asyncmc.mojang.authentication.java.vertx.model;

import java.util.Objects;
import com.github.asyncmc.mojang.authentication.java.vertx.model.UsernamePassword;

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AuthenticationRequest extends UsernamePassword  {
  

  public AuthenticationRequest () {

  }

  public AuthenticationRequest () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationRequest authenticationRequest = (AuthenticationRequest) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
