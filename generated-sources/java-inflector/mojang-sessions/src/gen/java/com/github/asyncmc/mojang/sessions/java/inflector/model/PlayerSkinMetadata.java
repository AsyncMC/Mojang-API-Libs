package com.github.asyncmc.mojang.sessions.java.inflector.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains details about the skin
 **/

@ApiModel(description = "Contains details about the skin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-06T02:32:24.401424300-03:00[America/Sao_Paulo]")
public class PlayerSkinMetadata   {
  /**
   * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
   */
  public enum ModelEnum {
    SLIM("slim");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModelEnum fromValue(String text) {
      for (ModelEnum b : ModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("model")
  private ModelEnum model;

  /**
   * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
   **/
  public PlayerSkinMetadata model(ModelEnum model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.")
  @JsonProperty("model")
  public ModelEnum getModel() {
    return model;
  }
  public void setModel(ModelEnum model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

