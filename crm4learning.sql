/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : localhost:3306
 Source Schema         : crm4learning

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : 65001

 Date: 02/08/2019 18:32:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `custom_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '客户id',
  `custom_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '客户姓名',
  `custom_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '客户手机',
  PRIMARY KEY (`custom_id`) USING BTREE,
  INDEX `IX_Customer_Name`(`custom_name`(191)) USING BTREE COMMENT '姓名索引',
  INDEX `IX_Customer_Id`(`custom_id`) USING BTREE COMMENT '客户id索引'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '客户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单id',
  `order_date` datetime NOT NULL COMMENT '订单日期',
  `order_customer_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单客户编号',
  `order_customer_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单客户名称',
  `order_material_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单材料名',
  `order_material_clolr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单材料颜色',
  `order_material_specifications` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单材料规格',
  `order_material_weight` double NOT NULL COMMENT '订单材料重量',
  `order_price` decimal(10, 2) NOT NULL COMMENT '单价',
  `order_total_price` decimal(10, 2) NOT NULL COMMENT '总价',
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `IDX_ORDER_ID`(`order_id`) USING BTREE COMMENT '订单id索引',
  INDEX `IDX_ORDER_NAME`(`order_customer_name`(191)) USING BTREE COMMENT '订单客户姓名',
  INDEX `FR_ORD_CUS_ID`(`order_customer_id`) USING BTREE,
  CONSTRAINT `FR_ORD_CUS_ID` FOREIGN KEY (`order_customer_id`) REFERENCES `customer` (`custom_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '订单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `payment_order_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单号',
  `payment_date` datetime NULL DEFAULT NULL,
  `payment_cutting_wage` decimal(10, 2) NOT NULL COMMENT '切割工',
  `payment_tax_point` decimal(10, 2) NOT NULL COMMENT '税点',
  `payment_strike` decimal(10, 2) NOT NULL COMMENT '冲账',
  `payment_input_money` decimal(10, 2) NOT NULL COMMENT '进项金额',
  `payment_method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '收款方式',
  PRIMARY KEY (`payment_order_id`) USING BTREE,
  CONSTRAINT `FOR_PAY_ORD_ID` FOREIGN KEY (`payment_order_id`) REFERENCES `order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '收款表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
