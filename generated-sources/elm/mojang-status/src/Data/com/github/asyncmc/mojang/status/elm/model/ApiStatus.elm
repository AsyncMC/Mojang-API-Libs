{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.ApiStatus exposing (ApiStatus(..), decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
-}
type ApiStatus
    = Green
    | Yellow
    | Red



decoder : Decoder ApiStatus
decoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "green" ->
                        Decode.succeed Green

                    "yellow" ->
                        Decode.succeed Yellow

                    "red" ->
                        Decode.succeed Red

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encoder : ApiStatus -> Encode.Value
encoder model =
    case model of
        Green ->
            Encode.string "green"

        Yellow ->
            Encode.string "yellow"

        Red ->
            Encode.string "red"


