/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : 127.0.0.1:3307
Source Database       : egg_jianlou

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2014-07-13 22:46:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for portal_goods_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_goods_t`;
CREATE TABLE `portal_goods_t` (
  `goods_id` varchar(100) NOT NULL COMMENT '商品ID',
  `goods_name` varchar(30) NOT NULL COMMENT '商品名称',
  `goods_icon` varchar(255) NOT NULL COMMENT '商品小图标(展示在首页和商品列表上的)url',
  `goods_price` decimal(10,2) NOT NULL COMMENT '商品定价',
  `belong_to_store` int(10) NOT NULL COMMENT '所属店铺ID',
  `sale_type` int(1) NOT NULL COMMENT '销售类型 0-竞标 1-直销',
  `goods_desc` text COMMENT '商品说明 html',
  `is_sold` int(1) NOT NULL COMMENT '是否售出  0-未售出  1-已售出',
  `create_time` datetime NOT NULL COMMENT '上架时间(暂定)',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `goods_order` int(10) DEFAULT NULL COMMENT '商品排序(不正当竞争)',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

-- ----------------------------
-- Records of portal_goods_t
-- ----------------------------
INSERT INTO `portal_goods_t` VALUES ('08f9d4a03b1e2c7d', '吴作人花鸟画', '', '404.00', '8', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('0c3b58fc8c9a5555', '周桂珍款制竹节圆壶带六件杯盏', '', '399.00', '3', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('0d5333686d935006', '钧瓷桃型洗', '', '411.00', '15', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('405303bb6c820b6a', '“光绪元宝”（款）钱币', '', '410.00', '14', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('6ccca71e15426c0a', '宣德款斗青釉红玉彩凤纹盘', '', '403.00', '7', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('76a6bb55fce39f16', '周桂珍（款）紫砂炉', '', '409.00', '13', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('7ec4fa100b0f86bd', '程十发草原儿女故事图', '', '408.00', '12', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('8312bdad3d5b1cb5', '铜质八卦纹葫芦瓶', '', '398.00', '2', '0', '', '0', '2014-07-12 00:05:13', '2014-07-12 00:05:13', '0');
INSERT INTO `portal_goods_t` VALUES ('bf0641e2b2702d42', '官窑青釉三足炉', '', '397.00', '1', '0', '', '0', '2014-07-12 00:05:13', '2014-07-12 00:05:13', '0');
INSERT INTO `portal_goods_t` VALUES ('cbea5e50915997e0', '宣德款青花云龙纹盘', '', '402.00', '6', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('d512e276ec7df03a', '顾景舟款瓜棱壶', '', '401.00', '5', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('dbe24dc29995aa20', '谷纹玉璧', '', '405.00', '9', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('dd0468faf5e3072b', '宣德款三足炉', '', '400.00', '4', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('e39034d0cd3ede11', '观世音坐像', '', '406.00', '10', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');
INSERT INTO `portal_goods_t` VALUES ('fb44c173617e4fd9', '《孟子》卷七线装书', '', '407.00', '11', '0', '', '0', '2014-07-12 00:05:14', '2014-07-12 00:05:14', '0');

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
-- Table structure for portal_record_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_record_t`;
CREATE TABLE `portal_record_t` (
  `record_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '浏览记录ID 自增主键',
  `user_id` int(10) NOT NULL COMMENT '浏览用户ID',
  `goods_id` int(10) NOT NULL COMMENT '浏览商品ID',
  `store_id` int(10) NOT NULL COMMENT '浏览商品所属店铺ID',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '浏览记录创建时间(浏览时间)',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户浏览记录表';

-- ----------------------------
-- Records of portal_record_t
-- ----------------------------

-- ----------------------------
-- Table structure for portal_store_t
-- ----------------------------
DROP TABLE IF EXISTS `portal_store_t`;
CREATE TABLE `portal_store_t` (
  `store_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '店铺自增主键',
  `store_name` varchar(50) NOT NULL COMMENT '店铺名称',
  `store_addr` varchar(100) NOT NULL COMMENT '店铺地址',
  `store_contact` varchar(10) NOT NULL COMMENT '店铺联系人',
  `contact_phone` varchar(15) NOT NULL COMMENT '联系人电话',
  `create_time` datetime NOT NULL COMMENT '店铺建立时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='店铺信息表';

-- ----------------------------
-- Records of portal_store_t
-- ----------------------------
INSERT INTO `portal_store_t` VALUES ('1', '求是阁', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('2', '玉缘阁', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('3', '古风堂', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('4', '佛缘堂', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('5', '古雅堂', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('6', '锦砂轩', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('7', '青田石府', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('8', '明匯画廊', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('9', '艺萊轩', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('10', '山云楼', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('11', '墨宝斋', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('12', '融贤堂', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('13', '鸿嘉轩', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('14', '纪元新语', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');
INSERT INTO `portal_store_t` VALUES ('15', '锦瑯阁', '沈阳市和平区xxx路XXX号', '艾书尧', '13840079746', '2014-07-11 23:53:12', '2014-07-11 23:53:12');

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
