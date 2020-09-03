-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2020 at 10:59 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `redngreenchillijava`
--

-- --------------------------------------------------------

--
-- Table structure for table `deliverydetails`
--

CREATE TABLE `deliverydetails` (
  `Delivery_Id` int(11) NOT NULL,
  `Customer` varchar(40) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `Charges` float DEFAULT NULL,
  `Address` varchar(120) DEFAULT NULL,
  `DeliveryBoy` varchar(40) DEFAULT NULL,
  `Remarks` varchar(50) DEFAULT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `deliverydetails`
--

INSERT INTO `deliverydetails` (`Delivery_Id`, `Customer`, `Phone`, `Charges`, `Address`, `DeliveryBoy`, `Remarks`, `OrderId`) VALUES
(1, '', '', 0, '', 'Mubashir Hussain Tunio', '', 10),
(2, 'techSam', '03030303', 0, 'xyz', 'Mubashir Hussain Tunio', '', 24);

-- --------------------------------------------------------

--
-- Table structure for table `deliverydetailsdeleted`
--

CREATE TABLE `deliverydetailsdeleted` (
  `Delivery_Id` int(11) NOT NULL,
  `Customer` varchar(40) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `Charges` float DEFAULT NULL,
  `Address` varchar(120) DEFAULT NULL,
  `DeliveryBoy` varchar(40) DEFAULT NULL,
  `Remarks` varchar(50) DEFAULT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `deliverydetailsdeleted`
--

INSERT INTO `deliverydetailsdeleted` (`Delivery_Id`, `Customer`, `Phone`, `Charges`, `Address`, `DeliveryBoy`, `Remarks`, `OrderId`) VALUES
(1, '', '', 0, '', 'Mubashir Hussain Tunio', '', 25);

-- --------------------------------------------------------

--
-- Table structure for table `diningdetails`
--

CREATE TABLE `diningdetails` (
  `Dining_Id` int(11) NOT NULL,
  `TableNo` varchar(15) DEFAULT NULL,
  `Waiter` varchar(30) DEFAULT NULL,
  `Charges` float DEFAULT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diningdetails`
--

INSERT INTO `diningdetails` (`Dining_Id`, `TableNo`, `Waiter`, `Charges`, `OrderId`) VALUES
(1, 'H1', 'Select waiter', 0, 2),
(2, 'A1', 'Select waiter', 0, 3),
(3, 'A1', 'Select waiter', 0, 4),
(4, 'A1', 'Select waiter', 0, 5),
(5, 'A1', 'Select waiter', 0, 6),
(6, 'A1', 'Select waiter', 0, 7),
(7, 'A1', 'Select waiter', 0, 8),
(8, 'A1', 'Select waiter', 0, 11),
(9, 'A1', 'Select waiter', 0, 13),
(10, 'C1', 'Ali Akbar  Boohar', 0, 21),
(11, 'C1', 'Ali Akbar  Boohar', 0, 22),
(13, 'A2', 'Ali Akbar  Boohar', 0, 27),
(14, 'A1', 'Select waiter', 0, 28);

-- --------------------------------------------------------

--
-- Table structure for table `diningdetailsdeleted`
--

CREATE TABLE `diningdetailsdeleted` (
  `Dining_Id` int(11) NOT NULL,
  `TableNo` varchar(15) DEFAULT NULL,
  `Waiter` varchar(30) DEFAULT NULL,
  `Charges` varchar(11) DEFAULT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diningdetailsdeleted`
--

INSERT INTO `diningdetailsdeleted` (`Dining_Id`, `TableNo`, `Waiter`, `Charges`, `OrderId`) VALUES
(1, 'C1', 'Ali Akbar  Boohar', '0', 23);

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

CREATE TABLE `expenses` (
  `Exp_Id` int(11) NOT NULL,
  `Expense` varchar(100) NOT NULL,
  `Date` date DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `Amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`Exp_Id`, `Expense`, `Date`, `Description`, `Amount`) VALUES
(1, 'chai', '2020-03-01', 'etc', 5555);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `ItemId` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Rate` varchar(11) DEFAULT NULL,
  `MembershipRate` varchar(11) DEFAULT NULL,
  `Category` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`ItemId`, `Name`, `Rate`, `MembershipRate`, `Category`) VALUES
(266, 'Cafe Tonight Special Roll', '150', '', 'Rolls'),
(270, 'JAMBO ZINGER', '210', '', 'Burgers'),
(271, 'ZINGER BURGER', '170', '', 'Burgers'),
(272, 'CRUNCH BURGER', '130', '', 'Burgers'),
(273, 'VEG: BURGER', '100', '', 'Burgers'),
(274, 'CH. SUB-BURGER', '140', '', 'Burgers'),
(275, 'PIZZA ROLL', '140', '', 'Rolls'),
(276, 'CREAM ROLL', '140', '', 'Rolls'),
(277, 'MALAI ROLL', '140', '', 'Rolls'),
(278, 'CHEESE ROLL', '130', '', 'Rolls'),
(279, 'BEHARI ROLL', '130', '', 'Rolls'),
(280, 'ZINGER ROLL', '130', '', 'Rolls'),
(281, 'CHATNI ROLL', '120', '', 'Rolls'),
(282, 'KABAB ROLL', '120', '', 'Rolls'),
(283, 'MAYOGARLIC ROLL', '120', '', 'Rolls'),
(284, 'CH: SHSTAO ROLL', '120', '', 'Rolls'),
(285, 'SPECIAL ROLL', '120', '', 'Rolls'),
(286, 'VER: ROLL', '100', '', 'Rolls'),
(287, 'CH: WINGS-10pcs', '250', '', 'Rolls'),
(288, 'POPCORN CH.', '150', '', 'Rolls'),
(290, 'HOT SHOTS-1Opcs', '250', '', 'Rolls'),
(291, 'FISH BAR BQ SP:', '999', '', 'BBQ'),
(292, 'CH. BROAST', '180', '', 'BBQ'),
(293, 'GOLA KABAB', '130', '', 'BBQ'),
(294, 'RESHMI KABAB', '140', '', 'BBQ'),
(295, 'VEG KABAB', '140', '', 'BBQ'),
(296, 'CHICKEN TIKKA', '140', '', 'BBQ'),
(297, 'ACHARI TIKKA', '170', '', 'BBQ'),
(298, 'MALAI TIKKA', '170', '', 'BBQ'),
(299, 'BEHARI TIKO', '170', '', 'BBQ'),
(300, 'CH: GREEN TIKO', '160', '', 'BBQ'),
(301, 'ACHARI BOOTI', '150', '', 'BBQ'),
(302, 'MALAI BOTI', '140', '', 'BBQ'),
(303, 'BEHARI BOTI', '130', '', 'BBQ'),
(304, 'CH: BOOTI', '140', '', 'BBQ'),
(305, 'RANGEEN BOOTI SP:', '140', '', 'BBQ'),
(306, 'KALMI BOOTI SP:', '150', '', 'BBQ'),
(307, 'CH: SHISTAO BOTI', '130', '', 'BBQ'),
(308, 'GREEN BOOTI', '140', '', 'BBQ'),
(309, 'HALF PLATTER', '700', '', 'BBQ'),
(310, 'TIKKA SANDWICH', '150', '', 'BBQ'),
(311, 'CH. SANDWICH', '150', '', 'BBQ'),
(312, 'VEG. SANDWICH', '130', '', 'BBQ'),
(313, 'MASALA FRIES', '70', '', 'Fries'),
(314, 'TORNADO FRIES', '50', '', 'Fries'),
(315, 'PIZZA FRIES', '50', '', 'Fries'),
(316, 'FISH FRIES PER KG', '800', '', 'Fries'),
(317, 'CRUNCHY PC(4)', '280', '', 'Fries'),
(318, 'CRISPY FRIES', '90', '', 'Fries'),
(319, 'REGULAR', '80', '', 'Other'),
(320, 'SPECIAL', '100', '', 'Other'),
(321, 'VEGETABLE', '80', '', 'Other'),
(322, 'SPECIAL CHAI', '150', '', 'Other2'),
(323, 'COFFEE', '80', '', 'Other2'),
(324, 'CHAI', '40', '', 'Other2'),
(325, 'GREEN TEA', '40', '', 'Other2'),
(326, 'CHOCOLATE CHAI', '60', '', 'Other2'),
(327, 'DRY FRUIT CHAI', '100', '', 'Other2'),
(328, 'GUD CHAI', '50', '', 'Other2'),
(329, 'MATKA CHAI', '50', '', 'Other2'),
(330, 'MATKA DRY FRUIT CHAI', '130', '', 'Other2'),
(331, 'MATKA GUD CHAI', '90', '', 'Other2'),
(354, 'Fajita', '800', '', 'LargePizza'),
(355, 'pepsi', '67', '', 'Beverages'),
(356, 'ooo', '34', '', 'Deals'),
(357, 'sdf', '43', '', 'FastFood'),
(358, 'NUGGETS - 08pcs', '250', '', 'Rolls');

-- --------------------------------------------------------

--
-- Table structure for table `logdetails`
--

CREATE TABLE `logdetails` (
  `LogId` int(11) NOT NULL,
  `Username` varchar(40) NOT NULL,
  `LogDate` date NOT NULL,
  `LogTime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logdetails`
--

INSERT INTO `logdetails` (`LogId`, `Username`, `LogDate`, `LogTime`) VALUES
(1, 'admin', '2020-03-03', '16:17:02'),
(2, 'admin', '2020-03-03', '16:20:37'),
(3, 'admin', '2020-03-04', '18:25:14'),
(4, 'admin', '2020-03-04', '18:25:29'),
(5, 'admin', '2020-03-04', '22:46:53'),
(6, 'admin', '2020-03-01', '22:47:56'),
(7, 'admin', '2020-02-29', '22:48:31'),
(8, 'admin', '2020-02-28', '22:48:59'),
(9, 'admin', '2020-02-27', '22:49:25'),
(10, 'admin', '2020-03-04', '22:49:51'),
(11, 'admin', '2020-03-02', '22:50:12'),
(12, 'admin', '2020-03-01', '22:50:36'),
(13, 'admin', '2020-03-04', '22:51:56'),
(14, 'admin', '2020-03-05', '18:52:04'),
(15, 'admin', '2020-03-07', '13:30:19'),
(16, 'admin', '2020-03-07', '14:27:58');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Login_Id` int(11) NOT NULL,
  `Title` varchar(15) DEFAULT NULL,
  `Name` varchar(20) NOT NULL,
  `Cell` varchar(20) DEFAULT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Security_Answer` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Login table';

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Login_Id`, `Title`, `Name`, `Cell`, `Email`, `Username`, `Password`, `Security_Answer`) VALUES
(1, 'Mr', 'Abdul Sami', '03053729551', 'thesamishaikh@gmail.com', 'admin', '123', NULL),
(7, NULL, 'Waseem Kifayat', NULL, NULL, 'waseem', '123', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `logoutdetails`
--

CREATE TABLE `logoutdetails` (
  `LogId` int(11) NOT NULL,
  `Username` varchar(40) NOT NULL,
  `LogOutDate` date NOT NULL,
  `LogOutTime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logoutdetails`
--

INSERT INTO `logoutdetails` (`LogId`, `Username`, `LogOutDate`, `LogOutTime`) VALUES
(1, 'admin', '2020-03-04', '18:25:19'),
(2, 'admin', '2020-03-04', '22:47:35');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `M_Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Contact` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `CardNo` int(11) NOT NULL,
  `Remarks` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`M_Id`, `Name`, `Contact`, `Address`, `CardNo`, `Remarks`) VALUES
(8, 'Asadullah', '0303-0303030', 'Govt. Municipal School Larkana', 321, ''),
(9, 'Abdul Sami Shaikh', '0305-3729551', 'Nazar Muhalla Larkana', 301, ''),
(11, 'Ali Akbar Boohar', '0303-5646546', 'Nazar Muhalla Larkana', 302, '');

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `Membership_Id` int(11) NOT NULL,
  `M_Id` int(11) NOT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `riders`
--

CREATE TABLE `riders` (
  `Rider_Id` int(11) NOT NULL,
  `Firstname` varchar(30) NOT NULL,
  `Lastname` varchar(30) DEFAULT NULL,
  `Cell` varchar(15) DEFAULT NULL,
  `CNIC` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `riders`
--

INSERT INTO `riders` (`Rider_Id`, `Firstname`, `Lastname`, `Cell`, `CNIC`, `Address`, `Description`) VALUES
(8, 'Mubashir Hussain', 'Tunio', '0305-3729551', '43203-9999999-9', 'Sachal Colony Larkana', ''),
(9, 'Arsalan', 'Sangi', '0305-3729551', '43203-9999999-9', 'Lahori Muhalla Larkana', '');

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `OrderId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `Total` float NOT NULL,
  `discount` int(11) DEFAULT NULL,
  `Subtotal` float DEFAULT NULL,
  `SaleDate` date NOT NULL,
  `SaleTime` time NOT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `SaleCategory` varchar(20) NOT NULL,
  `LogId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`OrderId`, `ItemsQty`, `Total`, `discount`, `Subtotal`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES
(1, 3, 360, 0, 360, '2020-03-03', '16:17:20', '', 'TakeAway', 1),
(6, 1, 150, 0, 150, '2020-03-03', '16:24:25', '', 'DineIn', 0),
(8, 1, 150, 0, 150, '2020-03-03', '16:25:25', '', 'DineIn', 0),
(9, 1, 150, 0, 150, '2020-03-03', '16:25:41', '', 'TakeAway', 0),
(10, 1, 150, 0, 150, '2020-03-03', '16:26:12', '', 'Home Delivery', 0),
(14, 5, 790, 0, 790, '2020-03-04', '22:48:12', '', 'TakeAway', 6),
(15, 2, 310, 0, 310, '2020-02-29', '22:48:40', '', 'TakeAway', 7),
(16, 4, 660, 0, 660, '2020-02-28', '22:49:08', '', 'TakeAway', 8),
(17, 3, 540, 0, 540, '2020-02-27', '22:49:33', '', 'TakeAway', 9),
(18, 3, 420, 0, 420, '2020-03-02', '22:50:21', '', 'TakeAway', 11),
(19, 3, 530, 0, 530, '2020-03-01', '22:50:43', '', 'TakeAway', 12),
(20, 6, 1450, 50, 725, '2020-03-05', '18:53:57', '', 'TakeAway', 14),
(21, 4, 580, 0, 580, '2020-03-05', '18:55:45', '', 'DineIn', 14),
(22, 3, 380, 0, 380, '2020-03-05', '18:56:20', '', 'DineIn', 14),
(26, 4, 570, 30, 399, '2020-03-07', '13:30:53', '', 'TakeAway', 15);

-- --------------------------------------------------------

--
-- Table structure for table `saledeleted`
--

CREATE TABLE `saledeleted` (
  `DeleteId` int(11) NOT NULL,
  `OrderId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `Total` float NOT NULL,
  `discount` int(11) DEFAULT NULL,
  `Subtotal` float DEFAULT NULL,
  `SaleDate` date NOT NULL,
  `SaleTime` time NOT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `SaleCategory` varchar(20) NOT NULL,
  `LogId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `saledeleted`
--

INSERT INTO `saledeleted` (`DeleteId`, `OrderId`, `ItemsQty`, `Total`, `discount`, `Subtotal`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES
(1, 3, 6, 1699, 0, 1699, '2020-03-03', '16:21:50', '', 'DineIn', 13),
(2, 5, 15, 1540, 0, 1540, '2020-03-03', '16:22:55', '', 'DineIn', 13),
(3, 7, 3, 520, 0, 520, '2020-03-03', '16:24:46', '', 'DineIn', 13),
(4, 4, 3, 460, 0, 460, '2020-03-03', '16:22:17', '', 'DineIn', 13),
(5, 2, 4, 440, 0, 440, '2020-03-03', '16:18:37', '', 'DineIn', 13),
(6, 12, 3, 1299, 0, 1299, '2020-03-04', '18:26:01', '', 'TakeAway', 13),
(7, 13, 3, 240, 0, 240, '2020-03-04', '22:47:10', '', 'DineIn', 13),
(8, 11, 4, 610, 0, 610, '2020-03-03', '16:26:31', '', 'DineIn', 13),
(9, 24, 1, 150, 0, 150, '2020-03-05', '18:57:36', '', 'Home Delivery', 14),
(10, 27, 2, 280, 0, 280, '2020-03-07', '13:31:27', '', 'DineIn', 0),
(11, 28, 6, 840, 0, 840, '2020-03-07', '14:28:10', '', 'DineIn', 16),
(12, 25, 3, 480, 0, 480, '2020-03-05', '18:57:55', '', 'Home Delivery', 0),
(13, 23, 3, 1309, 0, 1309, '2020-03-05', '18:56:36', '', 'DineIn', 0);

-- --------------------------------------------------------

--
-- Table structure for table `solditems`
--

CREATE TABLE `solditems` (
  `Sale_Id` int(11) NOT NULL,
  `ItemId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `solditems`
--

INSERT INTO `solditems` (`Sale_Id`, `ItemId`, `ItemsQty`, `OrderId`) VALUES
(30, 266, 1, 6),
(34, 266, 1, 8),
(35, 266, 1, 9),
(36, 266, 1, 10),
(48, 266, 1, 14),
(54, 266, 1, 16),
(58, 266, 1, 17),
(63, 266, 1, 18),
(65, 266, 1, 19),
(86, 266, 2, 26),
(73, 270, 1, 21),
(72, 272, 1, 21),
(74, 273, 1, 21),
(71, 274, 1, 21),
(67, 274, 3, 20),
(51, 275, 1, 14),
(59, 276, 1, 17),
(62, 276, 1, 18),
(76, 276, 1, 22),
(87, 276, 1, 26),
(57, 277, 1, 16),
(61, 278, 1, 18),
(47, 279, 1, 14),
(64, 279, 1, 19),
(85, 279, 1, 26),
(2, 281, 1, 1),
(3, 283, 1, 1),
(50, 283, 1, 14),
(56, 283, 1, 16),
(77, 283, 1, 22),
(1, 284, 1, 1),
(75, 284, 1, 22),
(49, 290, 1, 14),
(55, 290, 1, 16),
(60, 290, 1, 17),
(66, 290, 1, 19),
(52, 292, 1, 15),
(53, 293, 1, 15),
(69, 327, 1, 20),
(70, 330, 1, 20),
(68, 354, 1, 20);

-- --------------------------------------------------------

--
-- Table structure for table `solditemsdeleted`
--

CREATE TABLE `solditemsdeleted` (
  `SaleDeleted_Id` int(11) NOT NULL,
  `ItemId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `solditemsdeleted`
--

INSERT INTO `solditemsdeleted` (`SaleDeleted_Id`, `ItemId`, `ItemsQty`, `OrderId`) VALUES
(21, 266, 1, 7),
(40, 266, 1, 24),
(42, 266, 1, 27),
(8, 270, 1, 5),
(45, 270, 1, 25),
(20, 271, 1, 5),
(9, 272, 1, 5),
(46, 272, 1, 25),
(28, 272, 2, 2),
(7, 273, 1, 5),
(27, 274, 1, 2),
(10, 274, 1, 5),
(44, 274, 1, 25),
(43, 274, 6, 28),
(41, 279, 1, 27),
(22, 284, 1, 7),
(23, 287, 1, 7),
(5, 291, 1, 3),
(32, 291, 1, 12),
(49, 291, 1, 23),
(3, 293, 1, 3),
(31, 293, 1, 12),
(25, 297, 1, 4),
(37, 297, 1, 11),
(30, 297, 1, 12),
(47, 297, 1, 23),
(2, 300, 1, 3),
(39, 300, 1, 11),
(24, 301, 1, 4),
(36, 301, 1, 11),
(38, 303, 1, 11),
(1, 303, 2, 3),
(26, 304, 1, 4),
(48, 304, 1, 23),
(4, 311, 1, 3),
(11, 322, 1, 5),
(19, 323, 1, 5),
(34, 323, 1, 13),
(29, 324, 1, 2),
(6, 324, 1, 5),
(13, 325, 1, 5),
(18, 326, 1, 5),
(33, 326, 1, 13),
(17, 327, 1, 5),
(35, 327, 1, 13),
(14, 328, 1, 5),
(15, 329, 1, 5),
(16, 330, 1, 5),
(12, 331, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `waiters`
--

CREATE TABLE `waiters` (
  `W_Id` int(11) NOT NULL,
  `Firstname` varchar(30) NOT NULL,
  `Lastname` varchar(30) DEFAULT NULL,
  `Cell` varchar(15) DEFAULT NULL,
  `CNIC` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `waiters`
--

INSERT INTO `waiters` (`W_Id`, `Firstname`, `Lastname`, `Cell`, `CNIC`, `Address`, `Description`) VALUES
(9, 'Mubashir Hussain', 'Tunio', '0305-3729551', '43203-9999999-9', 'Sachal Colony larkana', ''),
(10, 'Ali Akbar ', 'Boohar', '0305-3729551', '43203-9999999-9', 'Nazar Muhalla Larkana', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deliverydetails`
--
ALTER TABLE `deliverydetails`
  ADD PRIMARY KEY (`Delivery_Id`),
  ADD KEY `OrderId` (`OrderId`),
  ADD KEY `OrderId_2` (`OrderId`);

--
-- Indexes for table `deliverydetailsdeleted`
--
ALTER TABLE `deliverydetailsdeleted`
  ADD PRIMARY KEY (`Delivery_Id`),
  ADD KEY `OrderId` (`OrderId`),
  ADD KEY `OrderId_2` (`OrderId`);

--
-- Indexes for table `diningdetails`
--
ALTER TABLE `diningdetails`
  ADD PRIMARY KEY (`Dining_Id`),
  ADD KEY `OrderId` (`OrderId`);

--
-- Indexes for table `diningdetailsdeleted`
--
ALTER TABLE `diningdetailsdeleted`
  ADD PRIMARY KEY (`Dining_Id`),
  ADD KEY `OrderId` (`OrderId`);

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`Exp_Id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`ItemId`);

--
-- Indexes for table `logdetails`
--
ALTER TABLE `logdetails`
  ADD PRIMARY KEY (`LogId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Login_Id`);

--
-- Indexes for table `logoutdetails`
--
ALTER TABLE `logoutdetails`
  ADD PRIMARY KEY (`LogId`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`M_Id`),
  ADD UNIQUE KEY `CardNo` (`CardNo`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`Membership_Id`),
  ADD KEY `M_Id` (`M_Id`,`OrderId`);

--
-- Indexes for table `riders`
--
ALTER TABLE `riders`
  ADD PRIMARY KEY (`Rider_Id`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`OrderId`),
  ADD KEY `LogId` (`LogId`);

--
-- Indexes for table `saledeleted`
--
ALTER TABLE `saledeleted`
  ADD PRIMARY KEY (`DeleteId`),
  ADD KEY `LogId` (`LogId`);

--
-- Indexes for table `solditems`
--
ALTER TABLE `solditems`
  ADD PRIMARY KEY (`Sale_Id`),
  ADD KEY `ItemId` (`ItemId`,`ItemsQty`,`OrderId`);

--
-- Indexes for table `solditemsdeleted`
--
ALTER TABLE `solditemsdeleted`
  ADD PRIMARY KEY (`SaleDeleted_Id`),
  ADD KEY `ItemId` (`ItemId`,`ItemsQty`,`OrderId`);

--
-- Indexes for table `waiters`
--
ALTER TABLE `waiters`
  ADD PRIMARY KEY (`W_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deliverydetails`
--
ALTER TABLE `deliverydetails`
  MODIFY `Delivery_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `deliverydetailsdeleted`
--
ALTER TABLE `deliverydetailsdeleted`
  MODIFY `Delivery_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `diningdetails`
--
ALTER TABLE `diningdetails`
  MODIFY `Dining_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `diningdetailsdeleted`
--
ALTER TABLE `diningdetailsdeleted`
  MODIFY `Dining_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `Exp_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `ItemId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=360;

--
-- AUTO_INCREMENT for table `logdetails`
--
ALTER TABLE `logdetails`
  MODIFY `LogId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `Login_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `logoutdetails`
--
ALTER TABLE `logoutdetails`
  MODIFY `LogId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `M_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `membership`
--
ALTER TABLE `membership`
  MODIFY `Membership_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `riders`
--
ALTER TABLE `riders`
  MODIFY `Rider_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `OrderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `saledeleted`
--
ALTER TABLE `saledeleted`
  MODIFY `DeleteId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `solditems`
--
ALTER TABLE `solditems`
  MODIFY `Sale_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91;

--
-- AUTO_INCREMENT for table `solditemsdeleted`
--
ALTER TABLE `solditemsdeleted`
  MODIFY `SaleDeleted_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `waiters`
--
ALTER TABLE `waiters`
  MODIFY `W_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
