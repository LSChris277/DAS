package com.scut.das.system.shiro;

import com.scut.das.entity.User;
import com.scut.das.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Chris
 */
public class Realm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken 主体传过来的认证信息
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername().toString();
        String passWord = new String(token.getPassword());

        User user = userService.selectByUserNumber(userName);

        if (!passWord.equals(user.getPassword())) {
            throw new AuthenticationException("用户名或密码不正确");
        }

        return new SimpleAuthenticationInfo(userName, passWord, getName());
    }

}
