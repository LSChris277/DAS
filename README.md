### 数据库建表语句
#### 建库
```sql
CREATE SCHEMA `das` DEFAULT CHARACTER SET utf8mb4 ;
```
#### 建表
用户表
```sql
CREATE TABLE `das`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_number` VARCHAR(45) NULL COMMENT '账号',
  `name` VARCHAR(45) NULL COMMENT '昵称',
  `type` INT NULL DEFAULT 0 COMMENT '用户类型，0：普通用户。1：管理员账户。2：省级账户',
  `password` VARCHAR(45) NULL COMMENT '密码',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '用户表';
```
案例表
```sql
CREATE TABLE `das`.`case` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `report_institutions` VARCHAR(45) NULL COMMENT '报告单位',
  `id_number` VARCHAR(45) NULL COMMENT '身份证号',
  `name` VARCHAR(45) NULL COMMENT '姓名',
  `phone_number` VARCHAR(45) NULL COMMENT '联系方式',
  `age` INT NULL COMMENT '年龄',
  `sex` VARCHAR(4) NULL COMMENT '性别',
  `profession` VARCHAR(45) NULL COMMENT '职业',
  `nation` VARCHAR(45) NULL COMMENT '国家',
  `current_location` VARCHAR(45) NULL COMMENT '当前所在地',
  `travel_history` VARCHAR(45) NULL COMMENT '近期一个月旅居史',
  `work_institutions` VARCHAR(45) NULL COMMENT '工作单位',
  `situation` INT NULL COMMENT '情况：1，确诊患者。2，疑似患者。3，无症状感染者。4，密切接触者。5，健康但需要隔离者。6，健康且不需要隔离者。7，已康复。',
  `confirm_date` TIMESTAMP NULL COMMENT '确诊日期',
  `level` INT NULL COMMENT '病重等级：1，轻症。2，重症。3，死亡。',
  `death_date` TIMESTAMP NULL COMMENT '死亡日期',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '案例表';
```