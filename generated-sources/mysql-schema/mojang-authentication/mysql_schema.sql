/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AccessKeys` generated from model 'AccessKeys'
--

CREATE TABLE IF NOT EXISTS `AccessKeys` (
  `accessToken` TEXT NOT NULL,
  `clientToken` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Agent` generated from model 'Agent'
-- Identifies the software doing the request
--

CREATE TABLE IF NOT EXISTS `Agent` (
  `name` ENUM('Minecraft', 'Scrolls') DEFAULT 'Minecraft' COMMENT 'The name of the game',
  `version` INT DEFAULT 1 COMMENT 'The agent version, usually 1.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Identifies the software doing the request';

--
-- Table structure for table `Authentication` generated from model 'Authentication'
--

CREATE TABLE IF NOT EXISTS `Authentication` (
  `accessToken` TEXT NOT NULL,
  `clientToken` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuthenticationRequest` generated from model 'AuthenticationRequest'
-- Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
--

CREATE TABLE IF NOT EXISTS `AuthenticationRequest` (
  `username` TEXT NOT NULL COMMENT 'The Mojang account e-mail or username. Never store it.',
  `password` TEXT NOT NULL COMMENT 'The Mojang account password, never store it.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.';

--
-- Table structure for table `Error` generated from model 'Error'
-- This is returned when the request fails
--

CREATE TABLE IF NOT EXISTS `Error` (
  `error` TEXT DEFAULT NULL,
  `errorMessage` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This is returned when the request fails';

--
-- Table structure for table `GameProfile` generated from model 'GameProfile'
--

CREATE TABLE IF NOT EXISTS `GameProfile` (
  `agent` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `userId` MEDIUMBLOB DEFAULT NULL,
  `createdAt` BIGINT DEFAULT NULL COMMENT 'Unix timestamp in milliseconds',
  `legacyProfile` TINYINT(1) DEFAULT NULL,
  `suspended` TINYINT(1) DEFAULT NULL,
  `paid` TINYINT(1) DEFAULT NULL,
  `migrated` TINYINT(1) DEFAULT NULL,
  `legacy` TINYINT(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GameProfileProperty` generated from model 'GameProfileProperty'
--

CREATE TABLE IF NOT EXISTS `GameProfileProperty` (
  `name` TEXT DEFAULT NULL,
  `value` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PrivateUserData` generated from model 'PrivateUserData'
--

CREATE TABLE IF NOT EXISTS `PrivateUserData` (
  `id` MEDIUMBLOB DEFAULT NULL,
  `properties` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProfileId` generated from model 'ProfileId'
--

CREATE TABLE IF NOT EXISTS `ProfileId` (
  `id` TEXT NOT NULL,
  `name` TEXT NOT NULL COMMENT 'The player name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ReducedUserData` generated from model 'ReducedUserData'
--

CREATE TABLE IF NOT EXISTS `ReducedUserData` (
  `id` MEDIUMBLOB DEFAULT NULL,
  `properties` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RefreshRequest` generated from model 'RefreshRequest'
--

CREATE TABLE IF NOT EXISTS `RefreshRequest` (
  `accessToken` TEXT NOT NULL,
  `clientToken` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RefreshResponse` generated from model 'RefreshResponse'
--

CREATE TABLE IF NOT EXISTS `RefreshResponse` (
  `accessToken` TEXT NOT NULL,
  `clientToken` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UsernamePassword` generated from model 'UsernamePassword'
--

CREATE TABLE IF NOT EXISTS `UsernamePassword` (
  `username` TEXT NOT NULL COMMENT 'The Mojang account e-mail or username. Never store it.',
  `password` TEXT NOT NULL COMMENT 'The Mojang account password, never store it.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

