{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Request.SecurityQuestionAnswer exposing (checkSecurityStatus, listPendingSecurityQuestions, sendSecurityQuestionAnswers)

import Data.SecurityChallenge as SecurityChallenge exposing (SecurityChallenge)
import Data.Error as Error exposing (Error)
import Data.SecurityAnswer as SecurityAnswer exposing (SecurityAnswer)
import Dict
import Http
import Json.Decode as Decode


basePath : String
basePath =
    "https://api.mojang.com"


checkSecurityStatus : Http.Request ()
checkSecurityStatus =
    { method = "GET"
    , url = basePath ++ "/user/security/location"
    , headers = []
    , body = Http.emptyBody
    , expect = Http.expectStringResponse (\_ -> Ok ())
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


listPendingSecurityQuestions : Http.Request (List SecurityChallenge)
listPendingSecurityQuestions =
    { method = "GET"
    , url = basePath ++ "/user/security/challenges"
    , headers = []
    , body = Http.emptyBody
    , expect = Http.expectJson (Decode.list SecurityChallenge.decoder)
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


sendSecurityQuestionAnswers : SecurityAnswer -> Http.Request ()
sendSecurityQuestionAnswers model =
    { method = "POST"
    , url = basePath ++ "/user/security/location"
    , headers = []
    , body = Http.jsonBody <| SecurityAnswer.encoder model
    , expect = Http.expectStringResponse (\_ -> Ok ())
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request