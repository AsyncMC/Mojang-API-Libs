{-
   Mojang Authentication API
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI spec version: 2020-06-05

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.AuthenticationRequest exposing (AuthenticationRequest, decoder, encoder)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
-}
type alias AuthenticationRequest =
    { username : String
    , password : String
    }


decoder : Decoder AuthenticationRequest
decoder =
    Decode.succeed AuthenticationRequest
        |> required "username" Decode.string
        |> required "password" Decode.string



encoder : AuthenticationRequest -> Encode.Value
encoder model =
    Encode.object
        [ ( "username", Encode.string model.username )
        , ( "password", Encode.string model.password )

        ]


