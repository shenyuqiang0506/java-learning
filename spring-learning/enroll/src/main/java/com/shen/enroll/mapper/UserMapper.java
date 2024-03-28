package com.shen.enroll.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 申宇强
 * @Date 2024/3/24 15:50
 */
@Mapper
public interface UserMapper {
    @Insert("insert into demo(username,email,password) values (#{username},#{email},#{password})")
    void createUser(String username, String email, String password);
}
