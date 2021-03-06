# Mojang API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' NameChange Class
#'
#' @field name 
#' @field changedToAt 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NameChange <- R6::R6Class(
  'NameChange',
  public = list(
    `name` = NULL,
    `changedToAt` = NULL,
    initialize = function(`name`, `changedToAt`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`changedToAt`)) {
        stopifnot(is.numeric(`changedToAt`), length(`changedToAt`) == 1)
        self$`changedToAt` <- `changedToAt`
      }
    },
    toJSON = function() {
      NameChangeObject <- list()
      if (!is.null(self$`name`)) {
        NameChangeObject[['name']] <- self$`name`
      }
      if (!is.null(self$`changedToAt`)) {
        NameChangeObject[['changedToAt']] <- self$`changedToAt`
      }

      NameChangeObject
    },
    fromJSON = function(NameChangeJson) {
      NameChangeObject <- jsonlite::fromJSON(NameChangeJson)
      if (!is.null(NameChangeObject$`name`)) {
        self$`name` <- NameChangeObject$`name`
      }
      if (!is.null(NameChangeObject$`changedToAt`)) {
        self$`changedToAt` <- NameChangeObject$`changedToAt`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "changedToAt": %d
        }',
        self$`name`,
        self$`changedToAt`
      )
    },
    fromJSONString = function(NameChangeJson) {
      NameChangeObject <- jsonlite::fromJSON(NameChangeJson)
      self$`name` <- NameChangeObject$`name`
      self$`changedToAt` <- NameChangeObject$`changedToAt`
    }
  )
)
