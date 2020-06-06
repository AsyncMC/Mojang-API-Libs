package com.github.asyncmc.mojang.authentication.java.inflector.model;

import java.util.Objects;
import com.github.asyncmc.mojang.authentication.java.inflector.model.UsernamePassword;
import io.swagger.annotations.ApiModel;



/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 **/

@ApiModel(description = "Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-06T04:59:15.068092200-03:00[America/Sao_Paulo]")
public class AuthenticationRequest extends UsernamePassword  {

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

