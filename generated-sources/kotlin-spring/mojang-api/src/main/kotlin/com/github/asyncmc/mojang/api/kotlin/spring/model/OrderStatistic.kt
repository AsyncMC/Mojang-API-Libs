package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* Valid options to query the order statistics
* Values: ITEM_SOLD_MINECRAFT,PREPAID_CARD_REDEEMED_MINECRAFT,ITEM_SOLD_COBALT,ITEM_SOLD_SCROLLS,PREPAID_CARD_REDEEMED_COBALT,ITEM_SOLD_DUNGEONS
*/
enum class OrderStatistic(val value: String) {

    ITEM_SOLD_MINECRAFT("item_sold_minecraft"),

    PREPAID_CARD_REDEEMED_MINECRAFT("prepaid_card_redeemed_minecraft"),

    ITEM_SOLD_COBALT("item_sold_cobalt"),

    ITEM_SOLD_SCROLLS("item_sold_scrolls"),

    PREPAID_CARD_REDEEMED_COBALT("prepaid_card_redeemed_cobalt"),

    ITEM_SOLD_DUNGEONS("item_sold_dungeons");

}

