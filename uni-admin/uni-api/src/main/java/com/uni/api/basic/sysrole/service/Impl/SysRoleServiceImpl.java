package com.uni.api.basic.sysrole.service.Impl;

import com.uni.api.basic.sysrole.entity.SysRoleEntity;
import com.uni.api.basic.sysrole.dao.SysRoleDao;
import com.uni.api.basic.sysrole.service.SysRoleService;
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
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {


    @Autowired
    private SysRoleDao sysRoleDao;


        }