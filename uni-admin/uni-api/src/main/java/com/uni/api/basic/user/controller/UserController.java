package com.uni.api.basic.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.user.service.UserService;
import com.uni.api.basic.user.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   @description : User 控制器
 *   @author LuoYang
 *   @since 2019-08-14
 */
@Controller
@RequestMapping("/user")
public class UserController {
private final Logger logger=LoggerFactory.getLogger(UserController.class);

@Autowired
public UserService userService;


}