{-
   Mojang API

   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   OpenAPI Version: 3.0.1
   Mojang API API version: 2020-06-05
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Mojang.API.Miscellaneous
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Mojang.API.Miscellaneous where

import Mojang.Core
import Mojang.MimeTypes
import Mojang.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Miscellaneous

-- *** getOrdersStatistics

-- | @POST \/orders\/statistics@
-- 
-- Get statistics on the sales of Minecraft.
-- 
-- AuthMethod: 'AuthBasicMojangStatisticsToken'
-- 
getOrdersStatistics 
  :: (Consumes GetOrdersStatistics MimeJSON, MimeRender MimeJSON OrderStatisticsRequest)
  => OrderStatisticsRequest -- ^ "orderStatisticsRequest" -  The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
  -> MojangRequest GetOrdersStatistics MimeJSON OrderStatisticsResponse MimeJSON
getOrdersStatistics orderStatisticsRequest =
  _mkRequest "POST" ["/orders/statistics"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthBasicMojangStatisticsToken)
    `setBodyParam` orderStatisticsRequest

data GetOrdersStatistics 

-- | /Body Param/ "OrderStatisticsRequest" - The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
instance HasBodyParam GetOrdersStatistics OrderStatisticsRequest 

-- | @application/json@
instance Consumes GetOrdersStatistics MimeJSON

-- | @application/json@
instance Produces GetOrdersStatistics MimeJSON

