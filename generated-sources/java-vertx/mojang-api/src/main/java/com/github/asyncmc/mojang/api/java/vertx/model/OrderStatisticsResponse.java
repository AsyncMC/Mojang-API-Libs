package com.github.asyncmc.mojang.api.java.vertx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderStatisticsResponse   {
  
  private Long total = ;
  private Long last24h = ;
  private Double saleVelocityPerSeconds = ;

  public OrderStatisticsResponse () {

  }

  public OrderStatisticsResponse (Long total, Long last24h, Double saleVelocityPerSeconds) {
    this.total = total;
    this.last24h = last24h;
    this.saleVelocityPerSeconds = saleVelocityPerSeconds;
  }

    
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

    
  @JsonProperty("last24h")
  public Long getLast24h() {
    return last24h;
  }
  public void setLast24h(Long last24h) {
    this.last24h = last24h;
  }

    
  @JsonProperty("saleVelocityPerSeconds")
  public Double getSaleVelocityPerSeconds() {
    return saleVelocityPerSeconds;
  }
  public void setSaleVelocityPerSeconds(Double saleVelocityPerSeconds) {
    this.saleVelocityPerSeconds = saleVelocityPerSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatisticsResponse orderStatisticsResponse = (OrderStatisticsResponse) o;
    return Objects.equals(total, orderStatisticsResponse.total) &&
        Objects.equals(last24h, orderStatisticsResponse.last24h) &&
        Objects.equals(saleVelocityPerSeconds, orderStatisticsResponse.saleVelocityPerSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, last24h, saleVelocityPerSeconds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
