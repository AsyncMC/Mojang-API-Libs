package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A registered name change.
 **/

@ApiModel(description = "A registered name change.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-05T23:33:21.159330600-03:00[America/Sao_Paulo]")
public class NameChange   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("changedToAt")
  private Long changedToAt;

  /**
   * The new player name
   **/
  public NameChange name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "LordofMC_Playerz", required = true, value = "The new player name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
   **/
  public NameChange changedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
    return this;
  }

  
  @ApiModelProperty(example = "1448677333000", value = "Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.")
  @JsonProperty("changedToAt")
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

