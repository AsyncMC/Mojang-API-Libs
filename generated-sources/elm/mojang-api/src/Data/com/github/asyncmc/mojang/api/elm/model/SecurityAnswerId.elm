{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.SecurityAnswerId exposing (SecurityAnswerId(..), decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| A security question answer id given by Mojang
-}
type alias SecurityAnswerId =
    { id : Int
    }


decoder : Decoder SecurityAnswerId
decoder =
    Decode.succeed SecurityAnswerId
        |> required "id" Decode.int



encoder : SecurityAnswerId -> Encode.Value
encoder model =
    Encode.object
        [ ( "id", Encode.int model.id )

        ]

