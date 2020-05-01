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