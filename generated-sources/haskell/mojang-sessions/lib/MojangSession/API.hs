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

module MojangSession.API
  -- * Client and Server
  ( ServerConfig(..)
  , MojangSessionBackend
  , createMojangSessionClient
  , runMojangSessionServer
  , runMojangSessionClient
  , runMojangSessionClientWithManager
  , MojangSessionClient
  -- ** Servant
  , MojangSessionAPI
  ) where

import MojangSession.Types

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




-- For the form data code generation.
lookupEither :: FromHttpApiData b => Text -> [(Text, Text)] -> Either String b
lookupEither key assocs =
  case lookup key assocs of
    Nothing -> Left $ "Could not find parameter " <> (T.unpack key) <> " in form data"
    Just value ->
      case parseQueryParam value of
        Left result -> Left $ T.unpack result
        Right result -> Right $ result

-- | Servant type-level API, generated from the OpenAPI spec for MojangSession.
type MojangSessionAPI
    =    "blockedservers" :> Verb 'GET 200 '[JSON] Text -- 'getBlockedServerHashes' route
    :<|> "session" :> "minecraft" :> "profile" :> Capture "stripped_uuid" Text :> QueryParam "unsigned" Bool :> Verb 'GET 200 '[JSON] PlayerProfile -- 'getPlayerProfile' route

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


-- | Backend for MojangSession.
-- The backend can be used both for the client and the server. The client generated from the MojangSession OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createMojangSessionClient@). Alternatively, provided
-- a backend, the API can be served using @runMojangSessionServer@.
data MojangSessionBackend m = MojangSessionBackend
  { getBlockedServerHashes :: m Text{- ^ Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+) -}
  , getPlayerProfile :: Text -> Maybe Bool -> m PlayerProfile{- ^ This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like. -}
  }

newtype MojangSessionClient a = MojangSessionClient
  { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a
  } deriving Functor

instance Applicative MojangSessionClient where
  pure x = MojangSessionClient (\_ _ -> pure x)
  (MojangSessionClient f) <*> (MojangSessionClient x) =
    MojangSessionClient (\manager url -> f manager url <*> x manager url)

instance Monad MojangSessionClient where
  (MojangSessionClient a) >>= f =
    MojangSessionClient (\manager url -> do
      value <- a manager url
      runClient (f value) manager url)

instance MonadIO MojangSessionClient where
  liftIO io = MojangSessionClient (\_ _ -> liftIO io)

createMojangSessionClient :: MojangSessionBackend MojangSessionClient
createMojangSessionClient = MojangSessionBackend{..}
  where
    ((coerce -> getBlockedServerHashes) :<|>
     (coerce -> getPlayerProfile)) = client (Proxy :: Proxy MojangSessionAPI)

-- | Run requests in the MojangSessionClient monad.
runMojangSessionClient :: ServerConfig -> MojangSessionClient a -> ExceptT ServantError IO a
runMojangSessionClient clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runMojangSessionClientWithManager manager clientConfig cl

-- | Run requests in the MojangSessionClient monad using a custom manager.
runMojangSessionClientWithManager :: Manager -> ServerConfig -> MojangSessionClient a -> ExceptT ServantError IO a
runMojangSessionClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the MojangSession server at the provided host and port.
runMojangSessionServer :: MonadIO m => ServerConfig -> MojangSessionBackend (ExceptT ServantErr IO)  -> m ()
runMojangSessionServer ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy MojangSessionAPI) (serverFromBackend backend)
  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend MojangSessionBackend{..} =
      (coerce getBlockedServerHashes :<|>
       coerce getPlayerProfile)
