package com.github.asyncmc.mojang.sessions.jaxrs.spec.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Contains details about the skin
 **/
@ApiModel(description = "Contains details about the skin")
public class PlayerSkinMetadata   {
  

public enum ModelEnum {

    SLIM(String.valueOf("slim"));


    private String value;

    ModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ModelEnum fromValue(String v) {
        for (ModelEnum b : ModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private @Valid ModelEnum model;

  /**
   * The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
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

