package com.github.asyncmc.mojang.api.java.msf4j.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.java.msf4j.model.SkinModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;

/**
 * UploadSkinRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:29.917115200-03:00[America/Sao_Paulo]")
public class UploadSkinRequest   {
  @JsonProperty("model")
  private SkinModel model = null;

  @JsonProperty("file")
  private File file;

  public UploadSkinRequest model(SkinModel model) {
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

  public UploadSkinRequest file(File file) {
    this.file = file;
    return this;
  }

   /**
   * The skin image in PNG format
   * @return file
  **/
  @ApiModelProperty(required = true, value = "The skin image in PNG format")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
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
    UploadSkinRequest uploadSkinRequest = (UploadSkinRequest) o;
    return Objects.equals(this.model, uploadSkinRequest.model) &&
        Objects.equals(this.file, uploadSkinRequest.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSkinRequest {\n");
    
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

