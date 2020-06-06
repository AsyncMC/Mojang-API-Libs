{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Mojang.Types (
  CurrentPlayerIDs (..),
  Error (..),
  Inline_object (..),
  Inline_object_1 (..),
  NameChange (..),
  OrderStatistic (..),
  OrderStatisticsRequest (..),
  OrderStatisticsResponse (..),
  SecurityAnswer (..),
  SecurityAnswerId (..),
  SecurityChallenge (..),
  SecurityQuestion (..),
  SkinModel (..),
  ) where

import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | The current player, demo and legacy status of a player identified by the id
data CurrentPlayerIDs = CurrentPlayerIDs
  { currentPlayerIDsId :: Text -- ^ The player UUID without hyphens
  , currentPlayerIDsName :: Text -- ^ The current name being used by this player
  , currentPlayerIDsLegacy :: Bool -- ^ If account has not been converted
  , currentPlayerIDsDemo :: Bool -- ^ If the player has not puchased the game
  } deriving (Show, Eq, Generic)

instance FromJSON CurrentPlayerIDs where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "currentPlayerIDs")
instance ToJSON CurrentPlayerIDs where
  toJSON = genericToJSON (removeFieldLabelPrefix False "currentPlayerIDs")

-- | This is returned when the request fails
data Error = Error
  { errorError :: Text -- ^ 
  , errorErrorMessage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Error where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "error")
instance ToJSON Error where
  toJSON = genericToJSON (removeFieldLabelPrefix False "error")

-- | 
data Inline_object = Inline_object
  { inlineObjectModel :: SkinModel -- ^ 
  , inlineObjectFile :: FilePath -- ^ The skin image in PNG format
  } deriving (Show, Eq, Generic)

instance FromJSON Inline_object where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject")
instance ToJSON Inline_object where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject")

-- | Request Mojang to download a skin from an URL and apply to the player
data Inline_object_1 = Inline_object_1
  { inlineObject1Model :: SkinModel -- ^ 
  , inlineObject1Url :: Text -- ^ The URL which Mojang servers will download and apply the skin
  } deriving (Show, Eq, Generic)

instance FromJSON Inline_object_1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject1")
instance ToJSON Inline_object_1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject1")

-- | A registered name change.
data NameChange = NameChange
  { nameChangeName :: Text -- ^ The new player name
  , nameChangeChangedToAt :: Integer -- ^ Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
  } deriving (Show, Eq, Generic)

instance FromJSON NameChange where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "nameChange")
instance ToJSON NameChange where
  toJSON = genericToJSON (removeFieldLabelPrefix False "nameChange")

-- | Valid options to query the order statistics
data OrderStatistic = OrderStatistic
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatistic where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "orderStatistic")
instance ToJSON OrderStatistic where
  toJSON = genericToJSON (removeFieldLabelPrefix False "orderStatistic")

-- | The body of the request to get the order statistics
data OrderStatisticsRequest = OrderStatisticsRequest
  { orderStatisticsRequestMetricKeys :: [OrderStatistic] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatisticsRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "orderStatisticsRequest")
instance ToJSON OrderStatisticsRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "orderStatisticsRequest")

-- | A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
data OrderStatisticsResponse = OrderStatisticsResponse
  { orderStatisticsResponseTotal :: Integer -- ^ total amount sold
  , orderStatisticsResponseLast24h :: Integer -- ^ total sold in last 24 hours
  , orderStatisticsResponseSaleVelocityPerSeconds :: Double -- ^ decimal average sales per second
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatisticsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "orderStatisticsResponse")
instance ToJSON OrderStatisticsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "orderStatisticsResponse")

-- | A security question answer given by the player using the id given by Mojang
newtype SecurityAnswer = SecurityAnswer { unSecurityAnswer :: SecurityAnswerId }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A security question answer id given by Mojang
data SecurityAnswerId = SecurityAnswerId
  { securityAnswerIdId :: Int -- ^ A number giver by Mojang to reply a question
  } deriving (Show, Eq, Generic)

instance FromJSON SecurityAnswerId where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "securityAnswerId")
instance ToJSON SecurityAnswerId where
  toJSON = genericToJSON (removeFieldLabelPrefix False "securityAnswerId")

-- | Binds a question to an answer id, the answer must respect the answer id.
data SecurityChallenge = SecurityChallenge
  { securityChallengeQuestion :: SecurityQuestion -- ^ 
  , securityChallengeAnswer :: SecurityAnswerId -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SecurityChallenge where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "securityChallenge")
instance ToJSON SecurityChallenge where
  toJSON = genericToJSON (removeFieldLabelPrefix False "securityChallenge")

-- | A security question requested by Mojang
data SecurityQuestion = SecurityQuestion
  { securityQuestionId :: Int -- ^ The possible IDs are these:   1  What is your favorite pet's name?   2  What is your favorite movie?   3  What is your favorite author's last name?   4  What is your favorite artist's last name?   5  What is your favorite actor's last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend's first name?   12 What is your favorite cousin's name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother's middle name?   16 What is your father's middle name?   17 What is your oldest sibling's middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother's first name?   32 What is your grandfather's first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
  , securityQuestionQuestion :: Text -- ^ The question itself
  } deriving (Show, Eq, Generic)

instance FromJSON SecurityQuestion where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "securityQuestion")
instance ToJSON SecurityQuestion where
  toJSON = genericToJSON (removeFieldLabelPrefix False "securityQuestion")

-- | Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
data SkinModel = SkinModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON SkinModel where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "skinModel")
instance ToJSON SkinModel where
  toJSON = genericToJSON (removeFieldLabelPrefix False "skinModel")

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
  {fieldLabelModifier = fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars}
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
