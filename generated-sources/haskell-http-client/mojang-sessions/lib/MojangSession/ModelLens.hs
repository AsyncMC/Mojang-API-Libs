{-
   Mojang Session API

   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI Version: 3.0.1
   Mojang Session API API version: 2020-06-05
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : MojangSession.Lens
-}

{-# LANGUAGE KindSignatures #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MojangSession.ModelLens where

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Data, Typeable)
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.Time as TI

import Data.Text (Text)

import Prelude (($), (.),(<$>),(<*>),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

import MojangSession.Model
import MojangSession.Core


-- * PlayerProfile

-- | 'playerProfileId' Lens
playerProfileIdL :: Lens_' PlayerProfile (Text)
playerProfileIdL f PlayerProfile{..} = (\playerProfileId -> PlayerProfile { playerProfileId, ..} ) <$> f playerProfileId
{-# INLINE playerProfileIdL #-}

-- | 'playerProfileName' Lens
playerProfileNameL :: Lens_' PlayerProfile (Text)
playerProfileNameL f PlayerProfile{..} = (\playerProfileName -> PlayerProfile { playerProfileName, ..} ) <$> f playerProfileName
{-# INLINE playerProfileNameL #-}

-- | 'playerProfileLegacy' Lens
playerProfileLegacyL :: Lens_' PlayerProfile (Maybe Bool)
playerProfileLegacyL f PlayerProfile{..} = (\playerProfileLegacy -> PlayerProfile { playerProfileLegacy, ..} ) <$> f playerProfileLegacy
{-# INLINE playerProfileLegacyL #-}

-- | 'playerProfileProperties' Lens
playerProfilePropertiesL :: Lens_' PlayerProfile ([PlayerProfileProperty])
playerProfilePropertiesL f PlayerProfile{..} = (\playerProfileProperties -> PlayerProfile { playerProfileProperties, ..} ) <$> f playerProfileProperties
{-# INLINE playerProfilePropertiesL #-}



-- * PlayerProfileProperty

-- | 'playerProfilePropertyName' Lens
playerProfilePropertyNameL :: Lens_' PlayerProfileProperty (Text)
playerProfilePropertyNameL f PlayerProfileProperty{..} = (\playerProfilePropertyName -> PlayerProfileProperty { playerProfilePropertyName, ..} ) <$> f playerProfilePropertyName
{-# INLINE playerProfilePropertyNameL #-}

-- | 'playerProfilePropertyValue' Lens
playerProfilePropertyValueL :: Lens_' PlayerProfileProperty (ByteArray)
playerProfilePropertyValueL f PlayerProfileProperty{..} = (\playerProfilePropertyValue -> PlayerProfileProperty { playerProfilePropertyValue, ..} ) <$> f playerProfilePropertyValue
{-# INLINE playerProfilePropertyValueL #-}

-- | 'playerProfilePropertySignature' Lens
playerProfilePropertySignatureL :: Lens_' PlayerProfileProperty (Maybe ByteArray)
playerProfilePropertySignatureL f PlayerProfileProperty{..} = (\playerProfilePropertySignature -> PlayerProfileProperty { playerProfilePropertySignature, ..} ) <$> f playerProfilePropertySignature
{-# INLINE playerProfilePropertySignatureL #-}



-- * PlayerProfileTexturePropertyValue

-- | 'playerProfileTexturePropertyValueTimestamp' Lens
playerProfileTexturePropertyValueTimestampL :: Lens_' PlayerProfileTexturePropertyValue (Integer)
playerProfileTexturePropertyValueTimestampL f PlayerProfileTexturePropertyValue{..} = (\playerProfileTexturePropertyValueTimestamp -> PlayerProfileTexturePropertyValue { playerProfileTexturePropertyValueTimestamp, ..} ) <$> f playerProfileTexturePropertyValueTimestamp
{-# INLINE playerProfileTexturePropertyValueTimestampL #-}

-- | 'playerProfileTexturePropertyValueProfileId' Lens
playerProfileTexturePropertyValueProfileIdL :: Lens_' PlayerProfileTexturePropertyValue (Text)
playerProfileTexturePropertyValueProfileIdL f PlayerProfileTexturePropertyValue{..} = (\playerProfileTexturePropertyValueProfileId -> PlayerProfileTexturePropertyValue { playerProfileTexturePropertyValueProfileId, ..} ) <$> f playerProfileTexturePropertyValueProfileId
{-# INLINE playerProfileTexturePropertyValueProfileIdL #-}

-- | 'playerProfileTexturePropertyValueProfileName' Lens
playerProfileTexturePropertyValueProfileNameL :: Lens_' PlayerProfileTexturePropertyValue (Text)
playerProfileTexturePropertyValueProfileNameL f PlayerProfileTexturePropertyValue{..} = (\playerProfileTexturePropertyValueProfileName -> PlayerProfileTexturePropertyValue { playerProfileTexturePropertyValueProfileName, ..} ) <$> f playerProfileTexturePropertyValueProfileName
{-# INLINE playerProfileTexturePropertyValueProfileNameL #-}

-- | 'playerProfileTexturePropertyValueSignatureRequired' Lens
playerProfileTexturePropertyValueSignatureRequiredL :: Lens_' PlayerProfileTexturePropertyValue (Maybe Bool)
playerProfileTexturePropertyValueSignatureRequiredL f PlayerProfileTexturePropertyValue{..} = (\playerProfileTexturePropertyValueSignatureRequired -> PlayerProfileTexturePropertyValue { playerProfileTexturePropertyValueSignatureRequired, ..} ) <$> f playerProfileTexturePropertyValueSignatureRequired
{-# INLINE playerProfileTexturePropertyValueSignatureRequiredL #-}

-- | 'playerProfileTexturePropertyValueTextures' Lens
playerProfileTexturePropertyValueTexturesL :: Lens_' PlayerProfileTexturePropertyValue (Maybe PlayerTexture)
playerProfileTexturePropertyValueTexturesL f PlayerProfileTexturePropertyValue{..} = (\playerProfileTexturePropertyValueTextures -> PlayerProfileTexturePropertyValue { playerProfileTexturePropertyValueTextures, ..} ) <$> f playerProfileTexturePropertyValueTextures
{-# INLINE playerProfileTexturePropertyValueTexturesL #-}



-- * PlayerSkinMetadata

-- | 'playerSkinMetadataModel' Lens
playerSkinMetadataModelL :: Lens_' PlayerSkinMetadata (Maybe E'Model)
playerSkinMetadataModelL f PlayerSkinMetadata{..} = (\playerSkinMetadataModel -> PlayerSkinMetadata { playerSkinMetadataModel, ..} ) <$> f playerSkinMetadataModel
{-# INLINE playerSkinMetadataModelL #-}



-- * PlayerSkinURL

-- | 'playerSkinURLUrl' Lens
playerSkinURLUrlL :: Lens_' PlayerSkinURL (Text)
playerSkinURLUrlL f PlayerSkinURL{..} = (\playerSkinURLUrl -> PlayerSkinURL { playerSkinURLUrl, ..} ) <$> f playerSkinURLUrl
{-# INLINE playerSkinURLUrlL #-}



-- * PlayerTexture

-- | 'playerTextureSkin' Lens
playerTextureSkinL :: Lens_' PlayerTexture (Maybe PlayerSkinURL)
playerTextureSkinL f PlayerTexture{..} = (\playerTextureSkin -> PlayerTexture { playerTextureSkin, ..} ) <$> f playerTextureSkin
{-# INLINE playerTextureSkinL #-}

-- | 'playerTextureCape' Lens
playerTextureCapeL :: Lens_' PlayerTexture (Maybe PlayerTextureURL)
playerTextureCapeL f PlayerTexture{..} = (\playerTextureCape -> PlayerTexture { playerTextureCape, ..} ) <$> f playerTextureCape
{-# INLINE playerTextureCapeL #-}



-- * PlayerTextureURL

-- | 'playerTextureURLUrl' Lens
playerTextureURLUrlL :: Lens_' PlayerTextureURL (Text)
playerTextureURLUrlL f PlayerTextureURL{..} = (\playerTextureURLUrl -> PlayerTextureURL { playerTextureURLUrl, ..} ) <$> f playerTextureURLUrl
{-# INLINE playerTextureURLUrlL #-}



-- * SessionApiError

-- | 'sessionApiErrorError' Lens
sessionApiErrorErrorL :: Lens_' SessionApiError (Maybe Text)
sessionApiErrorErrorL f SessionApiError{..} = (\sessionApiErrorError -> SessionApiError { sessionApiErrorError, ..} ) <$> f sessionApiErrorError
{-# INLINE sessionApiErrorErrorL #-}

-- | 'sessionApiErrorPath' Lens
sessionApiErrorPathL :: Lens_' SessionApiError (Maybe Text)
sessionApiErrorPathL f SessionApiError{..} = (\sessionApiErrorPath -> SessionApiError { sessionApiErrorPath, ..} ) <$> f sessionApiErrorPath
{-# INLINE sessionApiErrorPathL #-}


