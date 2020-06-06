/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"os"
)

type UploadSkinRequest struct {

	Model *SkinModel `json:"model,omitempty"`

	// The skin image in PNG format
	File **os.File `json:"file"`
}