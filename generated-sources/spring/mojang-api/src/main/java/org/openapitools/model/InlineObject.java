package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SkinModel;
import org.springframework.core.io.Resource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-05T23:36:11.663568600-03:00[America/Sao_Paulo]")

public class InlineObject   {
  @JsonProperty("model")
  private SkinModel model = null;

  @JsonProperty("file")
  private Resource file;

  public InlineObject model(SkinModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @ApiModelProperty(value = "")

  @Valid

  public SkinModel getModel() {
    return model;
  }

  public void setModel(SkinModel model) {
    this.model = model;
  }

  public InlineObject file(Resource file) {
    this.file = file;
    return this;
  }

  /**
   * The skin image in PNG format
   * @return file
  */
  @ApiModelProperty(required = true, value = "The skin image in PNG format")
  @NotNull

  @Valid

  public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.model, inlineObject.model) &&
        Objects.equals(this.file, inlineObject.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

