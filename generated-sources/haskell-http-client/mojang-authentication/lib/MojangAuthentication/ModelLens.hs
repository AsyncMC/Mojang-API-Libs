{-
   Mojang Authentication API

   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI Version: 3.0.1
   Mojang Authentication API API version: 2020-06-05
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : MojangAuthentication.Lens
-}

{-# LANGUAGE KindSignatures #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MojangAuthentication.ModelLens where

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Data, Typeable)
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.Time as TI

import Data.Text (Text)

import Prelude (($), (.),(<$>),(<*>),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

import MojangAuthentication.Model
import MojangAuthentication.Core


-- * AccessKeys

-- | 'accessKeysAccessToken' Lens
accessKeysAccessTokenL :: Lens_' AccessKeys (Text)
accessKeysAccessTokenL f AccessKeys{..} = (\accessKeysAccessToken -> AccessKeys { accessKeysAccessToken, ..} ) <$> f accessKeysAccessToken
{-# INLINE accessKeysAccessTokenL #-}

-- | 'accessKeysClientToken' Lens
accessKeysClientTokenL :: Lens_' AccessKeys (Maybe Text)
accessKeysClientTokenL f AccessKeys{..} = (\accessKeysClientToken -> AccessKeys { accessKeysClientToken, ..} ) <$> f accessKeysClientToken
{-# INLINE accessKeysClientTokenL #-}



-- * Agent

-- | 'agentName' Lens
agentNameL :: Lens_' Agent (Maybe E'Name)
agentNameL f Agent{..} = (\agentName -> Agent { agentName, ..} ) <$> f agentName
{-# INLINE agentNameL #-}

-- | 'agentVersion' Lens
agentVersionL :: Lens_' Agent (Maybe Int)
agentVersionL f Agent{..} = (\agentVersion -> Agent { agentVersion, ..} ) <$> f agentVersion
{-# INLINE agentVersionL #-}



-- * Authentication

-- | 'authenticationAccessToken' Lens
authenticationAccessTokenL :: Lens_' Authentication (Text)
authenticationAccessTokenL f Authentication{..} = (\authenticationAccessToken -> Authentication { authenticationAccessToken, ..} ) <$> f authenticationAccessToken
{-# INLINE authenticationAccessTokenL #-}

-- | 'authenticationClientToken' Lens
authenticationClientTokenL :: Lens_' Authentication (Maybe Text)
authenticationClientTokenL f Authentication{..} = (\authenticationClientToken -> Authentication { authenticationClientToken, ..} ) <$> f authenticationClientToken
{-# INLINE authenticationClientTokenL #-}



-- * AuthenticationRequest

-- | 'authenticationRequestUsername' Lens
authenticationRequestUsernameL :: Lens_' AuthenticationRequest (Text)
authenticationRequestUsernameL f AuthenticationRequest{..} = (\authenticationRequestUsername -> AuthenticationRequest { authenticationRequestUsername, ..} ) <$> f authenticationRequestUsername
{-# INLINE authenticationRequestUsernameL #-}

-- | 'authenticationRequestPassword' Lens
authenticationRequestPasswordL :: Lens_' AuthenticationRequest (Text)
authenticationRequestPasswordL f AuthenticationRequest{..} = (\authenticationRequestPassword -> AuthenticationRequest { authenticationRequestPassword, ..} ) <$> f authenticationRequestPassword
{-# INLINE authenticationRequestPasswordL #-}



-- * Error

-- | 'errorError' Lens
errorErrorL :: Lens_' Error (Maybe Text)
errorErrorL f Error{..} = (\errorError -> Error { errorError, ..} ) <$> f errorError
{-# INLINE errorErrorL #-}

-- | 'errorErrorMessage' Lens
errorErrorMessageL :: Lens_' Error (Maybe Text)
errorErrorMessageL f Error{..} = (\errorErrorMessage -> Error { errorErrorMessage, ..} ) <$> f errorErrorMessage
{-# INLINE errorErrorMessageL #-}



-- * GameProfile

-- | 'gameProfileAgent' Lens
gameProfileAgentL :: Lens_' GameProfile (Maybe Text)
gameProfileAgentL f GameProfile{..} = (\gameProfileAgent -> GameProfile { gameProfileAgent, ..} ) <$> f gameProfileAgent
{-# INLINE gameProfileAgentL #-}

-- | 'gameProfileId' Lens
gameProfileIdL :: Lens_' GameProfile (Maybe Text)
gameProfileIdL f GameProfile{..} = (\gameProfileId -> GameProfile { gameProfileId, ..} ) <$> f gameProfileId
{-# INLINE gameProfileIdL #-}

-- | 'gameProfileName' Lens
gameProfileNameL :: Lens_' GameProfile (Maybe Text)
gameProfileNameL f GameProfile{..} = (\gameProfileName -> GameProfile { gameProfileName, ..} ) <$> f gameProfileName
{-# INLINE gameProfileNameL #-}

-- | 'gameProfileUserId' Lens
gameProfileUserIdL :: Lens_' GameProfile (Maybe Text)
gameProfileUserIdL f GameProfile{..} = (\gameProfileUserId -> GameProfile { gameProfileUserId, ..} ) <$> f gameProfileUserId
{-# INLINE gameProfileUserIdL #-}

-- | 'gameProfileCreatedAt' Lens
gameProfileCreatedAtL :: Lens_' GameProfile (Maybe Integer)
gameProfileCreatedAtL f GameProfile{..} = (\gameProfileCreatedAt -> GameProfile { gameProfileCreatedAt, ..} ) <$> f gameProfileCreatedAt
{-# INLINE gameProfileCreatedAtL #-}

-- | 'gameProfileLegacyProfile' Lens
gameProfileLegacyProfileL :: Lens_' GameProfile (Maybe Bool)
gameProfileLegacyProfileL f GameProfile{..} = (\gameProfileLegacyProfile -> GameProfile { gameProfileLegacyProfile, ..} ) <$> f gameProfileLegacyProfile
{-# INLINE gameProfileLegacyProfileL #-}

-- | 'gameProfileSuspended' Lens
gameProfileSuspendedL :: Lens_' GameProfile (Maybe Bool)
gameProfileSuspendedL f GameProfile{..} = (\gameProfileSuspended -> GameProfile { gameProfileSuspended, ..} ) <$> f gameProfileSuspended
{-# INLINE gameProfileSuspendedL #-}

-- | 'gameProfilePaid' Lens
gameProfilePaidL :: Lens_' GameProfile (Maybe Bool)
gameProfilePaidL f GameProfile{..} = (\gameProfilePaid -> GameProfile { gameProfilePaid, ..} ) <$> f gameProfilePaid
{-# INLINE gameProfilePaidL #-}

-- | 'gameProfileMigrated' Lens
gameProfileMigratedL :: Lens_' GameProfile (Maybe Bool)
gameProfileMigratedL f GameProfile{..} = (\gameProfileMigrated -> GameProfile { gameProfileMigrated, ..} ) <$> f gameProfileMigrated
{-# INLINE gameProfileMigratedL #-}

-- | 'gameProfileLegacy' Lens
gameProfileLegacyL :: Lens_' GameProfile (Maybe Bool)
gameProfileLegacyL f GameProfile{..} = (\gameProfileLegacy -> GameProfile { gameProfileLegacy, ..} ) <$> f gameProfileLegacy
{-# INLINE gameProfileLegacyL #-}



-- * GameProfileProperty

-- | 'gameProfilePropertyName' Lens
gameProfilePropertyNameL :: Lens_' GameProfileProperty (Maybe Text)
gameProfilePropertyNameL f GameProfileProperty{..} = (\gameProfilePropertyName -> GameProfileProperty { gameProfilePropertyName, ..} ) <$> f gameProfilePropertyName
{-# INLINE gameProfilePropertyNameL #-}

-- | 'gameProfilePropertyValue' Lens
gameProfilePropertyValueL :: Lens_' GameProfileProperty (Maybe Text)
gameProfilePropertyValueL f GameProfileProperty{..} = (\gameProfilePropertyValue -> GameProfileProperty { gameProfilePropertyValue, ..} ) <$> f gameProfilePropertyValue
{-# INLINE gameProfilePropertyValueL #-}



-- * PrivateUserData

-- | 'privateUserDataId' Lens
privateUserDataIdL :: Lens_' PrivateUserData (Maybe Text)
privateUserDataIdL f PrivateUserData{..} = (\privateUserDataId -> PrivateUserData { privateUserDataId, ..} ) <$> f privateUserDataId
{-# INLINE privateUserDataIdL #-}

-- | 'privateUserDataProperties' Lens
privateUserDataPropertiesL :: Lens_' PrivateUserData (Maybe [GameProfileProperty])
privateUserDataPropertiesL f PrivateUserData{..} = (\privateUserDataProperties -> PrivateUserData { privateUserDataProperties, ..} ) <$> f privateUserDataProperties
{-# INLINE privateUserDataPropertiesL #-}



-- * ProfileId

-- | 'profileIdId' Lens
profileIdIdL :: Lens_' ProfileId (Text)
profileIdIdL f ProfileId{..} = (\profileIdId -> ProfileId { profileIdId, ..} ) <$> f profileIdId
{-# INLINE profileIdIdL #-}

-- | 'profileIdName' Lens
profileIdNameL :: Lens_' ProfileId (Text)
profileIdNameL f ProfileId{..} = (\profileIdName -> ProfileId { profileIdName, ..} ) <$> f profileIdName
{-# INLINE profileIdNameL #-}



-- * ReducedUserData

-- | 'reducedUserDataId' Lens
reducedUserDataIdL :: Lens_' ReducedUserData (Maybe Text)
reducedUserDataIdL f ReducedUserData{..} = (\reducedUserDataId -> ReducedUserData { reducedUserDataId, ..} ) <$> f reducedUserDataId
{-# INLINE reducedUserDataIdL #-}

-- | 'reducedUserDataProperties' Lens
reducedUserDataPropertiesL :: Lens_' ReducedUserData (Maybe [GameProfileProperty])
reducedUserDataPropertiesL f ReducedUserData{..} = (\reducedUserDataProperties -> ReducedUserData { reducedUserDataProperties, ..} ) <$> f reducedUserDataProperties
{-# INLINE reducedUserDataPropertiesL #-}



-- * RefreshRequest

-- | 'refreshRequestAccessToken' Lens
refreshRequestAccessTokenL :: Lens_' RefreshRequest (Text)
refreshRequestAccessTokenL f RefreshRequest{..} = (\refreshRequestAccessToken -> RefreshRequest { refreshRequestAccessToken, ..} ) <$> f refreshRequestAccessToken
{-# INLINE refreshRequestAccessTokenL #-}

-- | 'refreshRequestClientToken' Lens
refreshRequestClientTokenL :: Lens_' RefreshRequest (Maybe Text)
refreshRequestClientTokenL f RefreshRequest{..} = (\refreshRequestClientToken -> RefreshRequest { refreshRequestClientToken, ..} ) <$> f refreshRequestClientToken
{-# INLINE refreshRequestClientTokenL #-}



-- * RefreshResponse

-- | 'refreshResponseAccessToken' Lens
refreshResponseAccessTokenL :: Lens_' RefreshResponse (Text)
refreshResponseAccessTokenL f RefreshResponse{..} = (\refreshResponseAccessToken -> RefreshResponse { refreshResponseAccessToken, ..} ) <$> f refreshResponseAccessToken
{-# INLINE refreshResponseAccessTokenL #-}

-- | 'refreshResponseClientToken' Lens
refreshResponseClientTokenL :: Lens_' RefreshResponse (Maybe Text)
refreshResponseClientTokenL f RefreshResponse{..} = (\refreshResponseClientToken -> RefreshResponse { refreshResponseClientToken, ..} ) <$> f refreshResponseClientToken
{-# INLINE refreshResponseClientTokenL #-}



-- * UsernamePassword

-- | 'usernamePasswordUsername' Lens
usernamePasswordUsernameL :: Lens_' UsernamePassword (Text)
usernamePasswordUsernameL f UsernamePassword{..} = (\usernamePasswordUsername -> UsernamePassword { usernamePasswordUsername, ..} ) <$> f usernamePasswordUsername
{-# INLINE usernamePasswordUsernameL #-}

-- | 'usernamePasswordPassword' Lens
usernamePasswordPasswordL :: Lens_' UsernamePassword (Text)
usernamePasswordPasswordL f UsernamePassword{..} = (\usernamePasswordPassword -> UsernamePassword { usernamePasswordPassword, ..} ) <$> f usernamePasswordPassword
{-# INLINE usernamePasswordPasswordL #-}


