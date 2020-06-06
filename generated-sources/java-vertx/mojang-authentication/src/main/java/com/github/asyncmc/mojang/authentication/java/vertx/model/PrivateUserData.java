package com.github.asyncmc.mojang.authentication.java.vertx.model;

import java.util.Objects;
import com.github.asyncmc.mojang.authentication.java.vertx.model.GameProfileProperty;
import com.github.asyncmc.mojang.authentication.java.vertx.model.ReducedUserData;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PrivateUserData extends ReducedUserData  {
  

  public PrivateUserData () {

  }

  public PrivateUserData () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateUserData privateUserData = (PrivateUserData) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
