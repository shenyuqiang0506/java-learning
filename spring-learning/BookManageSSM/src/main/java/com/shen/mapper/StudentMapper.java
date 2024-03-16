package com.shen.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

/**
 * @Author 申宇强
 * @Date 2024/3/16 17:22
 */

public interface StudentMapper {
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "grade", property = "grade")
    })
    @Insert("insert into student(name, sex, grade) values(#{name}, #{sex}, #{grade})")
    void addStudent(@Param("name") String name, @Param("sex") String sex, @Param("grade") String grade);

}
