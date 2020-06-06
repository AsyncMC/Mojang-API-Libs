{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import Mojang.Model
import Mojang.Core

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
 
instance Arbitrary CurrentPlayerIDs where
  arbitrary =
    CurrentPlayerIDs
      <$> arbitrary -- currentPlayerIDsId :: Text
      <*> arbitrary -- currentPlayerIDsName :: Text
      <*> arbitrary -- currentPlayerIDsLegacy :: Maybe Bool
      <*> arbitrary -- currentPlayerIDsDemo :: Maybe Bool
    
instance Arbitrary Error where
  arbitrary =
    Error
      <$> arbitrary -- errorError :: Maybe Text
      <*> arbitrary -- errorErrorMessage :: Maybe Text
    
instance Arbitrary InlineObject where
  arbitrary =
    InlineObject
      <$> arbitrary -- inlineObjectModel :: Maybe SkinModel
      <*> arbitrary -- inlineObjectFile :: FilePath
    
instance Arbitrary InlineObject1 where
  arbitrary =
    InlineObject1
      <$> arbitrary -- inlineObject1Model :: Maybe SkinModel
      <*> arbitrary -- inlineObject1Url :: Text
    
instance Arbitrary NameChange where
  arbitrary =
    NameChange
      <$> arbitrary -- nameChangeName :: Text
      <*> arbitrary -- nameChangeChangedToAt :: Maybe Integer
    
instance Arbitrary OrderStatisticsRequest where
  arbitrary =
    OrderStatisticsRequest
      <$> arbitrary -- orderStatisticsRequestMetricKeys :: [OrderStatistic]
    
instance Arbitrary OrderStatisticsResponse where
  arbitrary =
    OrderStatisticsResponse
      <$> arbitrary -- orderStatisticsResponseTotal :: Integer
      <*> arbitrary -- orderStatisticsResponseLast24h :: Integer
      <*> arbitrary -- orderStatisticsResponseSaleVelocityPerSeconds :: Double
    
instance Arbitrary SecurityAnswer where
  arbitrary =
    SecurityAnswer
      <$> arbitrary -- securityAnswerId :: Int
    
instance Arbitrary SecurityAnswerId where
  arbitrary =
    SecurityAnswerId
      <$> arbitrary -- securityAnswerIdId :: Int
    
instance Arbitrary SecurityChallenge where
  arbitrary =
    SecurityChallenge
      <$> arbitrary -- securityChallengeQuestion :: SecurityQuestion
      <*> arbitrary -- securityChallengeAnswer :: SecurityAnswerId
    
instance Arbitrary SecurityQuestion where
  arbitrary =
    SecurityQuestion
      <$> arbitrary -- securityQuestionId :: Int
      <*> arbitrary -- securityQuestionQuestion :: Text
    



instance Arbitrary OrderStatistic where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SkinModel where
  arbitrary = arbitraryBoundedEnum
