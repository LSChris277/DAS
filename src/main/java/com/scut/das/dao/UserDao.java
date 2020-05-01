package com.scut.das.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scut.das.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户表(User)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 09:39:55
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}