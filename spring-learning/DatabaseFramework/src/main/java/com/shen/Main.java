package com.shen;

import com.shen.config.MainConfiguration;
import com.shen.mapper.TestMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 申宇强
 * @Date 2024/3/1 15:44
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        SqlSessionTemplate template = context.getBean(SqlSessionTemplate.class);
//        TestMapper testMapper = template.getMapper(TestMapper.class);
        TestMapper testMapper = context.getBean(TestMapper.class);
        System.out.println(testMapper.getStudent());

    }
}
