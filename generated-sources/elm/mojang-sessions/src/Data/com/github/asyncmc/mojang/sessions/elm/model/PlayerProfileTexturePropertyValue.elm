{-
   Mojang Session API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PlayerProfileTexturePropertyValue exposing (PlayerProfileTexturePropertyValue, decoder, encoder)

import Data.PlayerTexture as PlayerTexture exposing (PlayerTexture)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| This is obtained by decoding the \"textures\" property
-}
type alias PlayerProfileTexturePropertyValue =
    { timestamp : Int
    , profileId : String
    , profileName : String
    , signatureRequired : Maybe (Bool)
    , textures : Maybe (PlayerTexture)
    }


decoder : Decoder PlayerProfileTexturePropertyValue
decoder =
    Decode.succeed PlayerProfileTexturePropertyValue
        |> required "timestamp" Decode.int
        |> required "profileId" Decode.string
        |> required "profileName" Decode.string
        |> optional "signatureRequired" (Decode.nullable Decode.bool) (Just False)
        |> optional "textures" (Decode.nullable PlayerTexture.decoder) Nothing



encoder : PlayerProfileTexturePropertyValue -> Encode.Value
encoder model =
    Encode.object
        [ ( "timestamp", Encode.int model.timestamp )
        , ( "profileId", Encode.string model.profileId )
        , ( "profileName", Encode.string model.profileName )
        , ( "signatureRequired", Maybe.withDefault Encode.null (Maybe.map Encode.bool model.signatureRequired) )
        , ( "textures", Maybe.withDefault Encode.null (Maybe.map PlayerTexture.encoder model.textures) )

        ]

