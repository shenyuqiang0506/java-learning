package com.test;

import com.bean.User;
import com.mapper.TestMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/1/28 18:03
 */
public class Main {
    public static void main(String[] args) {

        try (SqlSession Session = MybatisUtils.getSession(true)) {
            TestMapper mapper = Session.getMapper(TestMapper.class);
            System.out.println(mapper.getUserById(2));
            System.out.println("========");
            System.out.println(mapper.addUser(new User().setName("张三").setPassword("123456")));
            System.out.println("========");
            System.out.println(mapper.deleteUser(7));
            System.out.println("=======");
            mapper.selectUser().forEach(System.out::println);
            System.out.println("========");
        }
    }
}
