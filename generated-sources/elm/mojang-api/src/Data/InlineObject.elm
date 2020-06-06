{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.InlineObject exposing (InlineObject, decoder, encoder)

import Data.SkinModel as SkinModel exposing (SkinModel)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias InlineObject =
    { model : Maybe (SkinModel)
    , file : String
    }


decoder : Decoder InlineObject
decoder =
    Decode.succeed InlineObject
        |> optional "model" (Decode.nullable SkinModel.decoder) Nothing
        |> required "file" Decode.string



encoder : InlineObject -> Encode.Value
encoder model =
    Encode.object
        [ ( "model", Maybe.withDefault Encode.null (Maybe.map SkinModel.encoder model.model) )
        , ( "file", Encode.string model.file )

        ]


