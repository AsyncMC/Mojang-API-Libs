package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.OrderStatistic;

/**
 * The body of the request to get the order statistics
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderStatisticsRequest   {
  
  private List<OrderStatistic> metricKeys = new ArrayList<>();

  public OrderStatisticsRequest () {

  }

  public OrderStatisticsRequest (List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
  }

    
  @JsonProperty("metricKeys")
  public List<OrderStatistic> getMetricKeys() {
    return metricKeys;
  }
  public void setMetricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
