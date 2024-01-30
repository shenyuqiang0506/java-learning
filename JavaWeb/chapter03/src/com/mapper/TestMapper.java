package com.mapper;

import com.bean.User;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/1/28 18:28
 */
public interface TestMapper {
    List<User> selectUser();

    User getUserById(int id);

    int addUser(User user);

    int deleteUser(int id);
}
