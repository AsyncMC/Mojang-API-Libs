package com.github.asyncmc.mojang.api.java.play.framework.model;

import com.github.asyncmc.mojang.api.java.play.framework.model.SkinModel;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:28.832500800-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

