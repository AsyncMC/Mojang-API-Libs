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
	"net/http"
	"strings"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name        string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method      string
	// Pattern is the pattern of the URI.
	Pattern     string
	// HandlerFunc is the handler function of this route.
	HandlerFunc gin.HandlerFunc
}

// Routes is the list of the generated Route.
type Routes []Route

// NewRouter returns a new router.
func NewRouter() *gin.Engine {
	router := gin.Default()
	for _, route := range routes {
		switch route.Method {
		case "GET":
			router.GET(route.Pattern, route.HandlerFunc)
		case "POST":
			router.POST(route.Pattern, route.HandlerFunc)
		case "PUT":
			router.PUT(route.Pattern, route.HandlerFunc)
		case "DELETE":
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Index is the index handler.
func Index(c *gin.Context) {
	c.String(http.StatusOK, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		"GET",
		"/",
		Index,
	},

	{
		"GetOrdersStatistics",
		strings.ToUpper("Post"),
		"/orders/statistics",
		GetOrdersStatistics,
	},

	{
		"FindUniqueIdsByName",
		strings.ToUpper("Post"),
		"/profiles/minecraft",
		FindUniqueIdsByName,
	},

	{
		"GetNameHistory",
		strings.ToUpper("Get"),
		"/user/profiles/:stripped_uuid/names",
		GetNameHistory,
	},

	{
		"GetUniqueIdByName",
		strings.ToUpper("Get"),
		"/users/profiles/minecraft/:username",
		GetUniqueIdByName,
	},

	{
		"CheckSecurityStatus",
		strings.ToUpper("Get"),
		"/user/security/location",
		CheckSecurityStatus,
	},

	{
		"ListPendingSecurityQuestions",
		strings.ToUpper("Get"),
		"/user/security/challenges",
		ListPendingSecurityQuestions,
	},

	{
		"SendSecurityQuestionAnswers",
		strings.ToUpper("Post"),
		"/user/security/location",
		SendSecurityQuestionAnswers,
	},

	{
		"ChangePlayerSkin",
		strings.ToUpper("Post"),
		"/user/profile/:stripped_uuid/skin",
		ChangePlayerSkin,
	},

	{
		"ResetPlayerSkin",
		strings.ToUpper("Delete"),
		"/user/profile/:stripped_uuid/skin",
		ResetPlayerSkin,
	},

	{
		"UploadPlayerSkin",
		strings.ToUpper("Put"),
		"/user/profile/:stripped_uuid/skin",
		UploadPlayerSkin,
	},
}
