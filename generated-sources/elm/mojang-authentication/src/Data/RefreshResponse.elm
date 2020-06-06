{-
   Mojang Authentication API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.RefreshResponse exposing (RefreshResponse, decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias RefreshResponse =
    { accessToken : String
    , clientToken : Maybe (String)
    }


decoder : Decoder RefreshResponse
decoder =
    Decode.succeed RefreshResponse
        |> required "accessToken" Decode.string
        |> optional "clientToken" (Decode.nullable Decode.string) Nothing



encoder : RefreshResponse -> Encode.Value
encoder model =
    Encode.object
        [ ( "accessToken", Encode.string model.accessToken )
        , ( "clientToken", Maybe.withDefault Encode.null (Maybe.map Encode.string model.clientToken) )

        ]


