/*
 Navicat Premium Data Transfer

 Source Server         : RR
 Source Server Type    : MySQL
 Source Server Version : 80400 (8.4.0)
 Source Host           : localhost:3306
 Source Schema         : Ricardo

 Target Server Type    : MySQL
 Target Server Version : 80400 (8.4.0)
 File Encoding         : 65001

 Date: 21/11/2024 11:05:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comm
-- ----------------------------
DROP TABLE IF EXISTS `comm`;
CREATE TABLE `comm` (
  `id` int NOT NULL AUTO_INCREMENT,
  `comm_num` varchar(255) DEFAULT NULL,
  `comm_name` varchar(255) DEFAULT NULL,
  `sale_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of comm
-- ----------------------------
BEGIN;
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (2, 'k102', '啵啵鸡', 18.80);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (3, 'k103', '六婆辣椒面', 13.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (4, 'k104', '翠宏辣椒面', 12.99);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (5, 'k105', '我系奶龙', 250.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (6, 'k105', '我才系奶龙', 250.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (7, 'k108', '夯大力', 250.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (8, 'k110', '橘猫', 80.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (9, 'k111', '两只的橘猫', 999.00);
INSERT INTO `comm` (`id`, `comm_num`, `comm_name`, `sale_price`) VALUES (11, 'k199', '高粱饴', 19.92);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
