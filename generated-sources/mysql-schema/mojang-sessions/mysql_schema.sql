/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `PlayerProfile` generated from model 'PlayerProfile'
--

CREATE TABLE IF NOT EXISTS `PlayerProfile` (
  `id` TEXT NOT NULL COMMENT 'The player UUID without hyphens',
  `name` TEXT NOT NULL,
  `legacy` TINYINT(1) DEFAULT false COMMENT 'Will appear in the response if the user has not migrated their minecraft.net account to Mojang.',
  `properties` JSON NOT NULL COMMENT 'An array with all player properties, like skin and cape'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PlayerProfileProperty` generated from model 'PlayerProfileProperty'
-- A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
--

CREATE TABLE IF NOT EXISTS `PlayerProfileProperty` (
  `name` TEXT NOT NULL COMMENT 'The property name',
  `value` MEDIUMBLOB NOT NULL COMMENT 'The serialized property value in base64.',
  `signature` MEDIUMBLOB DEFAULT NULL COMMENT 'signed data using Yggdrasil&#39;s private key'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue';

--
-- Table structure for table `PlayerProfileTexturePropertyValue` generated from model 'PlayerProfileTexturePropertyValue'
-- This is obtained by decoding the \&quot;textures\&quot; property
--

CREATE TABLE IF NOT EXISTS `PlayerProfileTexturePropertyValue` (
  `timestamp` BIGINT NOT NULL COMMENT 'UNIX timestamp in milliseconds',
  `profileId` TEXT NOT NULL COMMENT 'The player UUID without hyphens',
  `profileName` TEXT NOT NULL COMMENT 'The player&#39;s name',
  `signatureRequired` TINYINT(1) DEFAULT false COMMENT 'Only present if unsigned was set to false in the request',
  `textures` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This is obtained by decoding the \&quot;textures\&quot; property';

--
-- Table structure for table `PlayerSkinMetadata` generated from model 'PlayerSkinMetadata'
-- Contains details about the skin
--

CREATE TABLE IF NOT EXISTS `PlayerSkinMetadata` (
  `model` ENUM('slim') DEFAULT NULL COMMENT 'The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains details about the skin';

--
-- Table structure for table `PlayerSkinURL` generated from model 'PlayerSkinURL'
-- Wraps the URL to the texture and configures the player&#39;s model
--

CREATE TABLE IF NOT EXISTS `PlayerSkinURL` (
  `url` TEXT NOT NULL COMMENT 'The URL to the texture, must be in Mojang&#39;s domains.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Wraps the URL to the texture and configures the player&#39;s model';

--
-- Table structure for table `PlayerTexture` generated from model 'PlayerTexture'
-- Provide links to the player&#39;s skin and cape
--

CREATE TABLE IF NOT EXISTS `PlayerTexture` (
  `SKIN` TEXT DEFAULT NULL,
  `CAPE` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Provide links to the player&#39;s skin and cape';

--
-- Table structure for table `PlayerTextureURL` generated from model 'PlayerTextureURL'
-- Wraps the URL to the texture
--

CREATE TABLE IF NOT EXISTS `PlayerTextureURL` (
  `url` TEXT NOT NULL COMMENT 'The URL to the texture, must be in Mojang&#39;s domains.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Wraps the URL to the texture';

--
-- Table structure for table `SessionApiError` generated from model 'SessionApiError'
-- An object describing giving a bit of information about the error
--

CREATE TABLE IF NOT EXISTS `SessionApiError` (
  `error` TEXT DEFAULT NULL COMMENT 'A message describing the error',
  `path` TEXT DEFAULT NULL COMMENT 'The request path'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object describing giving a bit of information about the error';

