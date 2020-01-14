-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 01:06 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `minuman`
--

-- --------------------------------------------------------

--
-- Table structure for table `minuman_dingin`
--

CREATE TABLE `minuman_dingin` (
  `Id_minuman` int(8) NOT NULL,
  `Nama_perusahaan` varchar(25) NOT NULL,
  `Nama_minuman` varchar(20) NOT NULL,
  `Jenis_minuman` varchar(20) NOT NULL,
  `Rasa` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `minuman_dingin`
--

INSERT INTO `minuman_dingin` (`Id_minuman`, `Nama_perusahaan`, `Nama_minuman`, `Jenis_minuman`, `Rasa`) VALUES
(1, 'coca-cola', 'sprite', 'cair', 'lemon'),
(2, 'graudafood', 'jelly drink', 'jelly', 'oreo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `minuman_dingin`
--
ALTER TABLE `minuman_dingin`
  ADD PRIMARY KEY (`Id_minuman`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
