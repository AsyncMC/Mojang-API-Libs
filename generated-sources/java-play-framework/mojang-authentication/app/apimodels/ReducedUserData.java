package apimodels;

import apimodels.GameProfileProperty;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ReducedUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:32.782277100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReducedUserData   {
  @JsonProperty("id")
  private InputStream id;

  @JsonProperty("properties")
  private List<GameProfileProperty> properties = null;

  public ReducedUserData id(InputStream id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Valid
  public InputStream getId() {
    return id;
  }

  public void setId(InputStream id) {
    this.id = id;
  }

  public ReducedUserData properties(List<GameProfileProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ReducedUserData addPropertiesItem(GameProfileProperty propertiesItem) {
    if (properties == null) {
      properties = new ArrayList<>();
    }
    properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Valid
  public List<GameProfileProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<GameProfileProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReducedUserData reducedUserData = (ReducedUserData) o;
    return Objects.equals(id, reducedUserData.id) &&
        Objects.equals(properties, reducedUserData.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, properties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReducedUserData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

