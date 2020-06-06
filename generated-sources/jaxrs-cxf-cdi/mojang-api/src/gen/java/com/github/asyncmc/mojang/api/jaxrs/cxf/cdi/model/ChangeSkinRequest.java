package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SkinModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Request Mojang to download a skin from an URL and apply to the player
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Request Mojang to download a skin from an URL and apply to the player")

public class ChangeSkinRequest   {
  
  private SkinModel model = null;

  private String url;


  /**
   **/
  public ChangeSkinRequest model(SkinModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public SkinModel getModel() {
    return model;
  }
  public void setModel(SkinModel model) {
    this.model = model;
  }


  /**
   * The URL which Mojang servers will download and apply the skin
   **/
  public ChangeSkinRequest url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "http://assets.mojang.com/SkinTemplates/steve.png", required = true, value = "The URL which Mojang servers will download and apply the skin")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeSkinRequest changeSkinRequest = (ChangeSkinRequest) o;
    return Objects.equals(model, changeSkinRequest.model) &&
        Objects.equals(url, changeSkinRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, url);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

