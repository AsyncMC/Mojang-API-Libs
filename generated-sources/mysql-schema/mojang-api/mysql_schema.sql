/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `CurrentPlayerIDs` generated from model 'CurrentPlayerIDs'
-- The current player, demo and legacy status of a player identified by the id
--

CREATE TABLE IF NOT EXISTS `CurrentPlayerIDs` (
  `id` TEXT NOT NULL COMMENT 'The player UUID without hyphens',
  `name` TEXT NOT NULL COMMENT 'The current name being used by this player',
  `legacy` TINYINT(1) DEFAULT false COMMENT 'If account has not been converted',
  `demo` TINYINT(1) DEFAULT false COMMENT 'If the player has not puchased the game'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The current player, demo and legacy status of a player identified by the id';

--
-- Table structure for table `Error` generated from model 'Error'
-- This is returned when the request fails
--

CREATE TABLE IF NOT EXISTS `Error` (
  `error` TEXT DEFAULT NULL,
  `errorMessage` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This is returned when the request fails';

--
-- Table structure for table `inline_object` generated from model 'inlineUnderscoreobject'
--

CREATE TABLE IF NOT EXISTS `inline_object` (
  `model` TEXT DEFAULT NULL,
  `file` MEDIUMBLOB NOT NULL COMMENT 'The skin image in PNG format'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_1` generated from model 'inlineUnderscoreobjectUnderscore1'
-- Request Mojang to download a skin from an URL and apply to the player
--

CREATE TABLE IF NOT EXISTS `inline_object_1` (
  `model` TEXT DEFAULT NULL,
  `url` TEXT NOT NULL COMMENT 'The URL which Mojang servers will download and apply the skin'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request Mojang to download a skin from an URL and apply to the player';

--
-- Table structure for table `NameChange` generated from model 'NameChange'
-- A registered name change.
--

CREATE TABLE IF NOT EXISTS `NameChange` (
  `name` TEXT NOT NULL COMMENT 'The new player name',
  `changedToAt` BIGINT DEFAULT NULL COMMENT 'Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A registered name change.';

--
-- Table structure for table `OrderStatisticsRequest` generated from model 'OrderStatisticsRequest'
-- The body of the request to get the order statistics
--

CREATE TABLE IF NOT EXISTS `OrderStatisticsRequest` (
  `metricKeys` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The body of the request to get the order statistics';

--
-- Table structure for table `OrderStatisticsResponse` generated from model 'OrderStatisticsResponse'
-- A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
--

CREATE TABLE IF NOT EXISTS `OrderStatisticsResponse` (
  `total` BIGINT NOT NULL COMMENT 'total amount sold',
  `last24h` BIGINT NOT NULL COMMENT 'total sold in last 24 hours',
  `saleVelocityPerSeconds` DECIMAL(20, 9) NOT NULL COMMENT 'decimal average sales per second'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.';

--
-- Table structure for table `SecurityAnswer` generated from model 'SecurityAnswer'
-- A security question answer given by the player using the id given by Mojang
--

CREATE TABLE IF NOT EXISTS `SecurityAnswer` (
  `id` INT NOT NULL COMMENT 'A number giver by Mojang to reply a question'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A security question answer given by the player using the id given by Mojang';

--
-- Table structure for table `SecurityAnswerId` generated from model 'SecurityAnswerId'
-- A security question answer id given by Mojang
--

CREATE TABLE IF NOT EXISTS `SecurityAnswerId` (
  `id` INT NOT NULL COMMENT 'A number giver by Mojang to reply a question'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A security question answer id given by Mojang';

--
-- Table structure for table `SecurityChallenge` generated from model 'SecurityChallenge'
-- Binds a question to an answer id, the answer must respect the answer id.
--

CREATE TABLE IF NOT EXISTS `SecurityChallenge` (
  `question` TEXT NOT NULL,
  `answer` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Binds a question to an answer id, the answer must respect the answer id.';

--
-- Table structure for table `SecurityQuestion` generated from model 'SecurityQuestion'
-- A security question requested by Mojang
--

CREATE TABLE IF NOT EXISTS `SecurityQuestion` (
  `id` INT NOT NULL COMMENT 'The possible IDs are these:   1  What is your favorite pet&#39;s name?   2  What is your favorite movie?   3  What is your favorite author&#39;s last name?   4  What is your favorite artist&#39;s last name?   5  What is your favorite actor&#39;s last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend&#39;s first name?   12 What is your favorite cousin&#39;s name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother&#39;s middle name?   16 What is your father&#39;s middle name?   17 What is your oldest sibling&#39;s middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother&#39;s first name?   32 What is your grandfather&#39;s first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?',
  `question` TEXT NOT NULL COMMENT 'The question itself'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A security question requested by Mojang';

