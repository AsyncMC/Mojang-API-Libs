package com.github.asyncmc.mojang.api.java.play.framework.model;

import com.github.asyncmc.mojang.api.java.play.framework.model.OrderStatistic;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The body of the request to get the order statistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:37.270382100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderStatisticsRequest   {
  @JsonProperty("metricKeys")
  private List<OrderStatistic> metricKeys = new ArrayList<>();

  public OrderStatisticsRequest metricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
    return this;
  }

  public OrderStatisticsRequest addMetricKeysItem(OrderStatistic metricKeysItem) {
    metricKeys.add(metricKeysItem);
    return this;
  }

   /**
   * Get metricKeys
   * @return metricKeys
  **/
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
    return Objects.equals(metricKeys, orderStatisticsRequest.metricKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricKeys);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

