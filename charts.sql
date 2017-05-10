/*
 Navicat Premium Data Transfer

 Source Server         : mysql-remote
 Source Server Type    : MySQL
 Source Server Version : 50173
 Source Host           : 172.21.6.226
 Source Database       : chart

 Target Server Type    : MySQL
 Target Server Version : 50173
 File Encoding         : utf-8

 Date: 05/10/2017 20:13:30 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `charts`
-- ----------------------------
DROP TABLE IF EXISTS `charts`;
CREATE TABLE `charts` (
  `title` varchar(100) NOT NULL,
  `background_color` varchar(10) NOT NULL,
  `scale_text_color` varchar(10) NOT NULL,
  `value_text_color` varchar(10) NOT NULL,
  `chart_data` varchar(3000) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`title`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
