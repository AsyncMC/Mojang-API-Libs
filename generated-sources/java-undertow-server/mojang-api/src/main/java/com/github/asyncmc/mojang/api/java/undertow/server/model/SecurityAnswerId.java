package com.github.asyncmc.mojang.api.java.undertow.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A security question answer id given by Mojang
 **/

@ApiModel(description = "A security question answer id given by Mojang")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-06T04:59:32.548106800-03:00[America/Sao_Paulo]")
public class SecurityAnswerId   {
  
  private Integer id = ;

  /**
   * A number giver by Mojang to reply a question
   **/
  public SecurityAnswerId id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "593", required = true, value = "A number giver by Mojang to reply a question")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAnswerId securityAnswerId = (SecurityAnswerId) o;
    return Objects.equals(id, securityAnswerId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAnswerId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

