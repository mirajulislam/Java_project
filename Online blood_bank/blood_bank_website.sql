-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2018 at 07:40 PM
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
-- Database: `blood_bank_website`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_reg`
--

CREATE TABLE `admin_reg` (
  `id` int(15) NOT NULL,
  `User_Name` varchar(30) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Last_Donation` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Today` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_reg`
--

INSERT INTO `admin_reg` (`id`, `User_Name`, `Password`, `Blood_Group`, `Last_Donation`, `Email`, `Mobile_Number`, `Today`) VALUES
(1020305040, 'mirajislam', 'miraj5746', 'A+', '2018-07-01', 'mirajulislam5746@gmail.com', '01780285746', '2018-08-01'),
(1020305041, 'mirajislam', 'miraj7993', 'A-', '2018-04-12', 'mirajulislam7993@gmail.com', '01952627993', '2018-08-08');

-- --------------------------------------------------------

--
-- Table structure for table `blood_detail`
--

CREATE TABLE `blood_detail` (
  `blood_id` int(15) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Last_Donation` date NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `id` int(15) NOT NULL,
  `Price` int(15) NOT NULL,
  `time` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_detail`
--

INSERT INTO `blood_detail` (`blood_id`, `Full_Name`, `Blood_Group`, `Last_Donation`, `Mobile_Number`, `Email`, `Address`, `City`, `id`, `Price`, `time`) VALUES
(1010111101, 'Miraj islam', 'A-', '2018-08-19', '01780285746', 'mirajulislam5746@gmail.com', 'Gulshan-2', 'Dhaka', 1111110002, 500, '2018-08-01'),
(1010111108, 'Soroyar Hossain', 'A+', '2018-04-12', '01752258805', 'soroyar12@gmail.com', 'Mohakhali', 'Dhaka', 1111110013, 600, '2018-08-18'),
(1010111109, 'Shahin Molla', 'B-', '2018-02-24', '01761550776', 'shahinmolla12@gmail.com', 'Rajbari', 'Dhaka', 1111110014, 700, '2018-08-18'),
(1010111110, 'Saima Islam', 'O+', '2018-05-24', '01789632365', 'saimaislam23@gmail.com', 'Rajbari', 'Dhaka', 1111110015, 700, '2018-08-19'),
(1010111112, 'Esa Islam', 'AB-', '2018-04-12', '01952627993', 'esaislam23@gmail.com', 'Gulshan-2', 'Dhaka', 1111110016, 750, '2018-08-19'),
(1010111113, 'xxxx', 'O+', '2018-04-12', '0188625566', 'xxx@gmail.com', 'Gulshan-2', 'Dhaka', 1111110017, 700, '2018-08-21');

-- --------------------------------------------------------

--
-- Table structure for table `check_mail`
--

CREATE TABLE `check_mail` (
  `id` int(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Today` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `check_mail`
--

INSERT INTO `check_mail` (`id`, `Email`, `Today`) VALUES
(1122110011, 'mirajulislam5746@gmail.com', '2018-08-01'),
(1122110012, 'mina@gmail.com', '2018-08-07'),
(1122110013, 'imran@gmail.com', '2018-08-07'),
(1122110015, 'sofiq12@gmail.com', '2018-08-07'),
(1122110016, 'kjkjsfd@gam.com', '2018-08-07'),
(1122110017, 'sahin@gmail.com', '2018-08-07'),
(1122110018, 'mirajulislam7993@gmail.com', '2018-08-08'),
(1122110019, 'rofiq@2019gmail.com', '2018-08-09'),
(1122110020, 'abid2@gmail.com', '2018-08-11'),
(1122110021, 'minhaz12@gmail.com', '2018-08-11'),
(1122110022, 'soroyar12@gmail.com', '2018-08-18'),
(1122110023, 'shahinmolla12@gmail.com', '2018-08-18'),
(1122110024, 'saimaislam23@gmail.com', '2018-08-19'),
(1122110025, 'esaislam23@gmail.com', '2018-08-19'),
(1122110026, 'imran@gmail.com', '2018-08-20'),
(1122110027, 'mirajulislam5746@gmail.com', '2018-08-20'),
(1122110028, 'sofiq12@gmail.com', '2018-08-21'),
(1122110029, 'xxx@gmail.com', '2018-08-21'),
(1122110030, 'sahinmolla@gmail.com', '2018-08-21');

-- --------------------------------------------------------

--
-- Table structure for table `donor_reg`
--

CREATE TABLE `donor_reg` (
  `id` int(15) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Birthday_Day` date NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Last_Donation` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `City` varchar(10) NOT NULL,
  `Today` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor_reg`
--

INSERT INTO `donor_reg` (`id`, `Full_Name`, `User_Name`, `Password`, `Birthday_Day`, `Blood_Group`, `Last_Donation`, `Email`, `Mobile_Number`, `Gender`, `Address`, `City`, `Today`) VALUES
(1111110000, 'hgsd', 'fsddfs', '', '0000-00-00', '', '0000-00-00', '', '', '', '', '', '0000-00-00'),
(1111110001, 'Sofiqul Islam', 'rajislam', '12555', '1997-02-01', 'A+', '2018-04-12', 'mina@gmail.com', '01952627993', 'male', 'Badda', 'Dhaka', '2018-08-07'),
(1111110002, 'Miraj Islam', 'mirajislam', 'miraj5746', '1997-02-01', 'A-', '2018-08-19', 'mirajulislam5746@gmail.com', '01952627993', 'male', 'Gulshan-2', 'Dhaka', '2018-08-07'),
(1111110003, 'Habib Hasan', 'habib1233', 'hamib1232', '1995-05-12', 'O+', '2018-04-12', 'habibislam@gmail.com', '01780285746', 'male', 'Mirpur-10', 'Dhaka', '2018-08-07'),
(1111110005, 'Imran Islam', 'imranislam', 'imran222', '1988-05-12', 'O-', '2018-02-24', 'imran@gmail.com', '01952627993', 'male', 'Gulshan-2', 'Dhaka', '2018-08-07'),
(1111110006, 'Mirajulislam', 'mirajislam', 'miraj7993', '1990-12-08', 'O+', '2018-04-12', 'mirajulisam7993@gmail.com', '01952627993', 'male', 'Gulshan-1', 'Dhaka', '2018-08-07'),
(1111110007, 'Sofiqul Islam', 'imranislam', 'vhtfytfytf', '1990-12-08', 'AB-', '2018-08-21', 'sofiq12@gmail.com', '0188625566', 'male', 'Gulshan-1', 'Dhaka', '2018-08-07'),
(1111110008, 'Habib Hasan', 'habib1233', 'hgvfhgfhgfgh', '1990-12-08', 'A+', '2018-03-24', 'kjkjsfd@gam.com', '01780285746', 'male', 'Gulshan-2', 'Dhaka', '2018-08-07'),
(1111110009, 'Shahin', 'sahin23@gmail.com', 'sahin12@gmai', '1995-05-12', 'AB-', '2018-02-24', 'sahin@gmail.com', '0188625566', 'male', 'Gulshan-2', 'Dhaka', '2018-08-07'),
(1111110010, 'rofiq', 'rofiq', 'rofiq', '1990-12-08', 'O+', '2018-02-24', 'rofiq@2019gmail.com', '01533266886', 'male', 'Gulshan-2', 'Dhaka', '2018-08-09'),
(1111110011, 'Abid Hasan', 'abidhasan', '123456', '1994-02-09', 'O+', '2018-02-24', 'abid2@gmail.com', '01786524622', 'male', 'Gulshan-2', 'Dhaka', '2018-08-11'),
(1111110012, 'Minhaz Islam', 'minhazislam', 'minhaz123', '1997-02-11', 'A+', '2018-09-04', 'minhaz12@gmail.com', '01786451255', 'male', 'Dhanmondi-32', 'Dhaka', '2018-08-11'),
(1111110013, 'Soroyar Hossain', 'soroyar12', 'soroyar321', '1997-04-01', 'A+', '2018-04-12', 'soroyar12@gmail.com', '01752258805', 'male', 'Mohakhali', 'Dhaka', '2018-08-18'),
(1111110014, 'Shahin Molla', 'shahin123', 'shahin12321', '1988-02-01', 'B-', '2018-02-24', 'shahinmolla12@gmail.com', '01761550776', 'male', 'Rajbari', 'Dhaka', '2018-08-18'),
(1111110015, 'Saima Islam', 'saimaislam', 'saima123', '1997-01-05', 'O+', '2018-05-24', 'saimaislam23@gmail.com', '01789632365', 'female', 'Rajbari', 'Dhaka', '2018-08-19'),
(1111110016, 'Esa Islam', 'esaislam', 'esa12321', '2004-02-01', 'AB-', '2018-04-12', 'esaislam23@gmail.com', '01952627993', 'female', 'Gulshan-2', 'Dhaka', '2018-08-19'),
(1111110017, 'xxxx', 'xxxx', 'xxxx', '1997-02-01', 'O+', '2018-04-12', 'xxx@gmail.com', '0188625566', 'male', 'Gulshan-2', 'Dhaka', '2018-08-21');

-- --------------------------------------------------------

--
-- Table structure for table `forgot_password_option1`
--

CREATE TABLE `forgot_password_option1` (
  `id` int(15) NOT NULL,
  `code` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forgot_password_option1`
--

INSERT INTO `forgot_password_option1` (`id`, `code`, `email`, `date`) VALUES
(11100110, 0, '', '0000-00-00'),
(11100111, 587557, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100112, 703810, 'minhaz12@gmail.com', '2018-08-11'),
(11100113, 676725, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100114, 323208, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100115, 296212, 'abid2@gmail.com', '2018-08-11'),
(11100116, 473573, 'abid2@gmail.com', '2018-08-11'),
(11100117, 48785, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100118, 253640, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100119, 579030, 'mirajulislam5746@gmail.com', '2018-08-11'),
(11100120, 253419, 'mina@gmail.com', '2018-08-11'),
(11100121, 356902, 'mirajulislam5746@gmail.com', '2018-08-12');

-- --------------------------------------------------------

--
-- Table structure for table `forgot_password_option2`
--

CREATE TABLE `forgot_password_option2` (
  `id` int(15) NOT NULL,
  `code` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forgot_password_option2`
--

INSERT INTO `forgot_password_option2` (`id`, `code`, `email`, `Password`, `date`) VALUES
(101011001, 0, '', '', '0000-00-00'),
(101011002, 296212, 'abid2@gmail.com', 'null', '2018-08-11'),
(101011003, 473573, 'abid2@gmail.com', '123456', '2018-08-11'),
(101011004, 253419, 'mina@gmail.com', '12345', '2018-08-11'),
(101011005, 253419, 'mina@gmail.com', '12555', '2018-08-11'),
(101011006, 356902, 'mirajulislam5746@gmail.com', 'miraj5746', '2018-08-12');

-- --------------------------------------------------------

--
-- Table structure for table `orderded_blood_donor_detail`
--

CREATE TABLE `orderded_blood_donor_detail` (
  `id` int(15) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Donated_Date` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `City` varchar(50) NOT NULL,
  `Today` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orderded_blood_donor_detail`
--

INSERT INTO `orderded_blood_donor_detail` (`id`, `Full_Name`, `Blood_Group`, `Donated_Date`, `Email`, `Mobile_Number`, `Address`, `City`, `Today`) VALUES
(809060540, '', '', '0000-00-00', '', '', '', '', '0000-00-00'),
(809060544, 'Abid', 'O', '2018-08-22', '', '', '', '', '0000-00-00'),
(809060546, 'Mira', '', '0000-00-00', '', '', '', '', '0000-00-00'),
(809060547, 'Miraj Islam', 'O', '2018-08-22', 'mirajulislam5746@gmail.com', '8525662', 'Gulshan', 'Dhaka', '2018-08-21');

-- --------------------------------------------------------

--
-- Table structure for table `order_blood`
--

CREATE TABLE `order_blood` (
  `id` int(15) NOT NULL,
  `blood_id` int(15) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Price` int(5) NOT NULL,
  `Delivary` date NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
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
(856597851, 1010111101, 'A-', 500, '2018-06-27', 'Habib Hasan', '01780285746', 'sofiq12@gmail.com', 'Gulshan-2', 'Dhaka', '2018-08-14'),
(856597852, 1010111101, 'A-', 500, '2018-08-27', 'Soroyar Hossain', '01752258805', 'soroyar12@gmail.com', 'Mohakhali', 'Dhaka', '2018-08-18'),
(856597853, 1010111108, 'A+', 600, '2018-08-27', 'Miraj Islam', '01780285746', 'mirajulislam5746@gmail.com', 'Gulshan-2', 'Dhaka', '2018-08-19'),
(856597854, 0, 'O-', 0, '2018-08-22', 'Abid', '', '', '', '', '0000-00-00'),
(856597855, 0, 'O+', 0, '2018-08-22', 'Abid', '', '', '', '', '0000-00-00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_reg`
--
ALTER TABLE `admin_reg`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `blood_detail`
--
ALTER TABLE `blood_detail`
  ADD PRIMARY KEY (`blood_id`),
  ADD KEY `user_id` (`id`);

--
-- Indexes for table `check_mail`
--
ALTER TABLE `check_mail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `donor_reg`
--
ALTER TABLE `donor_reg`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `forgot_password_option1`
--
ALTER TABLE `forgot_password_option1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `forgot_password_option2`
--
ALTER TABLE `forgot_password_option2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orderded_blood_donor_detail`
--
ALTER TABLE `orderded_blood_donor_detail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_blood`
--
ALTER TABLE `order_blood`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_reg`
--
ALTER TABLE `admin_reg`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1020305042;
--
-- AUTO_INCREMENT for table `blood_detail`
--
ALTER TABLE `blood_detail`
  MODIFY `blood_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1010111115;
--
-- AUTO_INCREMENT for table `check_mail`
--
ALTER TABLE `check_mail`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1122110031;
--
-- AUTO_INCREMENT for table `donor_reg`
--
ALTER TABLE `donor_reg`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1111110018;
--
-- AUTO_INCREMENT for table `forgot_password_option1`
--
ALTER TABLE `forgot_password_option1`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11100122;
--
-- AUTO_INCREMENT for table `forgot_password_option2`
--
ALTER TABLE `forgot_password_option2`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101011007;
--
-- AUTO_INCREMENT for table `orderded_blood_donor_detail`
--
ALTER TABLE `orderded_blood_donor_detail`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=809060549;
--
-- AUTO_INCREMENT for table `order_blood`
--
ALTER TABLE `order_blood`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=856597857;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `blood_detail`
--
ALTER TABLE `blood_detail`
  ADD CONSTRAINT `blood_detail_ibfk_1` FOREIGN KEY (`id`) REFERENCES `donor_reg` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
