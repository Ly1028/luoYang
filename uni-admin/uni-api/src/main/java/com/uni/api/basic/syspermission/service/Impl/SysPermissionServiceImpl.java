package com.uni.api.basic.syspermission.service.Impl;

import com.uni.api.basic.syspermission.entity.SysPermissionEntity;
import com.uni.api.basic.syspermission.dao.SysPermissionDao;
import com.uni.api.basic.syspermission.service.SysPermissionService;
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
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionDao, SysPermissionEntity> implements SysPermissionService {


    @Autowired
    private SysPermissionDao sysPermissionDao;


        }