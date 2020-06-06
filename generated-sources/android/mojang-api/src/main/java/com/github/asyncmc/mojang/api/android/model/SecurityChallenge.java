/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.api.android.model;

import com.github.asyncmc.mojang.api.android.model.SecurityAnswerId;
import com.github.asyncmc.mojang.api.android.model.SecurityQuestion;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 **/
@ApiModel(description = "Binds a question to an answer id, the answer must respect the answer id.")
public class SecurityChallenge {
  
  @SerializedName("question")
  private SecurityQuestion question = null;
  @SerializedName("answer")
  private SecurityAnswerId answer = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SecurityQuestion getQuestion() {
    return question;
  }
  public void setQuestion(SecurityQuestion question) {
    this.question = question;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    return (this.question == null ? securityChallenge.question == null : this.question.equals(securityChallenge.question)) &&
        (this.answer == null ? securityChallenge.answer == null : this.answer.equals(securityChallenge.answer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.question == null ? 0: this.question.hashCode());
    result = 31 * result + (this.answer == null ? 0: this.answer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityChallenge {\n");
    
    sb.append("  question: ").append(question).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}