{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Request.Miscellaneous exposing (getOrdersStatistics)

import Data.OrderStatisticsResponse as OrderStatisticsResponse exposing (OrderStatisticsResponse)
import Data.OrderStatisticsRequest as OrderStatisticsRequest exposing (OrderStatisticsRequest)
import Dict
import Http
import Json.Decode as Decode


basePath : String
basePath =
    "https://api.mojang.com"


getOrdersStatistics : OrderStatisticsRequest -> Http.Request OrderStatisticsResponse
getOrdersStatistics model =
    { method = "POST"
    , url = basePath ++ "/orders/statistics"
    , headers = []
    , body = Http.jsonBody <| OrderStatisticsRequest.encoder model
    , expect = Http.expectJson OrderStatisticsResponse.decoder
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request
