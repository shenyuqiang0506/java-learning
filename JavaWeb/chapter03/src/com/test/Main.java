package com.test;

import com.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/1/28 18:03
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            List<User> student = sqlSession.selectList("selectUser");
            student.forEach(System.out::println);
        }
    }
}
