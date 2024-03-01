package com.shen;

import com.shen.config.MainConfiguration;
import com.shen.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 申宇强
 * @Date 2024/2/15 16:31
 */
public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Student bean = context.getBean(Student.class);
////        bean.study();
//        bean.study("PHP");
        //注解开发
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student bean = context.getBean(Student.class);
        bean.study();
    }

}
