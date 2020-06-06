# Mojang Session API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' PlayerTextureURL Class
#'
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PlayerTextureURL <- R6::R6Class(
  'PlayerTextureURL',
  public = list(
    `url` = NULL,
    initialize = function(`url`){
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      PlayerTextureURLObject <- list()
      if (!is.null(self$`url`)) {
        PlayerTextureURLObject[['url']] <- self$`url`
      }

      PlayerTextureURLObject
    },
    fromJSON = function(PlayerTextureURLJson) {
      PlayerTextureURLObject <- jsonlite::fromJSON(PlayerTextureURLJson)
      if (!is.null(PlayerTextureURLObject$`url`)) {
        self$`url` <- PlayerTextureURLObject$`url`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "url": %s
        }',
        self$`url`
      )
    },
    fromJSONString = function(PlayerTextureURLJson) {
      PlayerTextureURLObject <- jsonlite::fromJSON(PlayerTextureURLJson)
      self$`url` <- PlayerTextureURLObject$`url`
    }
  )
)