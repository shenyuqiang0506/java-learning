package com.shen.mapper;

import com.shen.entity.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 申宇强
 * @Date 2024/3/1 15:50
 */
public interface TestMapper {
    @Select("select * from test where sid = 1 ")
    Student getStudent();
}
