package com.uni.api.basic.syspermissionrole.service.Impl;

import com.uni.api.basic.syspermissionrole.entity.SysPermissionRoleEntity;
import com.uni.api.basic.syspermissionrole.dao.SysPermissionRoleDao;
import com.uni.api.basic.syspermissionrole.service.SysPermissionRoleService;
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
public class SysPermissionRoleServiceImpl extends ServiceImpl<SysPermissionRoleDao, SysPermissionRoleEntity> implements SysPermissionRoleService {


    @Autowired
    private SysPermissionRoleDao sysPermissionRoleDao;


        }