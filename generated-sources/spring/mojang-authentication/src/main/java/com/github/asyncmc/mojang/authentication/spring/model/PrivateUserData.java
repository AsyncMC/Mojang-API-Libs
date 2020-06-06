package com.github.asyncmc.mojang.authentication.spring.model;

import java.util.Objects;
import com.github.asyncmc.mojang.authentication.spring.model.GameProfileProperty;
import com.github.asyncmc.mojang.authentication.spring.model.ReducedUserData;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrivateUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T02:35:20.256253900-03:00[America/Sao_Paulo]")

public class PrivateUserData extends ReducedUserData  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateUserData {\n");
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
