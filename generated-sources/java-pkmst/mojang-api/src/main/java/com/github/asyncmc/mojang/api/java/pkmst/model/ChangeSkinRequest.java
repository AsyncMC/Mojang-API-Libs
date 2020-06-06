package com.github.asyncmc.mojang.api.java.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.java.pkmst.model.SkinModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
@ApiModel(description = "Request Mojang to download a skin from an URL and apply to the player")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T04:59:25.087174700-03:00[America/Sao_Paulo]")

public class ChangeSkinRequest   {
  @JsonProperty("model")
  private SkinModel model = null;

  @JsonProperty("url")
  private String url;

  public ChangeSkinRequest model(SkinModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public SkinModel getModel() {
    return model;
  }

  public void setModel(SkinModel model) {
    this.model = model;
  }

  public ChangeSkinRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL which Mojang servers will download and apply the skin
   * @return url
  **/
  @ApiModelProperty(example = "http://assets.mojang.com/SkinTemplates/steve.png", required = true, value = "The URL which Mojang servers will download and apply the skin")
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
    return Objects.equals(this.model, changeSkinRequest.model) &&
        Objects.equals(this.url, changeSkinRequest.url);
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

