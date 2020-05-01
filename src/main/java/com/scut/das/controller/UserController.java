package com.scut.das.controller;

import com.scut.das.entity.User;
import com.scut.das.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(User)表控制层
 *
 * @author makejava
 * @since 2020-04-29 10:26:07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @return 所有数据
     */
//    @GetMapping("/selectAll")
//    public User selectAll() {
//        return this.userService.queryAll();
//    }

}