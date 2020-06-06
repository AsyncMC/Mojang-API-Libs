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

module MojangAuthentication.API
  -- * Client and Server
  ( ServerConfig(..)
  , MojangAuthenticationBackend
  , createMojangAuthenticationClient
  , runMojangAuthenticationServer
  , runMojangAuthenticationClient
  , runMojangAuthenticationClientWithManager
  , MojangAuthenticationClient
  -- ** Servant
  , MojangAuthenticationAPI
  ) where

import MojangAuthentication.Types

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

-- | Servant type-level API, generated from the OpenAPI spec for MojangAuthentication.
type MojangAuthenticationAPI
    =    "authenticate" :> ReqBody '[JSON] AuthenticationRequest :> Verb 'POST 200 '[JSON] Authentication -- 'authenticate' route
    :<|> "invalidate" :> ReqBody '[JSON] AccessKeys :> Verb 'POST 200 '[JSON] () -- 'invalidate' route
    :<|> "refresh" :> ReqBody '[JSON] RefreshRequest :> Verb 'POST 200 '[JSON] RefreshResponse -- 'refresh' route
    :<|> "signout" :> ReqBody '[JSON] UsernamePassword :> Verb 'POST 200 '[JSON] () -- 'siginout' route
    :<|> "validate" :> ReqBody '[JSON] AccessKeys :> Verb 'POST 200 '[JSON] () -- 'validate' route

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


-- | Backend for MojangAuthentication.
-- The backend can be used both for the client and the server. The client generated from the MojangAuthentication OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createMojangAuthenticationClient@). Alternatively, provided
-- a backend, the API can be served using @runMojangAuthenticationServer@.
data MojangAuthenticationBackend m = MojangAuthenticationBackend
  { authenticate :: AuthenticationRequest -> m Authentication{- ^  -}
  , invalidate :: AccessKeys -> m (){- ^  -}
  , refresh :: RefreshRequest -> m RefreshResponse{- ^  -}
  , siginout :: UsernamePassword -> m (){- ^  -}
  , validate :: AccessKeys -> m (){- ^  -}
  }

newtype MojangAuthenticationClient a = MojangAuthenticationClient
  { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a
  } deriving Functor

instance Applicative MojangAuthenticationClient where
  pure x = MojangAuthenticationClient (\_ _ -> pure x)
  (MojangAuthenticationClient f) <*> (MojangAuthenticationClient x) =
    MojangAuthenticationClient (\manager url -> f manager url <*> x manager url)

instance Monad MojangAuthenticationClient where
  (MojangAuthenticationClient a) >>= f =
    MojangAuthenticationClient (\manager url -> do
      value <- a manager url
      runClient (f value) manager url)

instance MonadIO MojangAuthenticationClient where
  liftIO io = MojangAuthenticationClient (\_ _ -> liftIO io)

createMojangAuthenticationClient :: MojangAuthenticationBackend MojangAuthenticationClient
createMojangAuthenticationClient = MojangAuthenticationBackend{..}
  where
    ((coerce -> authenticate) :<|>
     (coerce -> invalidate) :<|>
     (coerce -> refresh) :<|>
     (coerce -> siginout) :<|>
     (coerce -> validate)) = client (Proxy :: Proxy MojangAuthenticationAPI)

-- | Run requests in the MojangAuthenticationClient monad.
runMojangAuthenticationClient :: ServerConfig -> MojangAuthenticationClient a -> ExceptT ServantError IO a
runMojangAuthenticationClient clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runMojangAuthenticationClientWithManager manager clientConfig cl

-- | Run requests in the MojangAuthenticationClient monad using a custom manager.
runMojangAuthenticationClientWithManager :: Manager -> ServerConfig -> MojangAuthenticationClient a -> ExceptT ServantError IO a
runMojangAuthenticationClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the MojangAuthentication server at the provided host and port.
runMojangAuthenticationServer :: MonadIO m => ServerConfig -> MojangAuthenticationBackend (ExceptT ServantErr IO)  -> m ()
runMojangAuthenticationServer ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy MojangAuthenticationAPI) (serverFromBackend backend)
  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend MojangAuthenticationBackend{..} =
      (coerce authenticate :<|>
       coerce invalidate :<|>
       coerce refresh :<|>
       coerce siginout :<|>
       coerce validate)
