package com.uni.api.basic.sysuser.controller;

import com.uni.api.basic.sysuser.entity.SysUserEntity;
import com.uni.api.basic.sysuser.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author LuoYang
 * @description : SysUser 控制器
 * @since 2019-08-14
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {
    private final Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    public SysUserService sysUserService;

    @RequestMapping("/info")
    @ResponseBody
    public String productInfo() {
        String currentUser = "";
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principl instanceof UserDetails) {
            currentUser = ((UserDetails) principl).getUsername();
        } else {
            currentUser = principl.toString();
        }
        return " some product info,currentUser is: " + currentUser;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public SysUserEntity getUser() {

        return sysUserService.getUser();
    }

    @RequestMapping("/getUserAuthorities")
    @ResponseBody
    public Collection getUserAuthorities() {

        Collection<? extends GrantedAuthority> userAuthorities = sysUserService.getUserAuthorities();
        return userAuthorities;
    }
}