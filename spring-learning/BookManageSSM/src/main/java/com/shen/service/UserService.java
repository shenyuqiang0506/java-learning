package com.shen.service;

import com.shen.entity.Student;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.*;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:24
 */
public interface UserService extends UserDetailsService {
    List<Student> getStudentList();
}
