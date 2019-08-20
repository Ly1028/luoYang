package com.uni.api.basic.syspermissionrole.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.syspermissionrole.service.SysPermissionRoleService;
import com.uni.api.basic.syspermissionrole.entity.SysPermissionRoleEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   @description : SysPermissionRole 控制器
 *   @author LuoYang
 *   @since 2019-08-14
 */
@Controller
@RequestMapping("/sysPermissionRole")
public class SysPermissionRoleController {
private final Logger logger=LoggerFactory.getLogger(SysPermissionRoleController.class);

@Autowired
public SysPermissionRoleService sysPermissionRoleService;


}