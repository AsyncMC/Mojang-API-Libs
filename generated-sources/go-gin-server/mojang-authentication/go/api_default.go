/*
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

// Authenticate - 
func Authenticate(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// Invalidate - 
func Invalidate(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// Refresh - 
func Refresh(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// Siginout - 
func Siginout(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// Validate - 
func Validate(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}
