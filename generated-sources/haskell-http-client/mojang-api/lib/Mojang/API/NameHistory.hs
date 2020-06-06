{-
   Mojang API

   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI Version: 3.0.1
   Mojang API API version: 2020-06-05
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Mojang.API.NameHistory
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Mojang.API.NameHistory where

import Mojang.Core
import Mojang.MimeTypes
import Mojang.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** NameHistory

-- *** findUniqueIdsByName

-- | @POST \/profiles\/minecraft@
-- 
-- Find the current UUID of multiple players at once
-- 
-- Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
-- 
findUniqueIdsByName 
  :: (Consumes FindUniqueIdsByName MimeJSON, MimeRender MimeJSON RequestBody)
  => RequestBody -- ^ "requestBody" -  Array with the player names
  -> MojangRequest FindUniqueIdsByName MimeJSON [CurrentPlayerIDs] MimeJSON
findUniqueIdsByName requestBody =
  _mkRequest "POST" ["/profiles/minecraft"]
    `setBodyParam` requestBody

data FindUniqueIdsByName 

-- | /Body Param/ "request_body" - Array with the player names
instance HasBodyParam FindUniqueIdsByName RequestBody 

-- | @application/json@
instance Consumes FindUniqueIdsByName MimeJSON

-- | @application/json@
instance Produces FindUniqueIdsByName MimeJSON


-- *** getNameHistory

-- | @GET \/user\/profiles\/{stripped_uuid}\/names@
-- 
-- Gets the full player's name history
-- 
getNameHistory 
  :: StrippedUuid -- ^ "strippedUuid" -  The player UUID without hyphens
  -> MojangRequest GetNameHistory MimeNoContent [NameChange] MimeJSON
getNameHistory (StrippedUuid strippedUuid) =
  _mkRequest "GET" ["/user/profiles/",toPath strippedUuid,"/names"]

data GetNameHistory  

-- | @application/json@
instance Produces GetNameHistory MimeJSON


-- *** getUniqueIdByName

-- | @GET \/users\/profiles\/minecraft\/{username}@
-- 
-- Find the UUID by name
-- 
-- Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
-- 
getUniqueIdByName 
  :: Username -- ^ "username" -  The username in a given time, or in present if \"at\" is not sent
  -> MojangRequest GetUniqueIdByName MimeNoContent CurrentPlayerIDs MimeJSON
getUniqueIdByName (Username username) =
  _mkRequest "GET" ["/users/profiles/minecraft/",toPath username]

data GetUniqueIdByName  

-- | /Optional Param/ "at" - Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
instance HasOptionalParam GetUniqueIdByName At where
  applyOptionalParam req (At xs) =
    req `setQuery` toQuery ("at", Just xs)

-- | @application/json@
instance Produces GetUniqueIdByName MimeJSON

