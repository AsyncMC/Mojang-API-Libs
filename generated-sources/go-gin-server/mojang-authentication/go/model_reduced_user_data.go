/*
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ReducedUserData struct {

	Id string `json:"id,omitempty"`

	Properties []GameProfileProperty `json:"properties,omitempty"`
}
