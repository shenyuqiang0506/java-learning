package com.shen.service.impl;

import com.shen.mapper.StudentMapper;
import com.shen.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author 申宇强
 * @Date 2024/3/16 17:26
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper mapper;

    @Override
    public void addStudent(String name, String sex, String grade) {
        mapper.addStudent(name, sex, grade);
    }
}
