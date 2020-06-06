package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Valid options to query the order statistics
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Valid options to query the order statistics
 */
public enum OrderStatistic {
  
  ITEM_SOLD_MINECRAFT("item_sold_minecraft"),
  
  PREPAID_CARD_REDEEMED_MINECRAFT("prepaid_card_redeemed_minecraft"),
  
  ITEM_SOLD_COBALT("item_sold_cobalt"),
  
  ITEM_SOLD_SCROLLS("item_sold_scrolls"),
  
  PREPAID_CARD_REDEEMED_COBALT("prepaid_card_redeemed_cobalt"),
  
  ITEM_SOLD_DUNGEONS("item_sold_dungeons");

  private String value;

  OrderStatistic(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatistic fromValue(String text) {
    for (OrderStatistic b : OrderStatistic.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}