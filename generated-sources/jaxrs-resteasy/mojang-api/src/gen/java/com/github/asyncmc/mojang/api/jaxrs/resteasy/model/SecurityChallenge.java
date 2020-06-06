package com.github.asyncmc.mojang.api.jaxrs.resteasy.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityAnswerId;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityQuestion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Binds a question to an answer id, the answer must respect the answer id.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:08.418392200-03:00[America/Sao_Paulo]")
public class SecurityChallenge   {
  
  private SecurityQuestion question = null;
  private SecurityAnswerId answer = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("question")
  @NotNull
  public SecurityQuestion getQuestion() {
    return question;
  }
  public void setQuestion(SecurityQuestion question) {
    this.question = question;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("answer")
  @NotNull
  public SecurityAnswerId getAnswer() {
    return answer;
  }
  public void setAnswer(SecurityAnswerId answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityChallenge securityChallenge = (SecurityChallenge) o;
    return Objects.equals(question, securityChallenge.question) &&
        Objects.equals(answer, securityChallenge.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityChallenge {\n");
    
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

