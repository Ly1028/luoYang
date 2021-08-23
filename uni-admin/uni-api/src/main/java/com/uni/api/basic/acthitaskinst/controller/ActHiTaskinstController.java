package com.uni.api.basic.acthitaskinst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.uni.api.basic.acthitaskinst.service.ActHiTaskinstService;
import com.uni.api.basic.acthitaskinst.entity.ActHiTaskinstEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   @description : ActHiTaskinst 控制器
 *   @author LuoYang
 *   @since 2019-08-14
 */
@Controller
@RequestMapping("/actHiTaskinst")
public class ActHiTaskinstController {
private final Logger logger=LoggerFactory.getLogger(ActHiTaskinstController.class);

@Autowired
private ActHiTaskinstService actHiTaskinstService;


}
