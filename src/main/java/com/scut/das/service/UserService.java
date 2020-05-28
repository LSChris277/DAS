package com.scut.das.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.scut.das.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 09:57:14
 */
public interface UserService extends IService<User> {
    /**
     * 根据用户账号获取用户对象
     * @param userName
     * @return User对象
     */
    public User selectByUserNumber(String userName);
}