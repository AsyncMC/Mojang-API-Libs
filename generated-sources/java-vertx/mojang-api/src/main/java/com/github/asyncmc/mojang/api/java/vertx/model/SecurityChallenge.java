package com.github.asyncmc.mojang.api.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityAnswerId;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityQuestion;

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SecurityChallenge   {
  
  private SecurityQuestion question = null;
  private SecurityAnswerId answer = null;

  public SecurityChallenge () {

  }

  public SecurityChallenge (SecurityQuestion question, SecurityAnswerId answer) {
    this.question = question;
    this.answer = answer;
  }

    
  @JsonProperty("question")
  public SecurityQuestion getQuestion() {
    return question;
  }
  public void setQuestion(SecurityQuestion question) {
    this.question = question;
  }

    
  @JsonProperty("answer")
  public SecurityAnswerId getAnswer() {
    return answer;
  }
  public void setAnswer(SecurityAnswerId answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
