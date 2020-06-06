# Mojang Authentication API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' RefreshRequest Class
#'
#' @field accessToken 
#' @field clientToken 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RefreshRequest <- R6::R6Class(
  'RefreshRequest',
  public = list(
    `accessToken` = NULL,
    `clientToken` = NULL,
    initialize = function(`accessToken`, `clientToken`){
      if (!missing(`accessToken`)) {
        stopifnot(is.character(`accessToken`), length(`accessToken`) == 1)
        self$`accessToken` <- `accessToken`
      }
      if (!missing(`clientToken`)) {
        stopifnot(is.character(`clientToken`), length(`clientToken`) == 1)
        self$`clientToken` <- `clientToken`
      }
    },
    toJSON = function() {
      RefreshRequestObject <- list()
      if (!is.null(self$`accessToken`)) {
        RefreshRequestObject[['accessToken']] <- self$`accessToken`
      }
      if (!is.null(self$`clientToken`)) {
        RefreshRequestObject[['clientToken']] <- self$`clientToken`
      }

      RefreshRequestObject
    },
    fromJSON = function(RefreshRequestJson) {
      RefreshRequestObject <- jsonlite::fromJSON(RefreshRequestJson)
      if (!is.null(RefreshRequestObject$`accessToken`)) {
        self$`accessToken` <- RefreshRequestObject$`accessToken`
      }
      if (!is.null(RefreshRequestObject$`clientToken`)) {
        self$`clientToken` <- RefreshRequestObject$`clientToken`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "accessToken": %s,
           "clientToken": %s
        }',
        self$`accessToken`,
        self$`clientToken`
      )
    },
    fromJSONString = function(RefreshRequestJson) {
      RefreshRequestObject <- jsonlite::fromJSON(RefreshRequestJson)
      self$`accessToken` <- RefreshRequestObject$`accessToken`
      self$`clientToken` <- RefreshRequestObject$`clientToken`
    }
  )
)