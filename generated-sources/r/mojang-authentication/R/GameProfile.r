# Mojang Authentication API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' GameProfile Class
#'
#' @field agent 
#' @field id 
#' @field name 
#' @field userId 
#' @field createdAt 
#' @field legacyProfile 
#' @field suspended 
#' @field paid 
#' @field migrated 
#' @field legacy 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GameProfile <- R6::R6Class(
  'GameProfile',
  public = list(
    `agent` = NULL,
    `id` = NULL,
    `name` = NULL,
    `userId` = NULL,
    `createdAt` = NULL,
    `legacyProfile` = NULL,
    `suspended` = NULL,
    `paid` = NULL,
    `migrated` = NULL,
    `legacy` = NULL,
    initialize = function(`agent`, `id`, `name`, `userId`, `createdAt`, `legacyProfile`, `suspended`, `paid`, `migrated`, `legacy`){
      if (!missing(`agent`)) {
        stopifnot(is.character(`agent`), length(`agent`) == 1)
        self$`agent` <- `agent`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`userId`)) {
        stopifnot(R6::is.R6(`userId`))
        self$`userId` <- `userId`
      }
      if (!missing(`createdAt`)) {
        stopifnot(is.numeric(`createdAt`), length(`createdAt`) == 1)
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`legacyProfile`)) {
        self$`legacyProfile` <- `legacyProfile`
      }
      if (!missing(`suspended`)) {
        self$`suspended` <- `suspended`
      }
      if (!missing(`paid`)) {
        self$`paid` <- `paid`
      }
      if (!missing(`migrated`)) {
        self$`migrated` <- `migrated`
      }
      if (!missing(`legacy`)) {
        self$`legacy` <- `legacy`
      }
    },
    toJSON = function() {
      GameProfileObject <- list()
      if (!is.null(self$`agent`)) {
        GameProfileObject[['agent']] <- self$`agent`
      }
      if (!is.null(self$`id`)) {
        GameProfileObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        GameProfileObject[['name']] <- self$`name`
      }
      if (!is.null(self$`userId`)) {
        GameProfileObject[['userId']] <- self$`userId`$toJSON()
      }
      if (!is.null(self$`createdAt`)) {
        GameProfileObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`legacyProfile`)) {
        GameProfileObject[['legacyProfile']] <- self$`legacyProfile`
      }
      if (!is.null(self$`suspended`)) {
        GameProfileObject[['suspended']] <- self$`suspended`
      }
      if (!is.null(self$`paid`)) {
        GameProfileObject[['paid']] <- self$`paid`
      }
      if (!is.null(self$`migrated`)) {
        GameProfileObject[['migrated']] <- self$`migrated`
      }
      if (!is.null(self$`legacy`)) {
        GameProfileObject[['legacy']] <- self$`legacy`
      }

      GameProfileObject
    },
    fromJSON = function(GameProfileJson) {
      GameProfileObject <- jsonlite::fromJSON(GameProfileJson)
      if (!is.null(GameProfileObject$`agent`)) {
        self$`agent` <- GameProfileObject$`agent`
      }
      if (!is.null(GameProfileObject$`id`)) {
        self$`id` <- GameProfileObject$`id`
      }
      if (!is.null(GameProfileObject$`name`)) {
        self$`name` <- GameProfileObject$`name`
      }
      if (!is.null(GameProfileObject$`userId`)) {
        userIdObject <- data.frame$new()
        userIdObject$fromJSON(jsonlite::toJSON(GameProfileObject$userId, auto_unbox = TRUE))
        self$`userId` <- userIdObject
      }
      if (!is.null(GameProfileObject$`createdAt`)) {
        self$`createdAt` <- GameProfileObject$`createdAt`
      }
      if (!is.null(GameProfileObject$`legacyProfile`)) {
        self$`legacyProfile` <- GameProfileObject$`legacyProfile`
      }
      if (!is.null(GameProfileObject$`suspended`)) {
        self$`suspended` <- GameProfileObject$`suspended`
      }
      if (!is.null(GameProfileObject$`paid`)) {
        self$`paid` <- GameProfileObject$`paid`
      }
      if (!is.null(GameProfileObject$`migrated`)) {
        self$`migrated` <- GameProfileObject$`migrated`
      }
      if (!is.null(GameProfileObject$`legacy`)) {
        self$`legacy` <- GameProfileObject$`legacy`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "agent": %s,
           "id": %s,
           "name": %s,
           "userId": %s,
           "createdAt": %d,
           "legacyProfile": %s,
           "suspended": %s,
           "paid": %s,
           "migrated": %s,
           "legacy": %s
        }',
        self$`agent`,
        self$`id`,
        self$`name`,
        self$`userId`$toJSON(),
        self$`createdAt`,
        self$`legacyProfile`,
        self$`suspended`,
        self$`paid`,
        self$`migrated`,
        self$`legacy`
      )
    },
    fromJSONString = function(GameProfileJson) {
      GameProfileObject <- jsonlite::fromJSON(GameProfileJson)
      self$`agent` <- GameProfileObject$`agent`
      self$`id` <- GameProfileObject$`id`
      self$`name` <- GameProfileObject$`name`
      data.frameObject <- data.frame$new()
      self$`userId` <- data.frameObject$fromJSON(jsonlite::toJSON(GameProfileObject$userId, auto_unbox = TRUE))
      self$`createdAt` <- GameProfileObject$`createdAt`
      self$`legacyProfile` <- GameProfileObject$`legacyProfile`
      self$`suspended` <- GameProfileObject$`suspended`
      self$`paid` <- GameProfileObject$`paid`
      self$`migrated` <- GameProfileObject$`migrated`
      self$`legacy` <- GameProfileObject$`legacy`
    }
  )
)
