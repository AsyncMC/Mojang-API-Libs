# Mojang Session API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' PlayerProfile Class
#'
#' @field id 
#' @field name 
#' @field legacy 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PlayerProfile <- R6::R6Class(
  'PlayerProfile',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `legacy` = NULL,
    `properties` = NULL,
    initialize = function(`id`, `name`, `legacy`, `properties`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`legacy`)) {
        self$`legacy` <- `legacy`
      }
      if (!missing(`properties`)) {
        stopifnot(is.list(`properties`), length(`properties`) != 0)
        lapply(`properties`, function(x) stopifnot(R6::is.R6(x)))
        self$`properties` <- `properties`
      }
    },
    toJSON = function() {
      PlayerProfileObject <- list()
      if (!is.null(self$`id`)) {
        PlayerProfileObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        PlayerProfileObject[['name']] <- self$`name`
      }
      if (!is.null(self$`legacy`)) {
        PlayerProfileObject[['legacy']] <- self$`legacy`
      }
      if (!is.null(self$`properties`)) {
        PlayerProfileObject[['properties']] <- lapply(self$`properties`, function(x) x$toJSON())
      }

      PlayerProfileObject
    },
    fromJSON = function(PlayerProfileJson) {
      PlayerProfileObject <- jsonlite::fromJSON(PlayerProfileJson)
      if (!is.null(PlayerProfileObject$`id`)) {
        self$`id` <- PlayerProfileObject$`id`
      }
      if (!is.null(PlayerProfileObject$`name`)) {
        self$`name` <- PlayerProfileObject$`name`
      }
      if (!is.null(PlayerProfileObject$`legacy`)) {
        self$`legacy` <- PlayerProfileObject$`legacy`
      }
      if (!is.null(PlayerProfileObject$`properties`)) {
        self$`properties` <- lapply(PlayerProfileObject$`properties`, function(x) {
          propertiesObject <- PlayerProfileProperty$new()
          propertiesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          propertiesObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "legacy": %s,
           "properties": [%s]
        }',
        self$`id`,
        self$`name`,
        self$`legacy`,
        lapply(self$`properties`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(PlayerProfileJson) {
      PlayerProfileObject <- jsonlite::fromJSON(PlayerProfileJson)
      self$`id` <- PlayerProfileObject$`id`
      self$`name` <- PlayerProfileObject$`name`
      self$`legacy` <- PlayerProfileObject$`legacy`
      self$`properties` <- lapply(PlayerProfileObject$`properties`, function(x) PlayerProfileProperty$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
