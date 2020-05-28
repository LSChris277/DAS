package com.scut.das.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author Chris
 * @since 2020-04-29 09:31:20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
// 当数据库表名和实体类名不一致时，使用该注解绑定
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = 883091703555031010L;
    /**
    * 主键
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 账号
    */
    private String userNumber;
    /**
    * 昵称
    */
    private String name;
    /**
    * 用户类型，0：普通用户。1：管理员账户。2：省级账户
    */
    private Integer type;
    /**
    * 密码
    */
    private String password;

}