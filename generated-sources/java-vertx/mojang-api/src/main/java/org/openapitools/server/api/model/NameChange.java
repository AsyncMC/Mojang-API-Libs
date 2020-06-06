package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A registered name change.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class NameChange   {
  
  private String name = ;
  private Long changedToAt = ;

  public NameChange () {

  }

  public NameChange (String name, Long changedToAt) {
    this.name = name;
    this.changedToAt = changedToAt;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("changedToAt")
  public Long getChangedToAt() {
    return changedToAt;
  }
  public void setChangedToAt(Long changedToAt) {
    this.changedToAt = changedToAt;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
