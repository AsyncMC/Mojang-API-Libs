/*
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.sessions.jaxrs.jersey.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Contains details about the skin
 */
@ApiModel(description = "Contains details about the skin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:11.618967200-03:00[America/Sao_Paulo]")
public class PlayerSkinMetadata   {
  /**
   * The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
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

  public PlayerSkinMetadata model(ModelEnum model) {
    this.model = model;
    return this;
  }

  /**
   * The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
   * @return model
   **/
  @JsonProperty("model")
  @ApiModelProperty(value = "The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.")
  
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
    return Objects.equals(this.model, playerSkinMetadata.model);
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
