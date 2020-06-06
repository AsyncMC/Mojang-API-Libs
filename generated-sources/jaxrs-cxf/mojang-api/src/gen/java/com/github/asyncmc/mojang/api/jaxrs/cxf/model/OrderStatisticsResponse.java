package com.github.asyncmc.mojang.api.jaxrs.cxf.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 **/
@ApiModel(description="A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.")
public class OrderStatisticsResponse  {
  
  @ApiModelProperty(required = true, value = "total amount sold")
 /**
   * total amount sold
  **/
  private Long total;

  @ApiModelProperty(required = true, value = "total sold in last 24 hours")
 /**
   * total sold in last 24 hours
  **/
  private Long last24h;

  @ApiModelProperty(required = true, value = "decimal average sales per second")
 /**
   * decimal average sales per second
  **/
  private Double saleVelocityPerSeconds;
 /**
   * total amount sold
   * @return total
  **/
  @JsonProperty("total")
  @NotNull
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public OrderStatisticsResponse total(Long total) {
    this.total = total;
    return this;
  }

 /**
   * total sold in last 24 hours
   * @return last24h
  **/
  @JsonProperty("last24h")
  @NotNull
  public Long getLast24h() {
    return last24h;
  }

  public void setLast24h(Long last24h) {
    this.last24h = last24h;
  }

  public OrderStatisticsResponse last24h(Long last24h) {
    this.last24h = last24h;
    return this;
  }

 /**
   * decimal average sales per second
   * @return saleVelocityPerSeconds
  **/
  @JsonProperty("saleVelocityPerSeconds")
  @NotNull
  public Double getSaleVelocityPerSeconds() {
    return saleVelocityPerSeconds;
  }

  public void setSaleVelocityPerSeconds(Double saleVelocityPerSeconds) {
    this.saleVelocityPerSeconds = saleVelocityPerSeconds;
  }

  public OrderStatisticsResponse saleVelocityPerSeconds(Double saleVelocityPerSeconds) {
    this.saleVelocityPerSeconds = saleVelocityPerSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatisticsResponse {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    last24h: ").append(toIndentedString(last24h)).append("\n");
    sb.append("    saleVelocityPerSeconds: ").append(toIndentedString(saleVelocityPerSeconds)).append("\n");
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

