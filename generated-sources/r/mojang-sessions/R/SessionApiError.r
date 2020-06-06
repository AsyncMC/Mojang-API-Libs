# Mojang Session API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' SessionApiError Class
#'
#' @field error 
#' @field path 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SessionApiError <- R6::R6Class(
  'SessionApiError',
  public = list(
    `error` = NULL,
    `path` = NULL,
    initialize = function(`error`, `path`){
      if (!missing(`error`)) {
        stopifnot(is.character(`error`), length(`error`) == 1)
        self$`error` <- `error`
      }
      if (!missing(`path`)) {
        stopifnot(is.character(`path`), length(`path`) == 1)
        self$`path` <- `path`
      }
    },
    toJSON = function() {
      SessionApiErrorObject <- list()
      if (!is.null(self$`error`)) {
        SessionApiErrorObject[['error']] <- self$`error`
      }
      if (!is.null(self$`path`)) {
        SessionApiErrorObject[['path']] <- self$`path`
      }

      SessionApiErrorObject
    },
    fromJSON = function(SessionApiErrorJson) {
      SessionApiErrorObject <- jsonlite::fromJSON(SessionApiErrorJson)
      if (!is.null(SessionApiErrorObject$`error`)) {
        self$`error` <- SessionApiErrorObject$`error`
      }
      if (!is.null(SessionApiErrorObject$`path`)) {
        self$`path` <- SessionApiErrorObject$`path`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "error": %s,
           "path": %s
        }',
        self$`error`,
        self$`path`
      )
    },
    fromJSONString = function(SessionApiErrorJson) {
      SessionApiErrorObject <- jsonlite::fromJSON(SessionApiErrorJson)
      self$`error` <- SessionApiErrorObject$`error`
      self$`path` <- SessionApiErrorObject$`path`
    }
  )
)