/*
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// This is obtained by decoding the \"textures\" property
type PlayerProfileTexturePropertyValue struct {
	// UNIX timestamp in milliseconds
	Timestamp int64 `json:"timestamp"`
	// The player UUID without hyphens
	ProfileId string `json:"profileId"`
	// The player's name
	ProfileName string `json:"profileName"`
	// Only present if unsigned was set to false in the request
	SignatureRequired bool `json:"signatureRequired,omitempty"`
	Textures PlayerTexture `json:"textures,omitempty"`
}
