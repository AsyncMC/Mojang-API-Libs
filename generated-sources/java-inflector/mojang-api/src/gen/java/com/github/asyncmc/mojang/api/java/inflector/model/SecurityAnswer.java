package com.github.asyncmc.mojang.api.java.inflector.model;

import java.util.Objects;
import com.github.asyncmc.mojang.api.java.inflector.model.SecurityAnswerId;
import io.swagger.annotations.ApiModel;



/**
 * A security question answer given by the player using the id given by Mojang
 **/

@ApiModel(description = "A security question answer given by the player using the id given by Mojang")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-06T02:32:22.425407700-03:00[America/Sao_Paulo]")
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

