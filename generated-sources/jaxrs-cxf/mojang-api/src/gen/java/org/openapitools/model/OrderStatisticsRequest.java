package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OrderStatistic;
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
  * The body of the request to get the order statistics
 **/
@ApiModel(description="The body of the request to get the order statistics")
public class OrderStatisticsRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<OrderStatistic> metricKeys = new ArrayList<OrderStatistic>();
 /**
   * Get metricKeys
   * @return metricKeys
  **/
  @JsonProperty("metricKeys")
  @NotNull
  public List<OrderStatistic> getMetricKeys() {
    return metricKeys;
  }

  public void setMetricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
  }

  public OrderStatisticsRequest metricKeys(List<OrderStatistic> metricKeys) {
    this.metricKeys = metricKeys;
    return this;
  }

  public OrderStatisticsRequest addMetricKeysItem(OrderStatistic metricKeysItem) {
    this.metricKeys.add(metricKeysItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

