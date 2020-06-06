{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MojangAuthentication.Types (
  AccessKeys (..),
  Agent (..),
  Authentication (..),
  AuthenticationRequest (..),
  Error (..),
  GameProfile (..),
  GameProfileProperty (..),
  PrivateUserData (..),
  ProfileId (..),
  ReducedUserData (..),
  RefreshRequest (..),
  RefreshResponse (..),
  UsernamePassword (..),
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


-- | 
data AccessKeys = AccessKeys
  { accessKeysAccessToken :: Text -- ^ 
  , accessKeysClientToken :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AccessKeys where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "accessKeys")
instance ToJSON AccessKeys where
  toJSON = genericToJSON (removeFieldLabelPrefix False "accessKeys")

-- | Identifies the software doing the request
data Agent = Agent
  { agentName :: Text -- ^ The name of the game
  , agentVersion :: Int -- ^ The agent version, usually 1.
  } deriving (Show, Eq, Generic)

instance FromJSON Agent where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "agent")
instance ToJSON Agent where
  toJSON = genericToJSON (removeFieldLabelPrefix False "agent")

-- | 
newtype Authentication = Authentication { unAuthentication :: AccessKeys }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
newtype AuthenticationRequest = AuthenticationRequest { unAuthenticationRequest :: UsernamePassword }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

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
data GameProfile = GameProfile
  { gameProfileAgent :: Text -- ^ 
  , gameProfileId :: Text -- ^ 
  , gameProfileName :: Text -- ^ 
  , gameProfileUserId :: Text -- ^ 
  , gameProfileCreatedAt :: Integer -- ^ Unix timestamp in milliseconds
  , gameProfileLegacyProfile :: Bool -- ^ 
  , gameProfileSuspended :: Bool -- ^ 
  , gameProfilePaid :: Bool -- ^ 
  , gameProfileMigrated :: Bool -- ^ 
  , gameProfileLegacy :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GameProfile where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "gameProfile")
instance ToJSON GameProfile where
  toJSON = genericToJSON (removeFieldLabelPrefix False "gameProfile")

-- | 
data GameProfileProperty = GameProfileProperty
  { gameProfilePropertyName :: Text -- ^ 
  , gameProfilePropertyValue :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GameProfileProperty where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "gameProfileProperty")
instance ToJSON GameProfileProperty where
  toJSON = genericToJSON (removeFieldLabelPrefix False "gameProfileProperty")

-- | 
newtype PrivateUserData = PrivateUserData { unPrivateUserData :: ReducedUserData }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data ProfileId = ProfileId
  { profileIdId :: Text -- ^ 
  , profileIdName :: Text -- ^ The player name
  } deriving (Show, Eq, Generic)

instance FromJSON ProfileId where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "profileId")
instance ToJSON ProfileId where
  toJSON = genericToJSON (removeFieldLabelPrefix False "profileId")

-- | 
data ReducedUserData = ReducedUserData
  { reducedUserDataId :: Text -- ^ 
  , reducedUserDataProperties :: [GameProfileProperty] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ReducedUserData where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "reducedUserData")
instance ToJSON ReducedUserData where
  toJSON = genericToJSON (removeFieldLabelPrefix False "reducedUserData")

-- | 
newtype RefreshRequest = RefreshRequest { unRefreshRequest :: AccessKeys }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
newtype RefreshResponse = RefreshResponse { unRefreshResponse :: RefreshRequest }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data UsernamePassword = UsernamePassword
  { usernamePasswordUsername :: Text -- ^ The Mojang account e-mail or username. Never store it.
  , usernamePasswordPassword :: Text -- ^ The Mojang account password, never store it.
  } deriving (Show, Eq, Generic)

instance FromJSON UsernamePassword where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "usernamePassword")
instance ToJSON UsernamePassword where
  toJSON = genericToJSON (removeFieldLabelPrefix False "usernamePassword")

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
