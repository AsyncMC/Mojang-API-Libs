/*
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type UsernamePassword struct {

	// The Mojang account e-mail or username. Never store it.
	Username string `json:"username"`

	// The Mojang account password, never store it.
	Password string `json:"password"`
}
