/*
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


package com.github.asyncmc.mojang.api.java.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.asyncmc.mojang.api.java.model.OrderStatistic;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The body of the request to get the order statistics
 */
@ApiModel(description = "The body of the request to get the order statistics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-06T02:32:26.085625400-03:00[America/Sao_Paulo]")
public class OrderStatisticsRequest {
  public static final String SERIALIZED_NAME_METRIC_KEYS = "metricKeys";
  @SerializedName(SERIALIZED_NAME_METRIC_KEYS)
  private List<OrderStatistic> metricKeys = new ArrayList<OrderStatistic>();

  public OrderStatisticsRequest metricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
    return this;
  }

  public OrderStatisticsRequest addMetricKeysItem(OrderStatistic metricKeysItem) {
    this.metricKeys.add(metricKeysItem);
    return this;
  }

   /**
   * Get metricKeys
   * @return metricKeys
  **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderStatistic> getMetricKeys() {
    return metricKeys;
  }

  public void setMetricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatisticsRequest orderStatisticsRequest = (OrderStatisticsRequest) o;
    return Objects.equals(this.metricKeys, orderStatisticsRequest.metricKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatisticsRequest {\n");
    
    sb.append("    metricKeys: ").append(toIndentedString(metricKeys)).append("\n");
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

