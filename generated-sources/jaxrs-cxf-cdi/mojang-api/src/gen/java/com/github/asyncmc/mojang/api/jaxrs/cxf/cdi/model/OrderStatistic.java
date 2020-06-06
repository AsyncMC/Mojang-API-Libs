package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Valid options to query the order statistics
 **/
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum OrderStatistic {

    @XmlEnumValue("item_sold_minecraft") ITEM_SOLD_MINECRAFT(String.valueOf("item_sold_minecraft")), @XmlEnumValue("prepaid_card_redeemed_minecraft") PREPAID_CARD_REDEEMED_MINECRAFT(String.valueOf("prepaid_card_redeemed_minecraft")), @XmlEnumValue("item_sold_cobalt") ITEM_SOLD_COBALT(String.valueOf("item_sold_cobalt")), @XmlEnumValue("item_sold_scrolls") ITEM_SOLD_SCROLLS(String.valueOf("item_sold_scrolls")), @XmlEnumValue("prepaid_card_redeemed_cobalt") PREPAID_CARD_REDEEMED_COBALT(String.valueOf("prepaid_card_redeemed_cobalt")), @XmlEnumValue("item_sold_dungeons") ITEM_SOLD_DUNGEONS(String.valueOf("item_sold_dungeons"));


    private String value;

    OrderStatistic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderStatistic fromValue(String v) {
        for (OrderStatistic b : OrderStatistic.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



