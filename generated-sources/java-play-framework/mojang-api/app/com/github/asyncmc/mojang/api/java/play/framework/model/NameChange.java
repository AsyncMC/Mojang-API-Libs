package com.github.asyncmc.mojang.api.java.play.framework.model;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A registered name change.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:37.270382100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NameChange   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("changedToAt")
  private Long changedToAt;

  public NameChange name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The new player name
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameChange changedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
    return this;
  }

   /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
   * @return changedToAt
  **/
    public Long getChangedToAt() {
    return changedToAt;
  }

  public void setChangedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameChange nameChange = (NameChange) o;
    return Objects.equals(name, nameChange.name) &&
        Objects.equals(changedToAt, nameChange.changedToAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, changedToAt);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameChange {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changedToAt: ").append(toIndentedString(changedToAt)).append("\n");
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

