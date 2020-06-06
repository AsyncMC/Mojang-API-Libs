{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import MojangAuthentication.Model
import MojangAuthentication.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

-- * Models
 
instance Arbitrary AccessKeys where
  arbitrary =
    AccessKeys
      <$> arbitrary -- accessKeysAccessToken :: Text
      <*> arbitrary -- accessKeysClientToken :: Maybe Text
    
instance Arbitrary Agent where
  arbitrary =
    Agent
      <$> arbitrary -- agentName :: Maybe Text
      <*> arbitrary -- agentVersion :: Maybe Int
    
instance Arbitrary Authentication where
  arbitrary =
    Authentication
      <$> arbitrary -- authenticationAccessToken :: Text
      <*> arbitrary -- authenticationClientToken :: Maybe Text
    
instance Arbitrary AuthenticationRequest where
  arbitrary =
    AuthenticationRequest
      <$> arbitrary -- authenticationRequestUsername :: Text
      <*> arbitrary -- authenticationRequestPassword :: Text
    
instance Arbitrary Error where
  arbitrary =
    Error
      <$> arbitrary -- errorError :: Maybe Text
      <*> arbitrary -- errorErrorMessage :: Maybe Text
    
instance Arbitrary GameProfile where
  arbitrary =
    GameProfile
      <$> arbitrary -- gameProfileAgent :: Maybe Text
      <*> arbitrary -- gameProfileId :: Maybe Text
      <*> arbitrary -- gameProfileName :: Maybe Text
      <*> arbitrary -- gameProfileUserId :: Maybe FilePath
      <*> arbitrary -- gameProfileCreatedAt :: Maybe Integer
      <*> arbitrary -- gameProfileLegacyProfile :: Maybe Bool
      <*> arbitrary -- gameProfileSuspended :: Maybe Bool
      <*> arbitrary -- gameProfilePaid :: Maybe Bool
      <*> arbitrary -- gameProfileMigrated :: Maybe Bool
      <*> arbitrary -- gameProfileLegacy :: Maybe Bool
    
instance Arbitrary GameProfileProperty where
  arbitrary =
    GameProfileProperty
      <$> arbitrary -- gameProfilePropertyName :: Maybe Text
      <*> arbitrary -- gameProfilePropertyValue :: Maybe Text
    
instance Arbitrary PrivateUserData where
  arbitrary =
    PrivateUserData
      <$> arbitrary -- privateUserDataId :: Maybe FilePath
      <*> arbitrary -- privateUserDataProperties :: Maybe [GameProfileProperty]
    
instance Arbitrary ProfileId where
  arbitrary =
    ProfileId
      <$> arbitrary -- profileIdId :: Text
      <*> arbitrary -- profileIdName :: Text
    
instance Arbitrary ReducedUserData where
  arbitrary =
    ReducedUserData
      <$> arbitrary -- reducedUserDataId :: Maybe FilePath
      <*> arbitrary -- reducedUserDataProperties :: Maybe [GameProfileProperty]
    
instance Arbitrary RefreshRequest where
  arbitrary =
    RefreshRequest
      <$> arbitrary -- refreshRequestAccessToken :: Text
      <*> arbitrary -- refreshRequestClientToken :: Maybe Text
    
instance Arbitrary RefreshResponse where
  arbitrary =
    RefreshResponse
      <$> arbitrary -- refreshResponseAccessToken :: Text
      <*> arbitrary -- refreshResponseClientToken :: Maybe Text
    
instance Arbitrary UsernamePassword where
  arbitrary =
    UsernamePassword
      <$> arbitrary -- usernamePasswordUsername :: Text
      <*> arbitrary -- usernamePasswordPassword :: Text
    



instance Arbitrary E'Name where
  arbitrary = arbitraryBoundedEnum
