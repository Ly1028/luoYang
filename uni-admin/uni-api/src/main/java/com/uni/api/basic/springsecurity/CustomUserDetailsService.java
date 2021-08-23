package com.uni.api.basic.springsecurity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.uni.api.basic.sysuser.entity.SysUserEntity;
import com.uni.api.basic.sysuser.service.SysUserService;
import com.uni.api.basic.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: uni-admin
 * @description:
 * @author: LuoYang
 * @create: 2019-08-16 10:20
 */
@Component("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {



        // 1. 查询用户
        QueryWrapper wrapper = new QueryWrapper();

        wrapper.eq("username", login);
        // TODO 根据用户名，查找到对应的密码，与权限
        SysUserEntity userFromDatabase = sysUserService.getOne(wrapper);
        if (userFromDatabase == null) {
            logger.warn("User: {} not found", login);
            throw new UsernameNotFoundException("User " + login + " was not found in db");
            //这里找不到必须抛异常
        }

        // 2. 设置角色 此处应该查角色信息,将查到的角色信息注入权限
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_ADMIN");
        grantedAuthorities.add(grantedAuthority);

        //spring 会比较密码是否加密过,如果不加密则无法通过验证
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        //加密
        String newPassword = passwordEncoder.encode(userFromDatabase.getPassword());

        // 封装用户信息，并返回。参数分别是：用户名，密码，用户权限,这边 springSecurity 用自动拿页面中密码跟数据库的密码比对
        return new org.springframework.security.core.userdetails.User(login,
                newPassword, grantedAuthorities);
    }
}
