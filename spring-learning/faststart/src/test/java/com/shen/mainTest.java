package com.shen;

import com.shen.mapper.UserMapper;
import com.shen.service.IUserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author 申宇强
 * @Date 2024/4/24 上午11:34
 */

@SpringBootTest
public class mainTest {
    @Resource
    IUserService service;

    @Test
    void test() {
        System.out.println(service.query().list());

    }
}
