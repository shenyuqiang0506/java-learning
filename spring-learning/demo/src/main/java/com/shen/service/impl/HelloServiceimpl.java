package com.shen.service.impl;

import com.shen.entity.User;
import com.shen.mapper.HelloMapper;
import com.shen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 申宇强
 * @Date 2024/3/11 17:23
 */
@Service
public class HelloServiceimpl implements HelloService {
    @Autowired
    HelloMapper mapper;

    @Override
    public User findUserById(int id) {
        return mapper.findUserById(id);
    }
}
