--
-- Base de données :  `secondmarket`
--
DROP DATABASE `secondmarket`;
CREATE DATABASE IF NOT EXISTS `secondmarket` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `secondmarket`;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `identifiant` varchar(55) NOT NULL,
  `motdepasse` varchar(55) NOT NULL,
  `email` varchar(55) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `identifiant` (`identifiant`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=0 ;