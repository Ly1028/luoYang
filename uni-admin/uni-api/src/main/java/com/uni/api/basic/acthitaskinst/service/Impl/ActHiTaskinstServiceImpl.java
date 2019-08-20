package com.uni.api.basic.acthitaskinst.service.Impl;

import com.uni.api.basic.acthitaskinst.entity.ActHiTaskinstEntity;
import com.uni.api.basic.acthitaskinst.dao.ActHiTaskinstDao;
import com.uni.api.basic.acthitaskinst.service.ActHiTaskinstService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ActHiTaskinstServiceImpl extends ServiceImpl<ActHiTaskinstDao, ActHiTaskinstEntity> implements ActHiTaskinstService {


    @Autowired
    private ActHiTaskinstDao actHiTaskinstDao;


        }