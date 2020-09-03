-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 16, 2020 at 01:13 PM
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
(2, 'sami', '03403403', 30, '', 'Mubashir Hussain', '', 77),
(3, '', '', 0, '', 'Mubashir Hussain', '', 80);

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
(12, 'A2', 'Mubashir Hussain Tunio', 0, 76),
(13, 'A1', 'Mubashir Hussain Tunio', 0, 79),
(14, 'A1', 'Mubashir Hussain Tunio', 0, 82),
(15, 'A1', 'Mubashir Hussain Tunio', 30, 84),
(16, 'A1', 'Mubashir Hussain Tunio', 30, 85);

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
(289, 'NUGGETS-08pcs', '250', '', 'Rolls'),
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
(331, 'MATKA GUD CHAI', '90', '', 'Other2');

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
(50, 'admin', '2020-02-16', '16:24:05'),
(51, 'admin', '2020-02-16', '16:54:47');

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
(1, 'No User', '2020-02-12', '00:16:56');

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
(3, 'Mubashir', 'Hussain', '    -       ', '     -       - ', '', ''),
(4, 'Manesh', 'Kumar', '    -       ', '     -       - ', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `OrderId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `discount` int(11) DEFAULT NULL,
  `Subtotal` float DEFAULT NULL,
  `Total` float NOT NULL,
  `SaleDate` date NOT NULL,
  `SaleTime` time NOT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `SaleCategory` varchar(20) NOT NULL,
  `LogId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`OrderId`, `ItemsQty`, `discount`, `Subtotal`, `Total`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES
(75, 4, 10, 486, 540, '2020-02-16', '16:24:42', '', 'TakeAway', 50),
(76, 3, 50, 185, 370, '2020-02-16', '16:24:42', '', 'DineIn', 50),
(77, 3, 50, 240, 480, '2020-02-16', '16:24:42', '', 'Home Delivery', 50),
(78, 2, 50, 150, 300, '2020-02-16', '16:55:28', '', 'TakeAway', 51),
(79, 3, 0, 400, 400, '2020-02-16', '16:55:28', '', 'DineIn', 51),
(80, 2, 0, 180, 180, '2020-02-16', '16:55:28', '', 'Home Delivery', 51),
(81, 2, 0, 160, 160, '2020-02-16', '17:03:21', '', 'TakeAway', 0),
(82, 2, 50, 45, 90, '2020-02-16', '17:03:21', '', 'DineIn', 0),
(83, 2, 50, 55, 110, '2020-02-16', '17:04:58', '', 'TakeAway', 0),
(84, 1, 50, 30, 60, '2020-02-16', '17:04:58', '', 'DineIn', 0),
(85, 1, 50, 30, 60, '2020-02-16', '17:12:00', '', 'DineIn', 0);

-- --------------------------------------------------------

--
-- Table structure for table `saledeleted`
--

CREATE TABLE `saledeleted` (
  `DeleteId` int(11) NOT NULL,
  `OrderId` int(11) NOT NULL,
  `ItemsQty` int(11) NOT NULL,
  `Total` float NOT NULL,
  `SaleDate` date NOT NULL,
  `SaleTime` time NOT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `SaleCategory` varchar(20) NOT NULL,
  `LogId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
(158, 270, 1, 77),
(152, 271, 1, 75),
(150, 272, 1, 75),
(154, 272, 1, 76),
(157, 272, 1, 77),
(151, 273, 1, 75),
(155, 273, 1, 76),
(149, 274, 1, 75),
(153, 274, 1, 76),
(156, 274, 1, 77),
(160, 293, 1, 78),
(159, 297, 1, 78),
(163, 313, 1, 79),
(162, 314, 1, 79),
(161, 317, 1, 79),
(166, 319, 1, 81),
(164, 320, 1, 80),
(165, 321, 1, 80),
(167, 321, 1, 81),
(168, 324, 1, 82),
(170, 326, 1, 83),
(172, 326, 1, 84),
(173, 326, 1, 85),
(169, 328, 1, 82),
(171, 329, 1, 83);

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
(3, 'Mubashir Hussain', 'Tunio', '0306-5565564', '54564-5616456-4', '	nazar', ''),
(5, 'Ali Akbar', 'Boohar', '    -       ', '     -       - ', '', ''),
(6, 'Jazib', 'Abro', '0305-3729551', '     -       - ', '', ''),
(7, 'Atta', 'Solangi', '    -       ', '     -       - ', '', '');

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
  MODIFY `Delivery_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `diningdetails`
--
ALTER TABLE `diningdetails`
  MODIFY `Dining_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `diningdetailsdeleted`
--
ALTER TABLE `diningdetailsdeleted`
  MODIFY `Dining_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `Exp_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `ItemId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=332;

--
-- AUTO_INCREMENT for table `logdetails`
--
ALTER TABLE `logdetails`
  MODIFY `LogId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `Login_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `logoutdetails`
--
ALTER TABLE `logoutdetails`
  MODIFY `LogId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
  MODIFY `Rider_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `OrderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT for table `saledeleted`
--
ALTER TABLE `saledeleted`
  MODIFY `DeleteId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `solditems`
--
ALTER TABLE `solditems`
  MODIFY `Sale_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=174;

--
-- AUTO_INCREMENT for table `solditemsdeleted`
--
ALTER TABLE `solditemsdeleted`
  MODIFY `SaleDeleted_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `waiters`
--
ALTER TABLE `waiters`
  MODIFY `W_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
