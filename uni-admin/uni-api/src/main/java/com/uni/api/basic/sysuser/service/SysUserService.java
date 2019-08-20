package com.uni.api.basic.sysuser.service;

import com.uni.api.basic.sysuser.entity.SysUserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
public interface SysUserService extends IService<SysUserEntity> {


    /**
     * 获取当前用户信息
     * @return
     */
    SysUserEntity getUser();

    /**
     * 获取当前用户的权限
     * @return
     */
    Collection<? extends GrantedAuthority> getUserAuthorities();
}