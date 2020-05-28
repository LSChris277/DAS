package com.scut.das.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scut.das.dao.UserDao;
import com.scut.das.entity.User;
import com.scut.das.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public User selectByUserNumber(String userName) {
        return query().eq("user_number", userName).one();
    }
}
