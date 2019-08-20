package com.uni.api.basic.sysroleuser.service.Impl;

import com.uni.api.basic.sysroleuser.entity.SysRoleUserEntity;
import com.uni.api.basic.sysroleuser.dao.SysRoleUserDao;
import com.uni.api.basic.sysroleuser.service.SysRoleUserService;
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
public class SysRoleUserServiceImpl extends ServiceImpl<SysRoleUserDao, SysRoleUserEntity> implements SysRoleUserService {


    @Autowired
    private SysRoleUserDao sysRoleUserDao;


        }