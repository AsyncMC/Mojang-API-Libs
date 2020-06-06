package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A security question requested by Mojang
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SecurityQuestion   {
  
  private Integer id = ;
  private String question = ;

  public SecurityQuestion () {

  }

  public SecurityQuestion (Integer id, String question) {
    this.id = id;
    this.question = question;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityQuestion securityQuestion = (SecurityQuestion) o;
    return Objects.equals(id, securityQuestion.id) &&
        Objects.equals(question, securityQuestion.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityQuestion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
