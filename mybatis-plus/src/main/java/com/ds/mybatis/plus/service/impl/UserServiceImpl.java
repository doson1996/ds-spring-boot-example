package com.ds.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.mybatis.plus.domain.User;
import com.ds.mybatis.plus.mapper.UserMapper;
import com.ds.mybatis.plus.service.UserService;

import org.springframework.stereotype.Service;

/**
 * @Author ds
 * @Date 2021/4/23 16:12
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService {

}




