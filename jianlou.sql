/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50613
Source Host           : localhost:3306
Source Database       : egg_jianlou

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2014-07-07 17:10:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for portal_goods_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_goods_t`;
CREATE TABLE `portal_goods_t` (
  `goods_id` int(10) NOT NULL COMMENT '自增主键',
  `goods_name` varchar(30) NOT NULL COMMENT '商品名称',
  `goods_icon` varchar(255) NOT NULL COMMENT '商品小图标(展示在首页和商品列表上的)url',
  `goods_price` decimal(10,2) NOT NULL COMMENT '商品定价',
  `belong_to_store` int(10) NOT NULL COMMENT '所属店铺ID',
  `sale_type` int(1) NOT NULL COMMENT '销售类型 0-竞标 1-直销',
  `goods_desc` text COMMENT '商品说明 html',
  `is_sold` int(1) NOT NULL COMMENT '是否售出  0-未售出  1-已售出',
  `create_time` datetime NOT NULL COMMENT '上架时间(暂定)',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

-- ----------------------------
-- Records of portal_goods_t
-- ----------------------------

-- ----------------------------
-- Table structure for portal_order_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_order_t`;
CREATE TABLE `portal_order_t` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单ID 自增主键',
  `order_price` decimal(10,2) NOT NULL COMMENT '订单价格',
  `order_person` int(10) NOT NULL COMMENT '订单所属用户ID',
  `order_type` int(1) NOT NULL COMMENT '订单类型 0-竞标 1-直销',
  `order_status` int(1) NOT NULL COMMENT '订单状态 0-竞标中 1-完成竞标 2-直销购买成功',
  `order_goods` int(10) NOT NULL COMMENT '订单商品id',
  `create_time` datetime NOT NULL COMMENT '订单发起时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表(包括直销、竞标的订单)';

-- ----------------------------
-- Records of portal_order_t
-- ----------------------------

-- ----------------------------
-- Table structure for portal_store_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_store_t`;
CREATE TABLE `portal_store_t` (
  `store_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '店铺自增主键',
  `store_name` varchar(50) NOT NULL COMMENT '店铺名称',
  `create_time` datetime NOT NULL COMMENT '店铺建立时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店铺信息表';

-- ----------------------------
-- Records of portal_store_t
-- ----------------------------

-- ----------------------------
-- Table structure for portal_user_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_user_t`;
CREATE TABLE `portal_user_t` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_name` varchar(16) NOT NULL COMMENT '用户登陆名(最长16位)',
  `password` varchar(64) NOT NULL COMMENT '唯一密码(加密后的)',
  `user_nick` varchar(16) NOT NULL COMMENT '昵称/真实姓名',
  `user_head` varchar(255) DEFAULT NULL COMMENT '用户头像URL(存到服务器里...)',
  `user_sex` varchar(10) NOT NULL COMMENT '性别 male/female',
  `email` varchar(30) NOT NULL COMMENT '电子邮箱',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `user_styles` varchar(60) DEFAULT NULL COMMENT '记录用户选择的样式(二进制)',
  `recent_bid` int(10) DEFAULT NULL COMMENT '最近竞标商品ID',
  `recent_buy` int(10) DEFAULT NULL COMMENT '最近成功购买商品ID(无论是竞标成功，还是购买直销商品)',
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间(每修改一次这个时间就会更新)',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='门户网页用户信息表(与论坛关联)';

-- ----------------------------
-- Records of portal_user_t
-- ----------------------------
