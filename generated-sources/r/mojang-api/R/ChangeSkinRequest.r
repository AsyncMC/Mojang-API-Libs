# Mojang API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' ChangeSkinRequest Class
#'
#' @field model 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChangeSkinRequest <- R6::R6Class(
  'ChangeSkinRequest',
  public = list(
    `model` = NULL,
    `url` = NULL,
    initialize = function(`model`, `url`){
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      ChangeSkinRequestObject <- list()
      if (!is.null(self$`model`)) {
        ChangeSkinRequestObject[['model']] <- self$`model`$toJSON()
      }
      if (!is.null(self$`url`)) {
        ChangeSkinRequestObject[['url']] <- self$`url`
      }

      ChangeSkinRequestObject
    },
    fromJSON = function(ChangeSkinRequestJson) {
      ChangeSkinRequestObject <- jsonlite::fromJSON(ChangeSkinRequestJson)
      if (!is.null(ChangeSkinRequestObject$`model`)) {
        modelObject <- SkinModel$new()
        modelObject$fromJSON(jsonlite::toJSON(ChangeSkinRequestObject$model, auto_unbox = TRUE))
        self$`model` <- modelObject
      }
      if (!is.null(ChangeSkinRequestObject$`url`)) {
        self$`url` <- ChangeSkinRequestObject$`url`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "model": %s,
           "url": %s
        }',
        self$`model`$toJSON(),
        self$`url`
      )
    },
    fromJSONString = function(ChangeSkinRequestJson) {
      ChangeSkinRequestObject <- jsonlite::fromJSON(ChangeSkinRequestJson)
      SkinModelObject <- SkinModel$new()
      self$`model` <- SkinModelObject$fromJSON(jsonlite::toJSON(ChangeSkinRequestObject$model, auto_unbox = TRUE))
      self$`url` <- ChangeSkinRequestObject$`url`
    }
  )
)
