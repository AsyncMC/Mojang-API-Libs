package com.github.asyncmc.mojang.authentication.java.undertow.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-06T02:32:41.893573-03:00[America/Sao_Paulo]")
public class UsernamePassword   {
  
  private String username = ;
  private String password = ;

  /**
   * The Mojang account e-mail or username. Never store it.
   **/
  public UsernamePassword username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Mojang account e-mail or username. Never store it.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * The Mojang account password, never store it.
   **/
  public UsernamePassword password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Mojang account password, never store it.")
  @JsonProperty("password")
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
    return Objects.equals(username, usernamePassword.username) &&
        Objects.equals(password, usernamePassword.password);
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

