package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SecurityAnswerId;
import org.openapitools.model.SecurityQuestion;

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 */
@ApiModel(description = "Binds a question to an answer id, the answer must respect the answer id.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:24.655917700-03:00[America/Sao_Paulo]")
public class SecurityChallenge   {
  @JsonProperty("question")
  private SecurityQuestion question = null;

  @JsonProperty("answer")
  private SecurityAnswerId answer = null;

  public SecurityChallenge question(SecurityQuestion question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(required = true, value = "")
  public SecurityQuestion getQuestion() {
    return question;
  }

  public void setQuestion(SecurityQuestion question) {
    this.question = question;
  }

  public SecurityChallenge answer(SecurityAnswerId answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.question, securityChallenge.question) &&
        Objects.equals(this.answer, securityChallenge.answer);
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

