package com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsernamePassword  {
  
  @ApiModelProperty(required = true, value = "The Mojang account e-mail or username. Never store it.")
 /**
   * The Mojang account e-mail or username. Never store it.
  **/
  private String username;

  @ApiModelProperty(required = true, value = "The Mojang account password, never store it.")
 /**
   * The Mojang account password, never store it.
  **/
  private String password;
 /**
   * The Mojang account e-mail or username. Never store it.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UsernamePassword username(String username) {
    this.username = username;
    return this;
  }

 /**
   * The Mojang account password, never store it.
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UsernamePassword password(String password) {
    this.password = password;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

