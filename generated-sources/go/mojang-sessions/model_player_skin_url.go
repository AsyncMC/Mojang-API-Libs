/*
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// Wraps the URL to the texture and configures the player's model
type PlayerSkinUrl struct {
	// The URL to the texture, must be in Mojang's domains.
	Url string `json:"url"`
}
