package com.github.asyncmc.mojang.api.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.api.java.vertx.model.SkinModel;

/**
 * Request Mojang to download a skin from an URL and apply to the player
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ChangeSkinRequest   {
  
  private SkinModel model = null;
  private String url = ;

  public ChangeSkinRequest () {

  }

  public ChangeSkinRequest (SkinModel model, String url) {
    this.model = model;
    this.url = url;
  }

    
  @JsonProperty("model")
  public SkinModel getModel() {
    return model;
  }
  public void setModel(SkinModel model) {
    this.model = model;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
