package com.github.asyncmc.mojang.authentication.spring.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsernamePassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T05:02:21.986099700-03:00[America/Sao_Paulo]")

public class UsernamePassword   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public UsernamePassword username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The Mojang account e-mail or username. Never store it.
   * @return username
  */
  @ApiModelProperty(required = true, value = "The Mojang account e-mail or username. Never store it.")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UsernamePassword password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The Mojang account password, never store it.
   * @return password
  */
  @ApiModelProperty(required = true, value = "The Mojang account password, never store it.")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernamePassword usernamePassword = (UsernamePassword) o;
    return Objects.equals(this.username, usernamePassword.username) &&
        Objects.equals(this.password, usernamePassword.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernamePassword {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

