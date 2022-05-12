/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : codeblog

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 12/05/2022 11:57:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `preview` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `date` date NULL DEFAULT NULL,
  `state` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (20, '要做研发高手，就是必须能看英文、写英文', '英语是目前全球科技交流的第一语言，这是一个不争的事实，而且我们与欧美的先进技术还有相当的差距，要研发一流的产品，不看英文是不可能的。', '# 一级标题\n-	编号一\n-	## 二级标题\n	-	二级编号\nJava代码段\n\n```Java\npackage com.example.codeblog.config;\n\nimport org.springframework.context.annotation.Configuration;\nimport org.springframework.web.servlet.config.annotation.CorsRegistry;\nimport org.springframework.web.servlet.config.annotation.WebMvcConfigurer;\n\n@Configuration\npublic class CrossConfig implements WebMvcConfigurer {\n    @Override\n    public void addCorsMappings(CorsRegistry registry) {\n        registry.addMapping(\"/**\")\n                .allowCredentials(false)\n                .allowedMethods(\"POST\", \"GET\", \"PUT\", \"OPTIONS\", \"DELETE\")\n                .allowedOrigins(\"*\");\n    }\n}\n\n```\nC++代码段\n```C++\nclass Solution {\npublic:\n    string lastSubstring(string s) {\n        int l = 0, r = 1, k = 0, n = s.size();\n        while(r + k < n){\n            if(s[l + k] == s[r + k]) k++;\n            else if(s[l] < s[r + k]){\n                l = r + k;\n                r = l + 1;\n                k = 0;\n            }\n            else if(s[l + k] < s[r + k]){\n                l = r;\n                r++;\n                k = 0;\n            }\n            else{\n                r++;\n                k = 0;\n            } \n        }\n        return s.substr(l);\n    }\n};\n```\n\n\n', '2022-05-12', 1);
INSERT INTO `article` VALUES (21, '“神奇”的程序员日常：不写程序、运行别人的代码、每周只“深度工作” 10 小时？', '很大程度上，人们习惯于将“软件开发工程师”、“软件测试工程师”、“运维工程师”等计算机行业相关岗位等同于“程序员”，而顾名思义，其工作主要是写程序、敲代码——理论上来说，应该是这样的。', '# 一级标题\n-	编号一\n-	## 二级标题\n	-	二级编号\nJava代码段\n\n```Java\npackage com.example.codeblog.config;\n\nimport org.springframework.context.annotation.Configuration;\nimport org.springframework.web.servlet.config.annotation.CorsRegistry;\nimport org.springframework.web.servlet.config.annotation.WebMvcConfigurer;\n\n@Configuration\npublic class CrossConfig implements WebMvcConfigurer {\n    @Override\n    public void addCorsMappings(CorsRegistry registry) {\n        registry.addMapping(\"/**\")\n                .allowCredentials(false)\n                .allowedMethods(\"POST\", \"GET\", \"PUT\", \"OPTIONS\", \"DELETE\")\n                .allowedOrigins(\"*\");\n    }\n}\n\n```\nC++代码段\n```C++\nclass Solution {\npublic:\n    string lastSubstring(string s) {\n        int l = 0, r = 1, k = 0, n = s.size();\n        while(r + k < n){\n            if(s[l + k] == s[r + k]) k++;\n            else if(s[l] < s[r + k]){\n                l = r + k;\n                r = l + 1;\n                k = 0;\n            }\n            else if(s[l + k] < s[r + k]){\n                l = r;\n                r++;\n                k = 0;\n            }\n            else{\n                r++;\n                k = 0;\n            } \n        }\n        return s.substr(l);\n    }\n};\n```\n\n\n', '2022-05-12', 1);
INSERT INTO `article` VALUES (22, 'Docker Desktop 终于登陆 Linux', '千呼万唤始出来。5 月 10 日，Docker 在官方博客上宣布 Docker Desktop 现可在 Linux 上使用。使用 Linux 桌面的开发者可以拥有在 macOS、Windows 上完全相同的 Docker Desktop 体验，这一消息让无数开发者为之振奋。', '# 一级标题\n-	编号一\n-	## 二级标题\n	-	二级编号\nJava代码段\n\n```Java\npackage com.example.codeblog.config;\n\nimport org.springframework.context.annotation.Configuration;\nimport org.springframework.web.servlet.config.annotation.CorsRegistry;\nimport org.springframework.web.servlet.config.annotation.WebMvcConfigurer;\n\n@Configuration\npublic class CrossConfig implements WebMvcConfigurer {\n    @Override\n    public void addCorsMappings(CorsRegistry registry) {\n        registry.addMapping(\"/**\")\n                .allowCredentials(false)\n                .allowedMethods(\"POST\", \"GET\", \"PUT\", \"OPTIONS\", \"DELETE\")\n                .allowedOrigins(\"*\");\n    }\n}\n\n```\nC++代码段\n```C++\nclass Solution {\npublic:\n    string lastSubstring(string s) {\n        int l = 0, r = 1, k = 0, n = s.size();\n        while(r + k < n){\n            if(s[l + k] == s[r + k]) k++;\n            else if(s[l] < s[r + k]){\n                l = r + k;\n                r = l + 1;\n                k = 0;\n            }\n            else if(s[l + k] < s[r + k]){\n                l = r;\n                r++;\n                k = 0;\n            }\n            else{\n                r++;\n                k = 0;\n            } \n        }\n        return s.substr(l);\n    }\n};\n```\n\n\n', '2022-05-12', 1);

