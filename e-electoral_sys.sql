-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 22, 2017 at 07:03 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `e-electoral_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE IF NOT EXISTS `student_details` (
  `EnrollmentNo` varchar(13) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `FName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `YearOfJoining` year(4) NOT NULL,
  `YearOfPassing` year(4) NOT NULL,
  `CurrentYear` int(4) NOT NULL,
  `Branch` varchar(50) NOT NULL,
  `Mobile` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`EnrollmentNo`),
  UNIQUE KEY `Mobile` (`Mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`EnrollmentNo`, `Name`, `FName`, `DOB`, `YearOfJoining`, `YearOfPassing`, `CurrentYear`, `Branch`, `Mobile`, `Email`, `Password`) VALUES
('0801ce141025', 'Chetan', 'Suresh', '1995-02-18', 2014, 2018, 3, 'CE', '8745647891', 'chetan@g.com', 'abc1234'),
('0801ee141002', 'Akash', 'Rajesh', '1996-05-24', 2014, 2018, 3, 'EE', '8981234561', 'akash@hotmail.com', 'abc123'),
('0801IT141007', 'Raju Rastogi', 'Cheluram Rastogi', '1996-09-14', 2014, 2018, 3, 'Information Technology', '9898945672', 'raju@gmail.com', 'abc12345');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
