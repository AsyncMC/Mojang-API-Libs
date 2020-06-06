package com.github.asyncmc.mojang.authentication.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Identifies the software doing the request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:38.345670700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Agent   {
  /**
   * The name of the game
   */
  public enum NameEnum {
    MINECRAFT("Minecraft"),
    
    SCROLLS("Scrolls");

    private final String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("name")
  private NameEnum name = NameEnum.MINECRAFT;

  @JsonProperty("version")
  private Integer version = 1;

  public Agent name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the game
   * @return name
  **/
    public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public Agent version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The agent version, usually 1.
   * @return version
  **/
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(name, agent.name) &&
        Objects.equals(version, agent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

