package apimodels;

import apimodels.SecurityAnswerId;
import apimodels.SecurityQuestion;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Binds a question to an answer id, the answer must respect the answer id.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:31.774915700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @NotNull
@Valid
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
  @NotNull
@Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

