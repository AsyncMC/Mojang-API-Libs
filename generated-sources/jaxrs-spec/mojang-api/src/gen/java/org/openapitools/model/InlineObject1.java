package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SkinModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Request Mojang to download a skin from an URL and apply to the player
 **/
@ApiModel(description = "Request Mojang to download a skin from an URL and apply to the player")
public class InlineObject1   {
  
  private @Valid SkinModel model = null;
  private @Valid String url;

  /**
   **/
  public InlineObject1 model(SkinModel model) {
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
  public InlineObject1 url(String url) {
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
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(model, inlineObject1.model) &&
        Objects.equals(url, inlineObject1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
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

