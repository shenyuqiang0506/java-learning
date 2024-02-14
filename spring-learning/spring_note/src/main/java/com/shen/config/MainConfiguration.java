package com.shen.config;

import com.shen.entity.ArtTeacher;
import com.shen.entity.Student;
import com.shen.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author 申宇强
 * @Date 2024/2/14 15:23
 */
@EnableScheduling//开启定时任务功能
@Configuration
@EnableAsync//开启异步功能4
@ComponentScans({
        @ComponentScan("com.shen.entity"),
        @ComponentScan("com.shen.listener")
})
public class MainConfiguration {
//    @Bean("test")
//    public Student student(Teacher teacher) {
//        Student student = new Student();
////        student.setTeacher(teacher);
//        return student;
//    }
//
//    @Bean
//    public Teacher teacher01() {
//        return new ArtTeacher();
//    }
//    @Bean("b")
//    public Teacher teacher02() {
//        return new ArtTeacher();
//    }
}
