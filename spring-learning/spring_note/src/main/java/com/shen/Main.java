package com.shen;

import com.shen.config.MainConfiguration;
import com.shen.entity.Student;
import com.shen.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 申宇强
 * @Date 2024/2/14 15:22
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Teacher.class));
        Student student = context.getBean(Student.class);
        student.asyncTest();   //异步执行
        student.syncTest();    //同步执行
        student.task();
        System.out.println(student.getClass());
    }
}
