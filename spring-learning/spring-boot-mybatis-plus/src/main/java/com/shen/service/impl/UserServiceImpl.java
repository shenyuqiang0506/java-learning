package com.shen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shen.entity.User;
import com.shen.mapper.UserMapper;
import com.shen.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author 申宇强
 * @Date 2024/4/24 上午10:59
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
