{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import MojangAuthentication.Model
import MojangAuthentication.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 5) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy AccessKeys)
      propMimeEq MimeJSON (Proxy :: Proxy Agent)
      propMimeEq MimeJSON (Proxy :: Proxy Authentication)
      propMimeEq MimeJSON (Proxy :: Proxy AuthenticationRequest)
      propMimeEq MimeJSON (Proxy :: Proxy Error)
      propMimeEq MimeJSON (Proxy :: Proxy GameProfile)
      propMimeEq MimeJSON (Proxy :: Proxy GameProfileProperty)
      propMimeEq MimeJSON (Proxy :: Proxy PrivateUserData)
      propMimeEq MimeJSON (Proxy :: Proxy ProfileId)
      propMimeEq MimeJSON (Proxy :: Proxy ReducedUserData)
      propMimeEq MimeJSON (Proxy :: Proxy RefreshRequest)
      propMimeEq MimeJSON (Proxy :: Proxy RefreshResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UsernamePassword)
      
