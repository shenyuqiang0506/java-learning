package com.shen.service;

import com.shen.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @Author 申宇强
 * @Date 2024/3/16 17:24
 */

public interface StudentService {
    void addStudent(String name, String sex, String grade);
}
