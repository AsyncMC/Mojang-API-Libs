package apimodels;

import apimodels.SkinModel;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:31.774915700-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject1   {
  @JsonProperty("model")
  private SkinModel model = null;

  @JsonProperty("url")
  private String url;

  public InlineObject1 model(SkinModel model) {
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

  public InlineObject1 url(String url) {
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
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(model, inlineObject1.model) &&
        Objects.equals(url, inlineObject1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

