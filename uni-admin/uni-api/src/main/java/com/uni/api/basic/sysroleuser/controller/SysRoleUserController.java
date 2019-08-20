package com.uni.api.basic.sysroleuser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.sysroleuser.service.SysRoleUserService;
import com.uni.api.basic.sysroleuser.entity.SysRoleUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   @description : SysRoleUser 控制器
 *   @author LuoYang
 *   @since 2019-08-14
 */
@Controller
@RequestMapping("/sysRoleUser")
public class SysRoleUserController {
private final Logger logger=LoggerFactory.getLogger(SysRoleUserController.class);

@Autowired
public SysRoleUserService sysRoleUserService;


}