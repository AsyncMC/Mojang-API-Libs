{-# LANGUAGE DataKinds #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE DeriveTraversable #-}
{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE TypeFamilies #-}
{-# LANGUAGE TypeOperators #-}
{-# LANGUAGE ViewPatterns #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -fcontext-stack=328 #-}

module Mojang.API
  -- * Client and Server
  ( ServerConfig(..)
  , MojangBackend
  , createMojangClient
  , runMojangServer
  , runMojangClient
  , runMojangClientWithManager
  , MojangClient
  -- ** Servant
  , MojangAPI
  ) where

import Mojang.Types

import Control.Monad.Except (ExceptT)
import Control.Monad.IO.Class
import Data.Aeson (Value)
import Data.Coerce (coerce)
import Data.Function ((&))
import qualified Data.Map as Map
import Data.Monoid ((<>))
import Data.Proxy (Proxy(..))
import Data.Text (Text)
import qualified Data.Text as T
import GHC.Exts (IsString(..))
import GHC.Generics (Generic)
import Network.HTTP.Client (Manager, defaultManagerSettings, newManager)
import Network.HTTP.Types.Method (methodOptions)
import qualified Network.Wai.Handler.Warp as Warp
import Servant (ServantErr, serve)
import Servant.API
import Servant.API.Verbs (StdMethod(..), Verb)
import Servant.Client (Scheme(Http), ServantError, client)
import Servant.Common.BaseUrl (BaseUrl(..))
import Web.HttpApiData



data FormChangePlayerSkin = FormChangePlayerSkin
  { changePlayerSkinModel :: SkinModel
  , changePlayerSkinUrl :: Text
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormChangePlayerSkin where
  fromFormUrlEncoded inputs = FormChangePlayerSkin <$> lookupEither "model" inputs <*> lookupEither "url" inputs

instance ToFormUrlEncoded FormChangePlayerSkin where
  toFormUrlEncoded value =
    [ ("model", toQueryParam $ changePlayerSkinModel value)
    , ("url", toQueryParam $ changePlayerSkinUrl value)
    ]
data FormUploadPlayerSkin = FormUploadPlayerSkin
  { uploadPlayerSkinModel :: SkinModel
  , uploadPlayerSkinFile :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormUploadPlayerSkin where
  fromFormUrlEncoded inputs = FormUploadPlayerSkin <$> lookupEither "model" inputs <*> lookupEither "file" inputs

instance ToFormUrlEncoded FormUploadPlayerSkin where
  toFormUrlEncoded value =
    [ ("model", toQueryParam $ uploadPlayerSkinModel value)
    , ("file", toQueryParam $ uploadPlayerSkinFile value)
    ]

-- For the form data code generation.
lookupEither :: FromHttpApiData b => Text -> [(Text, Text)] -> Either String b
lookupEither key assocs =
  case lookup key assocs of
    Nothing -> Left $ "Could not find parameter " <> (T.unpack key) <> " in form data"
    Just value ->
      case parseQueryParam value of
        Left result -> Left $ T.unpack result
        Right result -> Right $ result

-- | Servant type-level API, generated from the OpenAPI spec for Mojang.
type MojangAPI
    =    "orders" :> "statistics" :> ReqBody '[JSON] OrderStatisticsRequest :> Verb 'POST 200 '[JSON] OrderStatisticsResponse -- 'getOrdersStatistics' route
    :<|> "profiles" :> "minecraft" :> ReqBody '[JSON] [Text] :> Verb 'POST 200 '[JSON] [CurrentPlayerIDs] -- 'findUniqueIdsByName' route
    :<|> "user" :> "profiles" :> Capture "stripped_uuid" Text :> "names" :> Verb 'GET 200 '[JSON] [NameChange] -- 'getNameHistory' route
    :<|> "users" :> "profiles" :> "minecraft" :> Capture "username" Text :> QueryParam "at" Integer :> Verb 'GET 200 '[JSON] CurrentPlayerIDs -- 'getUniqueIdByName' route
    :<|> "user" :> "security" :> "location" :> Verb 'GET 200 '[JSON] () -- 'checkSecurityStatus' route
    :<|> "user" :> "security" :> "challenges" :> Verb 'GET 200 '[JSON] [SecurityChallenge] -- 'listPendingSecurityQuestions' route
    :<|> "user" :> "security" :> "location" :> ReqBody '[JSON] [SecurityAnswer] :> Verb 'POST 200 '[JSON] () -- 'sendSecurityQuestionAnswers' route
    :<|> "user" :> "profile" :> Capture "stripped_uuid" Text :> "skin" :> ReqBody '[FormUrlEncoded] FormChangePlayerSkin :> Verb 'POST 200 '[JSON] () -- 'changePlayerSkin' route
    :<|> "user" :> "profile" :> Capture "stripped_uuid" Text :> "skin" :> Verb 'DELETE 200 '[JSON] () -- 'resetPlayerSkin' route
    :<|> "user" :> "profile" :> Capture "stripped_uuid" Text :> "skin" :> ReqBody '[FormUrlEncoded] FormUploadPlayerSkin :> Verb 'PUT 200 '[JSON] () -- 'uploadPlayerSkin' route

-- | Server or client configuration, specifying the host and port to query or serve on.
data ServerConfig = ServerConfig
  { configHost :: String  -- ^ Hostname to serve on, e.g. "127.0.0.1"
  , configPort :: Int      -- ^ Port to serve on, e.g. 8080
  } deriving (Eq, Ord, Show, Read)

-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Backend for Mojang.
-- The backend can be used both for the client and the server. The client generated from the Mojang OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createMojangClient@). Alternatively, provided
-- a backend, the API can be served using @runMojangServer@.
data MojangBackend m = MojangBackend
  { getOrdersStatistics :: OrderStatisticsRequest -> m OrderStatisticsResponse{- ^  -}
  , findUniqueIdsByName :: [Text] -> m [CurrentPlayerIDs]{- ^ Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned. -}
  , getNameHistory :: Text -> m [NameChange]{- ^  -}
  , getUniqueIdByName :: Text -> Maybe Integer -> m CurrentPlayerIDs{- ^ Find the current player name, UUID, demo status and migration flag by the current player name or at a given time. -}
  , checkSecurityStatus :: m (){- ^  -}
  , listPendingSecurityQuestions :: m [SecurityChallenge]{- ^  -}
  , sendSecurityQuestionAnswers :: [SecurityAnswer] -> m (){- ^  -}
  , changePlayerSkin :: Text -> FormChangePlayerSkin -> m (){- ^ This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts. -}
  , resetPlayerSkin :: Text -> m (){- ^  -}
  , uploadPlayerSkin :: Text -> FormUploadPlayerSkin -> m (){- ^ This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well. -}
  }

newtype MojangClient a = MojangClient
  { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a
  } deriving Functor

instance Applicative MojangClient where
  pure x = MojangClient (\_ _ -> pure x)
  (MojangClient f) <*> (MojangClient x) =
    MojangClient (\manager url -> f manager url <*> x manager url)

instance Monad MojangClient where
  (MojangClient a) >>= f =
    MojangClient (\manager url -> do
      value <- a manager url
      runClient (f value) manager url)

instance MonadIO MojangClient where
  liftIO io = MojangClient (\_ _ -> liftIO io)

createMojangClient :: MojangBackend MojangClient
createMojangClient = MojangBackend{..}
  where
    ((coerce -> getOrdersStatistics) :<|>
     (coerce -> findUniqueIdsByName) :<|>
     (coerce -> getNameHistory) :<|>
     (coerce -> getUniqueIdByName) :<|>
     (coerce -> checkSecurityStatus) :<|>
     (coerce -> listPendingSecurityQuestions) :<|>
     (coerce -> sendSecurityQuestionAnswers) :<|>
     (coerce -> changePlayerSkin) :<|>
     (coerce -> resetPlayerSkin) :<|>
     (coerce -> uploadPlayerSkin)) = client (Proxy :: Proxy MojangAPI)

-- | Run requests in the MojangClient monad.
runMojangClient :: ServerConfig -> MojangClient a -> ExceptT ServantError IO a
runMojangClient clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runMojangClientWithManager manager clientConfig cl

-- | Run requests in the MojangClient monad using a custom manager.
runMojangClientWithManager :: Manager -> ServerConfig -> MojangClient a -> ExceptT ServantError IO a
runMojangClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the Mojang server at the provided host and port.
runMojangServer :: MonadIO m => ServerConfig -> MojangBackend (ExceptT ServantErr IO)  -> m ()
runMojangServer ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy MojangAPI) (serverFromBackend backend)
  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend MojangBackend{..} =
      (coerce getOrdersStatistics :<|>
       coerce findUniqueIdsByName :<|>
       coerce getNameHistory :<|>
       coerce getUniqueIdByName :<|>
       coerce checkSecurityStatus :<|>
       coerce listPendingSecurityQuestions :<|>
       coerce sendSecurityQuestionAnswers :<|>
       coerce changePlayerSkin :<|>
       coerce resetPlayerSkin :<|>
       coerce uploadPlayerSkin)
