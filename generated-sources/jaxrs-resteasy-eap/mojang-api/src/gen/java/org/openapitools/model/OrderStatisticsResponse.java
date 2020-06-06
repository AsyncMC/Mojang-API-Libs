package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-05T23:34:10.608540300-03:00[America/Sao_Paulo]")
public class OrderStatisticsResponse   {
  

  private Long total;

  private Long last24h;

  private Double saleVelocityPerSeconds;

  /**
   * total amount sold
   **/
  
  @ApiModelProperty(required = true, value = "total amount sold")
  @JsonProperty("total")
  @NotNull
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   * total sold in last 24 hours
   **/
  
  @ApiModelProperty(required = true, value = "total sold in last 24 hours")
  @JsonProperty("last24h")
  @NotNull
  public Long getLast24h() {
    return last24h;
  }
  public void setLast24h(Long last24h) {
    this.last24h = last24h;
  }

  /**
   * decimal average sales per second
   **/
  
  @ApiModelProperty(required = true, value = "decimal average sales per second")
  @JsonProperty("saleVelocityPerSeconds")
  @NotNull
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

