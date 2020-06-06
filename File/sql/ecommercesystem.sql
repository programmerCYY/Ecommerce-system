/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : ecommercesystem

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 04/06/2020 23:17:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chart
-- ----------------------------
DROP TABLE IF EXISTS `chart`;
CREATE TABLE `chart`  (
  `chartID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '自增Id',
  `userID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `GoodID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品ID（要商品图片，价格，名字，属性）',
  `number` int(0) NOT NULL DEFAULT 0 COMMENT '数量',
  `price` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '价钱',
  `CheckState` int(0) DEFAULT NULL COMMENT '结算状态，0为false，1为true',
  PRIMARY KEY (`chartID`) USING BTREE,
  INDEX `chart_userr`(`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Redundant;

-- ----------------------------
-- Table structure for good_sku
-- ----------------------------
DROP TABLE IF EXISTS `good_sku`;
CREATE TABLE `good_sku`  (
  `SKUID` int(0) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `goodID` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品Id',
  `number` int(0) NOT NULL COMMENT '数量',
  `price` decimal(10, 2) NOT NULL COMMENT '价格',
  `Vipprice` decimal(10, 2) DEFAULT NULL COMMENT 'Vip价格',
  `Left_number` int(0) DEFAULT NULL COMMENT '库存量',
  `Sold_number` int(0) DEFAULT NULL COMMENT '销售量',
  `pictrue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  PRIMARY KEY (`SKUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods_category
-- ----------------------------
DROP TABLE IF EXISTS `goods_category`;
CREATE TABLE `goods_category`  (
  `Id` int(0) NOT NULL COMMENT '自增ID',
  `CategoryId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品分类Id',
  `SellerId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家Id',
  `Goodsname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `CategoryDegree` int(0) NOT NULL COMMENT '分类等级',
  `Number` int(0) NOT NULL COMMENT '数量',
  `Danwei` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单位',
  `ShowState` int(0) NOT NULL COMMENT '是否展示在主页',
  `Descipt` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '描述',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods_comment
-- ----------------------------
DROP TABLE IF EXISTS `goods_comment`;
CREATE TABLE `goods_comment`  (
  `CommentId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评价ID，自增',
  `Userid` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `TypeId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品属性',
  `Level` int(0) NOT NULL COMMENT '评价星级',
  `CommentTIme` datetime(0) DEFAULT NULL COMMENT '评论时间',
  `State` int(0) DEFAULT NULL COMMENT '0是未评价，1是已评价',
  `Comment` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '评论详情',
  PRIMARY KEY (`CommentId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods_information
-- ----------------------------
DROP TABLE IF EXISTS `goods_information`;
CREATE TABLE `goods_information`  (
  `goodID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品ID自增',
  `ShopID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家ID外码',
  `Goodname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名字',
  `Goodpictrue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品图片',
  `introduction` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品介绍',
  `CheckState` int(0) NOT NULL COMMENT '上下架状态，0为待审核，1为已审核',
  `number` int(0) NOT NULL COMMENT '数量',
  `ispackage` int(0) NOT NULL COMMENT '包邮状态，0为不包邮，1为包邮',
  `Frontpictrue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '首页图片',
  `ShangTime` datetime(0) DEFAULT NULL COMMENT '上架时间',
  `categoryId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '分类Id',
  `AllsellNumber` int(0) DEFAULT NULL COMMENT '总销售量',
  PRIMARY KEY (`goodID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `adminID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员的ID（主码）',
  `adminWord` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员的密码',
  PRIMARY KEY (`adminID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `OrderID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `UserID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `State` int(0) NOT NULL COMMENT '0未支付，1已支付，2申请退，3已退，4超时',
  `PayTime` datetime(0) DEFAULT NULL COMMENT '支付时间',
  `GetTIme` datetime(0) DEFAULT NULL COMMENT '收货时间',
  `Comment` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论',
  `CommentTime` datetime(0) DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`OrderID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods`  (
  `OrderId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单Id',
  `Goodname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名字',
  `Shopname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家名字',
  `State` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
  `Total_number` int(0) NOT NULL COMMENT '总数量',
  `Total_price` decimal(10, 2) NOT NULL COMMENT '总价钱',
  `Goodpictrue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片',
  `Attribute` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '属性',
  PRIMARY KEY (`OrderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_return
-- ----------------------------
DROP TABLE IF EXISTS `order_return`;
CREATE TABLE `order_return`  (
  `OrderId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单ID',
  `ReturnReason` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '退换原因',
  `Money` decimal(10, 2) DEFAULT NULL COMMENT '总金额',
  `UserId` int(0) DEFAULT NULL COMMENT '用户ID',
  `SellerAddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商家地址',
  `OrderStatus` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单状态',
  PRIMARY KEY (`OrderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop`  (
  `SellerId` int(0) NOT NULL AUTO_INCREMENT COMMENT '店主名',
  `SellerName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'ID（自增）--主码',
  `Shopname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商家名',
  `TotalSales` int(0) DEFAULT NULL COMMENT '总销量',
  `ShopAddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商家地址',
  `RegisterState` int(0) DEFAULT NULL COMMENT '注册的审核状态，0为待审核，1为审核通过',
  PRIMARY KEY (`SellerId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userpermission
-- ----------------------------
DROP TABLE IF EXISTS `userpermission`;
CREATE TABLE `userpermission`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `value` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限值',
  `UserID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createTime` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userr
-- ----------------------------
DROP TABLE IF EXISTS `userr`;
CREATE TABLE `userr`  (
  `UserID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户的账号',
  `Userpassword` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户的密码',
  `UserAddress` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户的电话号码',
  `UserTelephone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户的地址',
  `Userpower` int(0) DEFAULT NULL COMMENT '用户的权限，0是普通用户，1是VIP',
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userr
-- ----------------------------
INSERT INTO `userr` VALUES ('123', '234', '空', '132', NULL);
INSERT INTO `userr` VALUES ('123333', '1122222', '未填写', '12131313', NULL);

SET FOREIGN_KEY_CHECKS = 1;
