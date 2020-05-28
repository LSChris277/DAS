package com.scut.das.controller;

import com.scut.das.entity.User;
import com.scut.das.service.UserService;
import com.scut.das.system.common.CommonResult;
import com.scut.das.system.enums.ErrorCodeEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录认证类
 * @author Chris
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public CommonResult login(String userName, String passWord) {
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(new UsernamePasswordToken(userName, passWord));
            User user = userService.selectByUserNumber(userName);
            return CommonResult.success(user, "登录成功");

        } catch (AuthenticationException e) {
            e.printStackTrace();
            return CommonResult.failed(ErrorCodeEnum.USERNAME_OR_PASSWORD_IS_WRONG);
        }
    }

    /**
     * 测试使用
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/unauthentic")
    public CommonResult unAuthentic() {
        return CommonResult.failed(ErrorCodeEnum.UNAUTHORIZED);
    }
}
