package com.github.asyncmc.mojang.api.java.undertow.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.asyncmc.mojang.api.java.undertow.server.model.OrderStatistic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * The body of the request to get the order statistics
 **/

@ApiModel(description = "The body of the request to get the order statistics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-06T04:59:32.548106800-03:00[America/Sao_Paulo]")
public class OrderStatisticsRequest   {
  
  private List<OrderStatistic> metricKeys = new ArrayList<OrderStatistic>();

  /**
   **/
  public OrderStatisticsRequest metricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metricKeys")
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
    return Objects.equals(metricKeys, orderStatisticsRequest.metricKeys);
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

