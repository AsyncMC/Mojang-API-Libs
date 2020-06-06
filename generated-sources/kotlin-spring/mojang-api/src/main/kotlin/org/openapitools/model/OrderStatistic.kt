package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* Valid options to query the order statistics
* Values: itemSoldMinecraft,prepaidCardRedeemedMinecraft,itemSoldCobalt,itemSoldScrolls,prepaidCardRedeemedCobalt,itemSoldDungeons
*/
enum class OrderStatistic(val value: String) {

    itemSoldMinecraft("item_sold_minecraft"),

    prepaidCardRedeemedMinecraft("prepaid_card_redeemed_minecraft"),

    itemSoldCobalt("item_sold_cobalt"),

    itemSoldScrolls("item_sold_scrolls"),

    prepaidCardRedeemedCobalt("prepaid_card_redeemed_cobalt"),

    itemSoldDungeons("item_sold_dungeons");

}

