{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.Error exposing (Error, decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| This is returned when the request fails
-}
type alias Error =
    { error : Maybe (String)
    , errorMessage : Maybe (String)
    }


decoder : Decoder Error
decoder =
    Decode.succeed Error
        |> optional "error" (Decode.nullable Decode.string) Nothing
        |> optional "errorMessage" (Decode.nullable Decode.string) Nothing



encoder : Error -> Encode.Value
encoder model =
    Encode.object
        [ ( "error", Maybe.withDefault Encode.null (Maybe.map Encode.string model.error) )
        , ( "errorMessage", Maybe.withDefault Encode.null (Maybe.map Encode.string model.errorMessage) )

        ]


