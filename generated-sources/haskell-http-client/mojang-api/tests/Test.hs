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

import Mojang.Model
import Mojang.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 5) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy ChangeSkinRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CurrentPlayerIDs)
      propMimeEq MimeJSON (Proxy :: Proxy Error)
      propMimeEq MimeJSON (Proxy :: Proxy NameChange)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatistic)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatisticsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatisticsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SecurityAnswer)
      propMimeEq MimeJSON (Proxy :: Proxy SecurityAnswerId)
      propMimeEq MimeJSON (Proxy :: Proxy SecurityChallenge)
      propMimeEq MimeJSON (Proxy :: Proxy SecurityQuestion)
      propMimeEq MimeJSON (Proxy :: Proxy SkinModel)
      propMimeEq MimeJSON (Proxy :: Proxy UploadSkinRequest)
      
