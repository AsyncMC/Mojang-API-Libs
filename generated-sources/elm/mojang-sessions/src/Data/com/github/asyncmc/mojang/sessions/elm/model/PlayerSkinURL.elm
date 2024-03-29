{-
   Mojang Session API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PlayerSkinURL exposing (PlayerSkinURL, decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Wraps the URL to the texture and configures the player's model
-}
type alias PlayerSkinURL =
    { url : String
    }


decoder : Decoder PlayerSkinURL
decoder =
    Decode.succeed PlayerSkinURL
        |> required "url" Decode.string



encoder : PlayerSkinURL -> Encode.Value
encoder model =
    Encode.object
        [ ( "url", Encode.string model.url )

        ]


