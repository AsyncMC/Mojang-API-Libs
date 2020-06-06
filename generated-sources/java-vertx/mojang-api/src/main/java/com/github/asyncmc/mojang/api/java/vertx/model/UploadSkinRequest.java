package com.github.asyncmc.mojang.api.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.asyncmc.mojang.api.java.vertx.model.SkinModel;
import java.io.File;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class UploadSkinRequest   {
  
  private SkinModel model = null;
  private File file = ;

  public UploadSkinRequest () {

  }

  public UploadSkinRequest (SkinModel model, File file) {
    this.model = model;
    this.file = file;
  }

    
  @JsonProperty("model")
  public SkinModel getModel() {
    return model;
  }
  public void setModel(SkinModel model) {
    this.model = model;
  }

    
  @JsonProperty("file")
  public File getFile() {
    return file;
  }
  public void setFile(File file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
