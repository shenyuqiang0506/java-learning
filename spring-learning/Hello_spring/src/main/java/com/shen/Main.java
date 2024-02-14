package com.shen;

import com.shen.test.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 申宇强
 * @Date 2024/2/4 13:48
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
