/*
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PlayerProfile struct {
	// The player UUID without hyphens
	Id string `json:"id"`
	Name string `json:"name"`
	// Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
	Legacy bool `json:"legacy,omitempty"`
	// An array with all player properties, like skin and cape
	Properties []PlayerProfileProperty `json:"properties"`
}
