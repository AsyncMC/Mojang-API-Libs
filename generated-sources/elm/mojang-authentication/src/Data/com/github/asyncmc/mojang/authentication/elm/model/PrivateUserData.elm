{-
   Mojang Authentication API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PrivateUserData exposing (PrivateUserData, decoder, encoder)

import Data.GameProfileProperty as GameProfileProperty exposing (GameProfileProperty)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias PrivateUserData =
    { id : Maybe (String)
    , properties : Maybe ((List GameProfileProperty))
    }


decoder : Decoder PrivateUserData
decoder =
    Decode.succeed PrivateUserData
        |> optional "id" (Decode.nullable Decode.string) Nothing
        |> optional "properties" (Decode.nullable (Decode.list GameProfileProperty.decoder)) Nothing



encoder : PrivateUserData -> Encode.Value
encoder model =
    Encode.object
        [ ( "id", Maybe.withDefault Encode.null (Maybe.map Encode.string model.id) )
        , ( "properties", Maybe.withDefault Encode.null (Maybe.map (Encode.list GameProfileProperty.encoder) model.properties) )

        ]


