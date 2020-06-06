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

import MojangSession.Model
import MojangSession.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 5) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy PlayerProfile)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerProfileProperty)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerProfileTexturePropertyValue)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerSkinMetadata)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerSkinURL)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerTexture)
      propMimeEq MimeJSON (Proxy :: Proxy PlayerTextureURL)
      propMimeEq MimeJSON (Proxy :: Proxy SessionApiError)
      
