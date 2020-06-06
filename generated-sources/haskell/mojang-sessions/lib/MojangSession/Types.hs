{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MojangSession.Types (
  PlayerProfile (..),
  PlayerProfileProperty (..),
  PlayerProfileTexturePropertyValue (..),
  PlayerSkinMetadata (..),
  PlayerSkinURL (..),
  PlayerTexture (..),
  PlayerTextureURL (..),
  SessionApiError (..),
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
data PlayerProfile = PlayerProfile
  { playerProfileId :: Text -- ^ The player UUID without hyphens
  , playerProfileName :: Text -- ^ 
  , playerProfileLegacy :: Bool -- ^ Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
  , playerProfileProperties :: [PlayerProfileProperty] -- ^ An array with all player properties, like skin and cape
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerProfile where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerProfile")
instance ToJSON PlayerProfile where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerProfile")

-- | A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
data PlayerProfileProperty = PlayerProfileProperty
  { playerProfilePropertyName :: Text -- ^ The property name
  , playerProfilePropertyValue :: Text -- ^ The serialized property value in base64.
  , playerProfilePropertySignature :: Text -- ^ signed data using Yggdrasil's private key
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerProfileProperty where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerProfileProperty")
instance ToJSON PlayerProfileProperty where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerProfileProperty")

-- | This is obtained by decoding the \&quot;textures\&quot; property
data PlayerProfileTexturePropertyValue = PlayerProfileTexturePropertyValue
  { playerProfileTexturePropertyValueTimestamp :: Integer -- ^ UNIX timestamp in milliseconds
  , playerProfileTexturePropertyValueProfileId :: Text -- ^ The player UUID without hyphens
  , playerProfileTexturePropertyValueProfileName :: Text -- ^ The player's name
  , playerProfileTexturePropertyValueSignatureRequired :: Bool -- ^ Only present if unsigned was set to false in the request
  , playerProfileTexturePropertyValueTextures :: PlayerTexture -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerProfileTexturePropertyValue where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerProfileTexturePropertyValue")
instance ToJSON PlayerProfileTexturePropertyValue where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerProfileTexturePropertyValue")

-- | Contains details about the skin
data PlayerSkinMetadata = PlayerSkinMetadata
  { playerSkinMetadataModel :: Text -- ^ The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerSkinMetadata where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerSkinMetadata")
instance ToJSON PlayerSkinMetadata where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerSkinMetadata")

-- | Wraps the URL to the texture and configures the player&#39;s model
newtype PlayerSkinURL = PlayerSkinURL { unPlayerSkinURL :: PlayerTextureURL }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Provide links to the player&#39;s skin and cape
data PlayerTexture = PlayerTexture
  { playerTextureSKIN :: PlayerSkinURL -- ^ 
  , playerTextureCAPE :: PlayerTextureURL -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerTexture where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerTexture")
instance ToJSON PlayerTexture where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerTexture")

-- | Wraps the URL to the texture
data PlayerTextureURL = PlayerTextureURL
  { playerTextureURLUrl :: Text -- ^ The URL to the texture, must be in Mojang's domains.
  } deriving (Show, Eq, Generic)

instance FromJSON PlayerTextureURL where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "playerTextureURL")
instance ToJSON PlayerTextureURL where
  toJSON = genericToJSON (removeFieldLabelPrefix False "playerTextureURL")

-- | An object describing giving a bit of information about the error
data SessionApiError = SessionApiError
  { sessionApiErrorError :: Text -- ^ A message describing the error
  , sessionApiErrorPath :: Text -- ^ The request path
  } deriving (Show, Eq, Generic)

instance FromJSON SessionApiError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "sessionApiError")
instance ToJSON SessionApiError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "sessionApiError")

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
