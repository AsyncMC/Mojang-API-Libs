/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// Request Mojang to download a skin from an URL and apply to the player
type ChangeSkinRequest struct {
	Model SkinModel `json:"model,omitempty"`
	// The URL which Mojang servers will download and apply the skin
	Url string `json:"url"`
}
