package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model;

import java.util.Objects;
import java.util.ArrayList;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.UsernamePassword;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:14.416947100-03:00[America/Sao_Paulo]")
public class AuthenticationRequest extends UsernamePassword  {
  


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

