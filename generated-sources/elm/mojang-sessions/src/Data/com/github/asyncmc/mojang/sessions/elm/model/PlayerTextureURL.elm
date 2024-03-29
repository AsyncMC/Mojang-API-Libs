{-
   Mojang Session API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PlayerTextureURL exposing (PlayerTextureURL(..), decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Wraps the URL to the texture
-}
type alias PlayerTextureURL =
    { url : String
    }


decoder : Decoder PlayerTextureURL
decoder =
    Decode.succeed PlayerTextureURL
        |> required "url" Decode.string



encoder : PlayerTextureURL -> Encode.Value
encoder model =
    Encode.object
        [ ( "url", Encode.string model.url )

        ]


