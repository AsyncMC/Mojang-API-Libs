# Mojang Authentication API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' UsernamePassword Class
#'
#' @field username 
#' @field password 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsernamePassword <- R6::R6Class(
  'UsernamePassword',
  public = list(
    `username` = NULL,
    `password` = NULL,
    initialize = function(`username`, `password`){
      if (!missing(`username`)) {
        stopifnot(is.character(`username`), length(`username`) == 1)
        self$`username` <- `username`
      }
      if (!missing(`password`)) {
        stopifnot(is.character(`password`), length(`password`) == 1)
        self$`password` <- `password`
      }
    },
    toJSON = function() {
      UsernamePasswordObject <- list()
      if (!is.null(self$`username`)) {
        UsernamePasswordObject[['username']] <- self$`username`
      }
      if (!is.null(self$`password`)) {
        UsernamePasswordObject[['password']] <- self$`password`
      }

      UsernamePasswordObject
    },
    fromJSON = function(UsernamePasswordJson) {
      UsernamePasswordObject <- jsonlite::fromJSON(UsernamePasswordJson)
      if (!is.null(UsernamePasswordObject$`username`)) {
        self$`username` <- UsernamePasswordObject$`username`
      }
      if (!is.null(UsernamePasswordObject$`password`)) {
        self$`password` <- UsernamePasswordObject$`password`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "username": %s,
           "password": %s
        }',
        self$`username`,
        self$`password`
      )
    },
    fromJSONString = function(UsernamePasswordJson) {
      UsernamePasswordObject <- jsonlite::fromJSON(UsernamePasswordJson)
      self$`username` <- UsernamePasswordObject$`username`
      self$`password` <- UsernamePasswordObject$`password`
    }
  )
)
