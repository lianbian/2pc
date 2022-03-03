/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost:3306
 Source Schema         : bank_ccb

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 03/03/2022 12:31:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_id` int(11) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `frozen_balance` bigint(20) DEFAULT NULL,
  `last_modify_time` datetime DEFAULT NULL,
  `user_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for account_freezing_record
-- ----------------------------
DROP TABLE IF EXISTS `account_freezing_record`;
CREATE TABLE `account_freezing_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `freezing_time` datetime NOT NULL,
  `frozen_amount` bigint(20) NOT NULL,
  `transaction_id` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `unfreezing_time` datetime DEFAULT NULL,
  `valid` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `account_id_idx` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for log_record
-- ----------------------------
DROP TABLE IF EXISTS `log_record`;
CREATE TABLE `log_record` (
  `transaction_id` varchar(32) COLLATE utf8mb4_bin NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for transactions
-- ----------------------------
DROP TABLE IF EXISTS `transactions`;
CREATE TABLE `transactions` (
  `id` varchar(32) COLLATE utf8mb4_bin NOT NULL,
  `actions` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `participants` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `vote_results` varchar(512) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
