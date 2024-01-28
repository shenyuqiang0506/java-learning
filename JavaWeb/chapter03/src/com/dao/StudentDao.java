package com.dao;

import com.bean.Student;

/**
 * @Author 申宇强
 * @Date 2024/1/28 17:30
 */
public class StudentDao {
    public static void main(String[] args) {
        Student student = new Student(1, "申宇强", "男");
        System.out.println(student.getName());
    }
}
