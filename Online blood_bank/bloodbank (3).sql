-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2018 at 05:09 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_registration`
--

CREATE TABLE `admin_registration` (
  `id` int(15) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `user_name` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `dob` date NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_registration`
--

INSERT INTO `admin_registration` (`id`, `full_name`, `user_name`, `password`, `dob`, `mobile`, `email`, `gender`) VALUES
(111122220, 'Mirajul Islam', 'mirajislam', 'miraj5746', '1997-02-01', '01780285746', 'mirajulislam5746@', 'male'),
(111122221, 'Aminulislam', 'aminulislam', 'aminul1122', '1995-05-12', '01747702071', 'aminulislam71@gmail.com', 'male'),
(111122222, 'Rajislam', 'mirajislam', 'miraj7993', '1997-02-01', '01952627993', 'mirajulisam7993@gmail.com', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `blood_bag_registration`
--

CREATE TABLE `blood_bag_registration` (
  `id` int(10) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Donation_Date` date NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_bag_registration`
--

INSERT INTO `blood_bag_registration` (`id`, `Full_Name`, `Blood_Group`, `Donation_Date`, `Mobile_Number`, `Email`, `Gender`) VALUES
(140150121, 'Habib Hasan', 'O-', '2018-06-28', '01988556633', 'imran@gmail.com', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `blood_detail`
--

CREATE TABLE `blood_detail` (
  `blood_id` int(20) NOT NULL,
  `Full_Name` varchar(20) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Last_Donation` varchar(100) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `City` varchar(20) NOT NULL,
  `user_id` int(20) NOT NULL,
  `Price` varchar(20) DEFAULT NULL,
  `time` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_detail`
--

INSERT INTO `blood_detail` (`blood_id`, `Full_Name`, `Blood_Group`, `Last_Donation`, `Mobile_Number`, `Email`, `Address`, `City`, `user_id`, `Price`, `time`) VALUES
(110010, 'Mirajul Islam', 'A+', '2018-04-12', '01780285746', 'mirajulislam5746@gmail.com', 'Gulshan-2', 'Dhaka', 101010, NULL, NULL),
(110011, 'Hasan Islam', 'O-', '2018-02-01', '01756894147', 'hasanislam12@gmail.com', 'Gulshan-2', 'Dhaka', 101011, NULL, NULL),
(110017, 'Mina Khatun', 'AB-', '2018-05-09', '6545222', '  mina@gmail.com', 'Mirpur-10', 'Dhaka', 101012, NULL, NULL),
(110018, 'Imran Islam', 'B-', '2018-05-03', '6454312.132', '  imran@gmail.com', 'Badda', 'Dhaka', 101013, NULL, NULL),
(110019, 'Sofiqul Islam', 'B+', '2018-03-24', '01988556633', '  sofiq12@gmail.com', 'Gulshan-2', 'Dhaka', 101014, NULL, NULL),
(110020, 'Imran Islam', 'B+', '2018-02-24', '01988556633', '  imran12@gmail.com', 'Badda', 'Dhaka', 101015, NULL, NULL),
(110021, 'Al Amin', 'O-', '2018-04-12', '01789632541', '  alamin22@gmail.com', 'Kallanpur', 'Dhaka-1212', 101016, NULL, NULL),
(110029, 'Surovi Islam', 'A-', '2018-03-24', '01599663322', '  surovi@gmail.com', 'Gulshan-1', 'Dhaka', 101018, '399', '2018-06-02'),
(110030, 'Liza Akther', 'AB-', '2018-01-09', '0178956314', '  liza23@gmail.com', 'Badda', 'Dhaka', 101019, '399', '2018-06-02'),
(110031, 'Aminul Islam', 'A-', '2018-03-25', '01747702071', '  aminulislam71@gmail.com', 'Boshundhara', 'Dhaka', 101023, '599', '2018-06-23'),
(110032, 'Imran Islam', 'AB-', '2018-02-24', '01988556633', '  imran@gmail.com', 'Mirpur-12', 'Dhaka', 101024, '599', '2018-06-24'),
(110033, 'Imran Islam', 'AB-', '2018-02-24', '01988556633', '  imran@gmail.com', 'Mirpur-12', 'Dhaka', 101024, '699', '2018-06-24');

-- --------------------------------------------------------

--
-- Table structure for table `check_gmail`
--

CREATE TABLE `check_gmail` (
  `id` int(10) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `check_gmail`
--

INSERT INTO `check_gmail` (`id`, `Email`) VALUES
(152392300, 'mirajulislam5746@gmail.com'),
(152392301, 'imran@gmail.com'),
(152392302, 'mirajulisam7993@gmail.com'),
(152392303, 'jhgjhghjjs@gmail');

-- --------------------------------------------------------

--
-- Table structure for table `donor_registration`
--

CREATE TABLE `donor_registration` (
  `user_id` int(20) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Birthday_Day` date NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Last_Donation` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile_Number` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `City` varchar(15) NOT NULL,
  `Today` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor_registration`
--

INSERT INTO `donor_registration` (`user_id`, `Full_Name`, `User_Name`, `Password`, `Birthday_Day`, `Blood_Group`, `Last_Donation`, `Email`, `Mobile_Number`, `Gender`, `Address`, `City`, `Today`) VALUES
(101010, 'Mirajul Islam', 'mirajislam', 'mirajislam', '1997-02-01', 'A+', '2018-04-12', 'mirajulislam5746@gmail.com', '01780285746', 'male', 'Gulshan-2', 'Dhaka', NULL),
(101011, 'Hasan Islam', 'hasanislam', 'hasan12321', '1990-05-01', 'O-', '2018-02-01', 'hasanislam12@gamil.com', '01756894147', 'male', 'Gulshan-2', 'Dhaka', NULL),
(101012, 'Mina Khatun', 'mina', 'mina 1122', '1990-04-30', 'AB-', '2018-05-09', 'mina@gmail.com', '6545222', 'female', 'Mirpur-10', 'Dhaka', NULL),
(101013, 'Imran Islam', 'imranislam', 'hkuhkusdc', '1983-05-01', 'B-', '2018-05-03', 'imran@gmail.com', '6454312.132', 'male', 'Badda', 'Dhaka', NULL),
(101014, 'Sofiqul Islam', 'sofiqislam', 'sofiq123', '1995-05-12', 'B+', '2018-03-24', 'sofiq12@gmail.com', '01988556633', 'male', 'Gulshan-2', 'Dhaka', NULL),
(101015, 'Imran Islam', 'imranislam', 'imran77889', '1988-05-12', 'B+', '2018-02-24', 'imran12@gmail.com', '01988556633', 'male', 'Badda', 'Dhaka', NULL),
(101016, 'Al Amin', 'amin', '12345', '1990-12-08', 'O-', '2018-04-12', 'alamin22@gmail.com', '01789632541', 'male', 'Kallanpur', 'Dhaka-1212', NULL),
(101017, 'Aminul Islam', 'aminulislam', 'aminu12345', '1996-02-08', 'B-', '2018-02-05', 'aminulislam5746@gamil.com', '01747702071', 'male', 'Bosundhora', 'Dhaka', '2018-06-01'),
(101018, 'Surovi Islam', 'surovi1232', 'surovi1234', '1997-02-01', 'A-', '2018-03-24', 'surovi@gmail.com', '01599663322', 'female', 'Gulshan-1', 'Dhaka', '2018-06-02'),
(101019, 'Liza Akther', 'lizaislam', 'liza1234', '2000-01-17', 'AB-', '2018-01-09', 'liza23@gmail.com', '0178956314', 'female', 'Badda', 'Dhaka', '2018-06-02'),
(101020, 'Mina Khatun', 'rajislam', 'mirajislam', '1990-12-08', 'O-', '2018-04-12', 'mirajulislam5746@gmail.com', '01952627993', 'male', 'g,rnkjnkjd', 'Dhaka', '2018-06-04'),
(101021, 'jguygsuyfds', 'vhgvhgvsd', 'hghgvhgvsh', '1997-02-01', 'B-', '2018-04-12', 'hgvghvhgsvdg@gmail.com', '97987987984', 'male', 'guyguygusd', 'Shylet', '2018-06-04'),
(101022, 'Miraj Islam', 'mirajislam', 'miraj7993', '1997-02-01', 'A-', '2018-02-24', 'mirajulisam7993@gmail.com', '01952627993', 'male', 'Gulshan-2', 'Dhaka', '2018-06-05'),
(101023, 'Aminul Islam', 'aminulislam', 'aminulisla', '1995-02-09', 'A-', '2018-03-25', 'aminulislam71@gmail.com', '01747702071', 'male', 'Boshundhara', 'Dhaka', '2018-06-23'),
(101024, 'Imran Islam', 'imranislam', 'imran1234', '1997-02-01', 'AB-', '2018-02-24', 'imran@gmail.com', '01988556633', 'male', 'Mirpur-12', 'Dhaka', '2018-06-24'),
(101025, 'Imran Islam', 'imranislam', 'imran', '1988-05-12', 'B+', '2018-02-24', 'jhgjhghjjs@gmail', '01533266886', 'male', 'Badda.', 'khulna', '2018-06-24');

-- --------------------------------------------------------

--
-- Table structure for table `forgot_password_option1`
--

CREATE TABLE `forgot_password_option1` (
  `id` int(15) NOT NULL,
  `code` int(6) NOT NULL,
  `email` varchar(50) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forgot_password_option1`
--

INSERT INTO `forgot_password_option1` (`id`, `code`, `email`, `date`) VALUES
(101, 464156, 'mirajulislam5746@gmail.com', '2018-06-04'),
(103, 883843, 'mirajulislam5746@gmail.com', '2018-06-04'),
(104, 721902, 'mirajulislam5746@gmail.com', '2018-06-04'),
(105, 299583, 'mirajulislam5746@gmail.com', '2018-06-04'),
(106, 494030, 'mirajulislam5746@gmail.com', '2018-06-04'),
(107, 642762, 'mirajulislam5746@gmail.com', '2018-06-04'),
(108, 981594, 'mirajulislam5746@gmail.com', '2018-06-04'),
(109, 160110, 'mirajulislam5746@gmail.com', '2018-06-04'),
(110, 929028, 'hasanislam12@gamil.com', '2018-06-04'),
(111, 629525, 'hasanislam12@gamil.com', '2018-06-04'),
(112, 120267, 'mina@gmail.com', '2018-06-04'),
(113, 279132, 'mina@gmail.com', '2018-06-04'),
(114, 984342, 'mina@gmail.com', '2018-06-04'),
(115, 113884, 'mina@gmail.com', '2018-06-04'),
(116, 576235, 'mina@gmail.com', '2018-06-04'),
(117, 163448, 'surovi@gmail.com', '2018-06-05'),
(118, 269878, 'mirajulisam7993@gmail.com', '2018-06-05'),
(119, 912324, 'mina@gmail.com', '2018-06-13'),
(120, 392555, 'mina@gmail.com', '2018-06-13'),
(121, 450231, 'mirajulislam5746@gmail.com', '2018-06-24');

-- --------------------------------------------------------

--
-- Table structure for table `forgot_password_option2`
--

CREATE TABLE `forgot_password_option2` (
  `id` int(15) NOT NULL,
  `code` int(6) NOT NULL,
  `email` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forgot_password_option2`
--

INSERT INTO `forgot_password_option2` (`id`, `code`, `email`, `Password`, `date`) VALUES
(200, 464156, 'mirajulislam5746@gmail.com', 'miraj5746', '2018-06-04'),
(201, 160110, 'mirajulislam5746@gmail.com', 'mirajislam', '2018-06-04'),
(202, 160110, 'mirajulislam5746@gmail.com', 'miraj', '2018-06-04'),
(203, 113884, 'mina@gmail.com', 'xxxxxx', '2018-06-04'),
(204, 163448, 'surovi@gmail.com', 'surovi1234', '2018-06-05'),
(205, 269878, 'mirajulisam7993@gmail.com', 'mirajislam7993', '2018-06-05'),
(206, 269878, 'mirajulisam7993@gmail.com', 'miraj7993', '2018-06-05'),
(207, 269878, 'mirajulisam7993@gmail.com', 'miraj7993', '2018-06-05'),
(208, 912324, 'mina@gmail.com', 'mina 1122', '2018-06-13'),
(209, 450231, 'mirajulislam5746@gmail.com', 'mirajislam', '2018-06-24');

-- --------------------------------------------------------

--
-- Table structure for table `order_blood`
--

CREATE TABLE `order_blood` (
  `id` int(10) NOT NULL,
  `blood_id` varchar(10) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Price` varchar(5) NOT NULL,
  `Delivary` date NOT NULL,
  `Full_Name` varchar(30) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `City` varchar(15) NOT NULL,
  `present` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_blood`
--

INSERT INTO `order_blood` (`id`, `blood_id`, `Blood_Group`, `Price`, `Delivary`, `Full_Name`, `Mobile_Number`, `Email`, `Address`, `City`, `present`) VALUES
(11001100, '', '', '', '0000-00-00', '', '', '', '', '', '0000-00-00'),
(11001102, '110020', 'B+', 'null', '2018-06-27', 'Sofiqul Islam', '01956328788', 'sofiq12@gmail.com', 'Mirpur-10', 'Dhaka', '2018-06-24'),
(11001103, '110011', 'O-', 'null', '2018-06-27', 'Imran Islam', '01780285746', 'imran@gmail.com', 'Gulshan-2', 'Dhaka', '2018-06-24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_registration`
--
ALTER TABLE `admin_registration`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `blood_bag_registration`
--
ALTER TABLE `blood_bag_registration`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `blood_detail`
--
ALTER TABLE `blood_detail`
  ADD PRIMARY KEY (`blood_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `check_gmail`
--
ALTER TABLE `check_gmail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `donor_registration`
--
ALTER TABLE `donor_registration`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `forgot_password_option1`
--
ALTER TABLE `forgot_password_option1`
  ADD PRIMARY KEY (`id`),
  ADD KEY `code` (`code`);

--
-- Indexes for table `forgot_password_option2`
--
ALTER TABLE `forgot_password_option2`
  ADD PRIMARY KEY (`id`),
  ADD KEY `code` (`code`);

--
-- Indexes for table `order_blood`
--
ALTER TABLE `order_blood`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_registration`
--
ALTER TABLE `admin_registration`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111122223;
--
-- AUTO_INCREMENT for table `blood_bag_registration`
--
ALTER TABLE `blood_bag_registration`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140150122;
--
-- AUTO_INCREMENT for table `blood_detail`
--
ALTER TABLE `blood_detail`
  MODIFY `blood_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110034;
--
-- AUTO_INCREMENT for table `check_gmail`
--
ALTER TABLE `check_gmail`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152392304;
--
-- AUTO_INCREMENT for table `donor_registration`
--
ALTER TABLE `donor_registration`
  MODIFY `user_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101026;
--
-- AUTO_INCREMENT for table `forgot_password_option1`
--
ALTER TABLE `forgot_password_option1`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;
--
-- AUTO_INCREMENT for table `forgot_password_option2`
--
ALTER TABLE `forgot_password_option2`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=210;
--
-- AUTO_INCREMENT for table `order_blood`
--
ALTER TABLE `order_blood`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11001104;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `blood_detail`
--
ALTER TABLE `blood_detail`
  ADD CONSTRAINT `blood_detail_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `donor_registration` (`user_id`);

--
-- Constraints for table `forgot_password_option2`
--
ALTER TABLE `forgot_password_option2`
  ADD CONSTRAINT `forgot_password_option2_ibfk_1` FOREIGN KEY (`code`) REFERENCES `forgot_password_option1` (`code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
