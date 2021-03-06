# Mojang API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' OrderStatisticsRequest Class
#'
#' @field metricKeys 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStatisticsRequest <- R6::R6Class(
  'OrderStatisticsRequest',
  public = list(
    `metricKeys` = NULL,
    initialize = function(`metricKeys`){
      if (!missing(`metricKeys`)) {
        stopifnot(is.list(`metricKeys`), length(`metricKeys`) != 0)
        lapply(`metricKeys`, function(x) stopifnot(R6::is.R6(x)))
        self$`metricKeys` <- `metricKeys`
      }
    },
    toJSON = function() {
      OrderStatisticsRequestObject <- list()
      if (!is.null(self$`metricKeys`)) {
        OrderStatisticsRequestObject[['metricKeys']] <- lapply(self$`metricKeys`, function(x) x$toJSON())
      }

      OrderStatisticsRequestObject
    },
    fromJSON = function(OrderStatisticsRequestJson) {
      OrderStatisticsRequestObject <- jsonlite::fromJSON(OrderStatisticsRequestJson)
      if (!is.null(OrderStatisticsRequestObject$`metricKeys`)) {
        self$`metricKeys` <- lapply(OrderStatisticsRequestObject$`metricKeys`, function(x) {
          metricKeysObject <- OrderStatistic$new()
          metricKeysObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          metricKeysObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "metricKeys": [%s]
        }',
        lapply(self$`metricKeys`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(OrderStatisticsRequestJson) {
      OrderStatisticsRequestObject <- jsonlite::fromJSON(OrderStatisticsRequestJson)
      self$`metricKeys` <- lapply(OrderStatisticsRequestObject$`metricKeys`, function(x) OrderStatistic$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
