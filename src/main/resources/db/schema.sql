SET NAMES utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL comment '用户名',
  `password` varchar(255) DEFAULT NULL comment '密码',
  `email` varchar(50) DEFAULT NULL comment '邮箱',
  `role` varchar(50) DEFAULT NULL comment '角色',
  PRIMARY KEY (`id`)
);
ALTER TABLE `user` ADD UNIQUE (`username`);
ALTER TABLE `user` ADD UNIQUE (`email`);
ALTER TABLE `user` ADD UNIQUE (`phone`);

DROP TABLE IF EXISTS `study`;
CREATE TABLE  `study` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classroom` varchar(50) DEFAULT NULL comment '教室',
  `week` varchar(255) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);