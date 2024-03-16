package com.shen.mapper;

import com.shen.entity.Account;
import com.shen.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:28
 */
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    Account findUserByName(String username);

    @Select("select * from student")
    List<Student> getStudentList();
}
