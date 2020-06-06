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


package com.github.asyncmc.mojang.api.jaxrs.jersey.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.OrderStatistic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The body of the request to get the order statistics
 */
@ApiModel(description = "The body of the request to get the order statistics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:09.626845200-03:00[America/Sao_Paulo]")
public class OrderStatisticsRequest   {
  @JsonProperty("metricKeys")
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
  @JsonProperty("metricKeys")
  @ApiModelProperty(required = true, value = "")
    @NotNull
@Valid
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

