# Mojang API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech

#' @title NameHistory operations
#' @description openapi.NameHistory
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' find_unique_ids_by_name Find the current UUID of multiple players at once
#'
#'
#' get_name_history Gets the full player&#39;s name history
#'
#'
#' get_unique_id_by_name Find the UUID by name
#'
#' }
#'
#' @export
NameHistoryApi <- R6::R6Class(
  'NameHistoryApi',
  public = list(
    userAgent = "OpenAPI-Generator/1.0.0/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    find_unique_ids_by_name = function(request_body, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`request_body`)) {
        body <- `request_body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/profiles/minecraft"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- CurrentPlayerIDs$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    get_name_history = function(stripped_uuid, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/user/profiles/{stripped_uuid}/names"
      if (!missing(`stripped_uuid`)) {
        urlPath <- gsub(paste0("\\{", "stripped_uuid", "\\}"), `stripped_uuid`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- NameChange$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    get_unique_id_by_name = function(username, at, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`at`)) {
        queryParams['at'] <- at
      }

      urlPath <- "/users/profiles/minecraft/{username}"
      if (!missing(`username`)) {
        urlPath <- gsub(paste0("\\{", "username", "\\}"), `username`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- CurrentPlayerIDs$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)
