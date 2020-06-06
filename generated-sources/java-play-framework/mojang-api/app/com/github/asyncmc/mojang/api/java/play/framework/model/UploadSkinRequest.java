package com.github.asyncmc.mojang.api.java.play.framework.model;

import com.github.asyncmc.mojang.api.java.play.framework.model.SkinModel;
import java.io.InputStream;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * UploadSkinRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:37.270382100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UploadSkinRequest   {
  @JsonProperty("model")
  private SkinModel model = null;

  @JsonProperty("file")
  private InputStream file;

  public UploadSkinRequest model(SkinModel model) {
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

  public UploadSkinRequest file(InputStream file) {
    this.file = file;
    return this;
  }

   /**
   * The skin image in PNG format
   * @return file
  **/
  @NotNull
@Valid
  public InputStream getFile() {
    return file;
  }

  public void setFile(InputStream file) {
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
    return Objects.equals(model, uploadSkinRequest.model) &&
        Objects.equals(file, uploadSkinRequest.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, file);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

