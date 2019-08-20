package com.uni.api.basic.sysrole.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.sysrole.service.SysRoleService;
import com.uni.api.basic.sysrole.entity.SysRoleEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   @description : SysRole 控制器
 *   @author LuoYang
 *   @since 2019-08-14
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleController {
private final Logger logger=LoggerFactory.getLogger(SysRoleController.class);

@Autowired
public SysRoleService sysRoleService;


}