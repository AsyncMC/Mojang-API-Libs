{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.SkinModel exposing (SkinModel(..), decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
-}
type SkinModel
    = UnknownEnumVariableName
    | Slim



decoder : Decoder SkinModel
decoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "" ->
                        Decode.succeed UnknownEnumVariableName

                    "slim" ->
                        Decode.succeed Slim

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encoder : SkinModel -> Encode.Value
encoder model =
    case model of
        UnknownEnumVariableName ->
            Encode.string ""

        Slim ->
            Encode.string "slim"

