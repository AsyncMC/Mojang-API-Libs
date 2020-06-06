package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Contains details about the skin
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PlayerSkinMetadata   {
  


  public enum ModelEnum {
    SLIM("slim");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ModelEnum model = ;

  public PlayerSkinMetadata () {

  }

  public PlayerSkinMetadata (ModelEnum model) {
    this.model = model;
  }

    
  @JsonProperty("model")
  public ModelEnum getModel() {
    return model;
  }
  public void setModel(ModelEnum model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSkinMetadata playerSkinMetadata = (PlayerSkinMetadata) o;
    return Objects.equals(model, playerSkinMetadata.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSkinMetadata {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
