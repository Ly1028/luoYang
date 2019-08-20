package com.uni.api.basic.user.service.Impl;

import com.uni.api.basic.user.entity.UserEntity;
import com.uni.api.basic.user.dao.UserDao;
import com.uni.api.basic.user.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {


    @Autowired
    private UserDao userDao;


        }