/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 2020-06-05
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// The body of the request to get the order statistics
type OrderStatisticsRequest struct {
	MetricKeys []OrderStatistic `json:"metricKeys"`
}