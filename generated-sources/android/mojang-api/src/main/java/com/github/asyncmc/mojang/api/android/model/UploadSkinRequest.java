/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.api.android.model;

import com.github.asyncmc.mojang.api.android.model.SkinModel;
import java.io.File;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UploadSkinRequest {
  
  @SerializedName("model")
  private SkinModel model = null;
  @SerializedName("file")
  private File file = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public SkinModel getModel() {
    return model;
  }
  public void setModel(SkinModel model) {
    this.model = model;
  }

  /**
   * The skin image in PNG format
   **/
  @ApiModelProperty(required = true, value = "The skin image in PNG format")
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
    return (this.model == null ? uploadSkinRequest.model == null : this.model.equals(uploadSkinRequest.model)) &&
        (this.file == null ? uploadSkinRequest.file == null : this.file.equals(uploadSkinRequest.file));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.file == null ? 0: this.file.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSkinRequest {\n");
    
    sb.append("  model: ").append(model).append("\n");
    sb.append("  file: ").append(file).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
