/*
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type GameProfile struct {

	Agent string `json:"agent,omitempty"`

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	UserId string `json:"userId,omitempty"`

	// Unix timestamp in milliseconds
	CreatedAt int64 `json:"createdAt,omitempty"`

	LegacyProfile bool `json:"legacyProfile,omitempty"`

	Suspended bool `json:"suspended,omitempty"`

	Paid bool `json:"paid,omitempty"`

	Migrated bool `json:"migrated,omitempty"`

	Legacy bool `json:"legacy,omitempty"`
}
