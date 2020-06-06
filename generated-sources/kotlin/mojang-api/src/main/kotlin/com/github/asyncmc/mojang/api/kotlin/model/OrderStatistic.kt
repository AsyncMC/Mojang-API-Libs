/**
* Mojang API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.github.asyncmc.mojang.api.kotlin.model


import com.squareup.moshi.Json

/**
* Valid options to query the order statistics
* Values: ITEM_SOLD_MINECRAFT,PREPAID_CARD_REDEEMED_MINECRAFT,ITEM_SOLD_COBALT,ITEM_SOLD_SCROLLS,PREPAID_CARD_REDEEMED_COBALT,ITEM_SOLD_DUNGEONS
*/
enum class OrderStatistic(val value: kotlin.String){

    @Json(name = "item_sold_minecraft") ITEM_SOLD_MINECRAFT("item_sold_minecraft"),

    @Json(name = "prepaid_card_redeemed_minecraft") PREPAID_CARD_REDEEMED_MINECRAFT("prepaid_card_redeemed_minecraft"),

    @Json(name = "item_sold_cobalt") ITEM_SOLD_COBALT("item_sold_cobalt"),

    @Json(name = "item_sold_scrolls") ITEM_SOLD_SCROLLS("item_sold_scrolls"),

    @Json(name = "prepaid_card_redeemed_cobalt") PREPAID_CARD_REDEEMED_COBALT("prepaid_card_redeemed_cobalt"),

    @Json(name = "item_sold_dungeons") ITEM_SOLD_DUNGEONS("item_sold_dungeons");

}
