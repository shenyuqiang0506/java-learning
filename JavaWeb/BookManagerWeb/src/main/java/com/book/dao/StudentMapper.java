package com.book.dao;

import com.book.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/2/1 10:02
 */
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudentList();

}
