package com.uni.api.basic.syspermission.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.syspermission.service.SysPermissionService;
import com.uni.api.basic.syspermission.entity.SysPermissionEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LuoYang
 * @description : SysPermission 控制器
 * @since 2019-08-14
 */
@Controller
@RequestMapping("/sysPermission")
public class SysPermissionController {
    private final Logger logger = LoggerFactory.getLogger(SysPermissionController.class);

    @Autowired
    public SysPermissionService sysPermissionService;


}