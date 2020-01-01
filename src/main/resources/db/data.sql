INSERT INTO `user` (id, username, password, role, email) VALUES ('1', 'root', '1234', 'admin', '123@admin');
INSERT INTO `user` (id, username, password, role, email) VALUES ('2', 'user', '1234', 'user', '123@user1');
INSERT INTO `user` (id, username, password, role, email) VALUES ('3', 'user1', '1234', 'user', '123@user2');
INSERT INTO `user` (id, username, password, role, email) VALUES ('5', 'user3', '1234', 'user', '123@user4');
INSERT INTO `user` (id, username, password, role, email) VALUES ('6', 'user4', '1234', 'user', '123@user5');


INSERT INTO `study` (id, classroom, week, time) VALUES ('1', '教3-101', '星期三', '11：00~14：00');
INSERT INTO `study` (id, classroom, week, time) VALUES ('2', '教4-210', '星期一', '13：00~15：00');
INSERT INTO `study` (id, classroom, week, time) VALUES ('3', '教3-403', '星期四', '17：00~19：00');
INSERT INTO `study` (id, classroom, week, time) VALUES ('4', '教1-507', '星期五', '10：00~13：00');
INSERT INTO `study` (id, classroom, week, time) VALUES ('5', '教2-610', '星期二', '7：00~9：00');
INSERT INTO `study` (id, classroom, week, time) VALUES ('6', '教3-501', '星期三', '8：00~14：00');
COMMIT;