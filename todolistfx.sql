-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 08 oct. 2024 à 12:16
-- Version du serveur : 8.3.0
-- Version de PHP : 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `todolistfx`
--

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_utilisateur` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `prenom` varchar(255) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `mdp` varchar(255) COLLATE utf8mb4_0900_as_ci NOT NULL,
  PRIMARY KEY (`id_utilisateur`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_utilisateur`, `nom`, `prenom`, `email`, `mdp`) VALUES
(1, 'samy', 'samy', 'ismail.scy@gmail.com', 'aze'),
(2, 'tes', 'test', 'test@gmail.com', 'test'),
(3, 'testtt', 'test', 'testt@gmail.com', 'test'),
(4, 'testtt', 'test', 'testtt@gmail.com', 'test'),
(5, 'testtt', 'test', 'testtttttt@gmail.com', 'test'),
(6, 'Gueganic', 'Erwan', 'erwan.gueanic@gmail.com', 'aze'),
(7, 'test', 'sam', 'abdelmalek@lprs.Fr', '$2a$10$cKwkbjh9x/syidSeh47d8OxHzE314cPIUbFX.NTIrxQCYkfA/21Qq'),
(8, 'abdelmalek', 'samy', 's.abdelmalek@lprs.fr', '$2a$10$l100LKLF01V8zTn3kUz20es2r36ooBuLz8LQOk46VI.9FPnpkJovW');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
