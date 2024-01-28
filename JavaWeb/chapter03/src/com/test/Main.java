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
            mapper.selectUser().forEach(System.out::println);
        }
    }
}
