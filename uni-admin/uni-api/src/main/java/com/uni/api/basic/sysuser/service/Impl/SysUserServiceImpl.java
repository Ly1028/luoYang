package com.uni.api.basic.sysuser.service.Impl;

import com.uni.api.basic.sysuser.entity.SysUserEntity;
import com.uni.api.basic.sysuser.dao.SysUserDao;
import com.uni.api.basic.sysuser.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {


    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUserEntity getUser() {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUserEntity user = (SysUserEntity) userDetails;
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getUserAuthorities() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        return authorities;
    }
}
