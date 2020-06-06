package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains details about the skin
 **/
@ApiModel(description="Contains details about the skin")
public class PlayerSkinMetadata  {
  
@XmlType(name="ModelEnum")
@XmlEnum(String.class)
public enum ModelEnum {

@XmlEnumValue("slim") SLIM(String.valueOf("slim"));


    private String value;

    ModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModelEnum fromValue(String v) {
        for (ModelEnum b : ModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(value = "The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.")
 /**
   * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
  **/
  private ModelEnum model;
 /**
   * The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    if (model == null) {
      return null;
    }
    return model.value();
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public PlayerSkinMetadata model(ModelEnum model) {
    this.model = model;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

