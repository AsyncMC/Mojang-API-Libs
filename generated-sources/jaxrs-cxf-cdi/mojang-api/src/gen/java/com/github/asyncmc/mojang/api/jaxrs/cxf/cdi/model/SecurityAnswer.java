package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityAnswerId;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * A security question answer given by the player using the id given by Mojang
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A security question answer given by the player using the id given by Mojang")

public class SecurityAnswer extends SecurityAnswerId  {
  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAnswer securityAnswer = (SecurityAnswer) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAnswer {\n");
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

