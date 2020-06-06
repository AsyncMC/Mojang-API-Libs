package com.github.asyncmc.mojang.authentication.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * GameProfileProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:38.345670700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameProfileProperty   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public GameProfileProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameProfileProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameProfileProperty gameProfileProperty = (GameProfileProperty) o;
    return Objects.equals(name, gameProfileProperty.name) &&
        Objects.equals(value, gameProfileProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameProfileProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

