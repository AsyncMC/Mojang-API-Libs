/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// OrderStatistic : Valid options to query the order statistics
type OrderStatistic string

// List of OrderStatistic
const (
	ITEM_SOLD_MINECRAFT OrderStatistic = "item_sold_minecraft"
	PREPAID_CARD_REDEEMED_MINECRAFT OrderStatistic = "prepaid_card_redeemed_minecraft"
	ITEM_SOLD_COBALT OrderStatistic = "item_sold_cobalt"
	ITEM_SOLD_SCROLLS OrderStatistic = "item_sold_scrolls"
	PREPAID_CARD_REDEEMED_COBALT OrderStatistic = "prepaid_card_redeemed_cobalt"
	ITEM_SOLD_DUNGEONS OrderStatistic = "item_sold_dungeons"
)
