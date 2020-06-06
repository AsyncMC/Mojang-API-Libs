/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// The current player, demo and legacy status of a player identified by the id
type CurrentPlayerIDs struct {
	// The player UUID without hyphens
	Id string `json:"id"`
	// The current name being used by this player
	Name string `json:"name"`
	// If account has not been converted
	Legacy bool `json:"legacy,omitempty"`
	// If the player has not puchased the game
	Demo bool `json:"demo,omitempty"`
}
