package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.SecurityAnswerId;
import org.openapitools.model.SecurityQuestion;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Binds a question to an answer id, the answer must respect the answer id.
 **/
@ApiModel(description="Binds a question to an answer id, the answer must respect the answer id.")
public class SecurityChallenge  {
  
  @ApiModelProperty(required = true, value = "")
  private SecurityQuestion question = null;

  @ApiModelProperty(required = true, value = "")
  private SecurityAnswerId answer = null;
 /**
   * Get question
   * @return question
  **/
  @JsonProperty("question")
  public SecurityQuestion getQuestion() {
    return question;
  }

  public void setQuestion(SecurityQuestion question) {
    this.question = question;
  }

  public SecurityChallenge question(SecurityQuestion question) {
    this.question = question;
    return this;
  }

 /**
   * Get answer
   * @return answer
  **/
  @JsonProperty("answer")
  public SecurityAnswerId getAnswer() {
    return answer;
  }

  public void setAnswer(SecurityAnswerId answer) {
    this.answer = answer;
  }

  public SecurityChallenge answer(SecurityAnswerId answer) {
    this.answer = answer;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

