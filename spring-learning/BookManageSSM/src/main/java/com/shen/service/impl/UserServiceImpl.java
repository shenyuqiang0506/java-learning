package com.shen.service.impl;

import com.shen.entity.Account;
import com.shen.entity.Student;
import com.shen.mapper.UserMapper;
import com.shen.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = mapper.findUserByName(username);
        if(account == null)
            throw new UsernameNotFoundException("用户名或密码错误！");
        return User
                .withUsername(account.getUsername())
                .password(account.getPassword())
                .roles(account.getRole())
                .build();
    }

    @Override
    public List<Student> getStudentList() {
        return mapper.getStudentList();
    }
}