-- ----------------------------
-- Table structure for article_tag
-- ----------------------------
DROP TABLE IF EXISTS `article_tag`;
CREATE TABLE `article_tag`  (
  `id` int NOT NULL,
  `aid` int NULL DEFAULT NULL,
  `tid` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_tag
-- ----------------------------

-- ----------------------------
-- Table structure for article_user
-- ----------------------------
DROP TABLE IF EXISTS `article_user`;
CREATE TABLE `article_user`  (
  `id` int NOT NULL,
  `aid` int NULL DEFAULT NULL,
  `uid` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_user
-- ----------------------------

-- ----------------------------
-- Table structure for attention
-- ----------------------------
DROP TABLE IF EXISTS `attention`;
CREATE TABLE `attention`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `ufid` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `utid` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attention
-- ----------------------------
INSERT INTO `attention` VALUES (1, 'abc', 'asd');
INSERT INTO `attention` VALUES (2, 'asd', 'abc');
INSERT INTO `attention` VALUES (3, 'abc', 'asd');

-- ----------------------------
-- Table structure for collector
-- ----------------------------
DROP TABLE IF EXISTS `collector`;
CREATE TABLE `collector`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `uname` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collector
-- ----------------------------
INSERT INTO `collector` VALUES (21, '新建收藏夹', 'asd');
INSERT INTO `collector` VALUES (22, 'asd', 'abc');
INSERT INTO `collector` VALUES (24, 'CESHI', 'asd');
INSERT INTO `collector` VALUES (26, 'AA', 'asd');

-- ----------------------------
-- Table structure for collector_article
-- ----------------------------
DROP TABLE IF EXISTS `collector_article`;
CREATE TABLE `collector_article`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `cid` int NULL DEFAULT NULL,
  `aid` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collector_article
-- ----------------------------

-- ----------------------------
-- Table structure for personal
-- ----------------------------
DROP TABLE IF EXISTS `personal`;
CREATE TABLE `personal`  (
  `name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `desc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `sex` int NULL DEFAULT NULL,
  `interest` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of personal
-- ----------------------------

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `id` int NOT NULL,
  `description` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `privilege` int NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('abc', 'qwe', 1);
INSERT INTO `user` VALUES ('asd', 'qwe', 0);
INSERT INTO `user` VALUES ('dfg', 'qwe', 1);
INSERT INTO `user` VALUES ('qwr', 'qwe', 1);
INSERT INTO `user` VALUES ('wer', 'qwe', 1);

-- ----------------------------
-- Table structure for usermsg
-- ----------------------------
DROP TABLE IF EXISTS `usermsg`;
CREATE TABLE `usermsg`  (
  `id` int NOT NULL,
  `msg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usermsg
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
