-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2018 at 03:24 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `resto`
--

-- --------------------------------------------------------

--
-- Table structure for table `order1`
--

CREATE TABLE IF NOT EXISTS `order1` (
  `nopesan` int(5) NOT NULL,
  `namal` varchar(60) DEFAULT NULL,
  `kodemeja` varchar(30) DEFAULT NULL,
  `pesanmenu` text,
  `hargatot` int(12) DEFAULT NULL,
  PRIMARY KEY (`nopesan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order1`
--

INSERT INTO `order1` (`nopesan`, `namal`, `kodemeja`, `pesanmenu`, `hargatot`) VALUES
(1, 'Paus Pas', 'M202', 'Nasi Goreng', 36000),
(2, 'Hmm', 'A129', 'Mie Kuah', 20000),
(3, 'Paus', 'D102', 'Mie Goreng', 24000),
(4, 'Hmm2', 'H102', 'Nasi Goreng Pedas', 24000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
