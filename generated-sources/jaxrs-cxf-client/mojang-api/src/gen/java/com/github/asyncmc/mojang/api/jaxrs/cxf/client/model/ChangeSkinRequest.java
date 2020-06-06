package com.github.asyncmc.mojang.api.jaxrs.cxf.client.model;

import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.SkinModel;
import io.swagger.annotations.ApiModel;

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
  * Request Mojang to download a skin from an URL and apply to the player
 **/
@ApiModel(description="Request Mojang to download a skin from an URL and apply to the player")
public class ChangeSkinRequest  {
  
  @ApiModelProperty(value = "")
  private SkinModel model = null;

  @ApiModelProperty(example = "http://assets.mojang.com/SkinTemplates/steve.png", required = true, value = "The URL which Mojang servers will download and apply the skin")
 /**
   * The URL which Mojang servers will download and apply the skin
  **/
  private String url;
 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public SkinModel getModel() {
    return model;
  }

  public void setModel(SkinModel model) {
    this.model = model;
  }

  public ChangeSkinRequest model(SkinModel model) {
    this.model = model;
    return this;
  }

 /**
   * The URL which Mojang servers will download and apply the skin
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChangeSkinRequest url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSkinRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

