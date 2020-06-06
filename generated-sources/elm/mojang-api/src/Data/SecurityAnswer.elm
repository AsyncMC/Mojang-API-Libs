{-
   Mojang API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.SecurityAnswer exposing (SecurityAnswer, decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| A security question answer given by the player using the id given by Mojang
-}
type alias SecurityAnswer =
    { id : Int
    }


decoder : Decoder SecurityAnswer
decoder =
    Decode.succeed SecurityAnswer
        |> required "id" Decode.int



encoder : SecurityAnswer -> Encode.Value
encoder model =
    Encode.object
        [ ( "id", Encode.int model.id )

        ]


