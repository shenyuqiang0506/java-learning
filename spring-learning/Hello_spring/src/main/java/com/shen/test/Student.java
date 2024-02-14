package com.shen.test;

import lombok.ToString;

/**
 * @Author 申宇强
 * @Date 2024/2/5 16:26
 */
@ToString
public class Student {
    Teacher teacher;
    String name;

    Student() {
        System.out.println("我被构造了");
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }
}
