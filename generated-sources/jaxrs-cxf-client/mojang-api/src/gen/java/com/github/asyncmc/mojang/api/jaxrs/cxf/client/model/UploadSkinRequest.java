package com.github.asyncmc.mojang.api.jaxrs.cxf.client.model;

import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.SkinModel;
import java.io.File;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadSkinRequest  {
  
  @ApiModelProperty(value = "")
  private SkinModel model = null;

  @ApiModelProperty(required = true, value = "The skin image in PNG format")
 /**
   * The skin image in PNG format
  **/
  private File file;
 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public SkinModel getModel() {
    return model;
  }

  public void setModel(SkinModel model) {
    this.model = model;
  }

  public UploadSkinRequest model(SkinModel model) {
    this.model = model;
    return this;
  }

 /**
   * The skin image in PNG format
   * @return file
  **/
  @JsonProperty("file")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public UploadSkinRequest file(File file) {
    this.file = file;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

