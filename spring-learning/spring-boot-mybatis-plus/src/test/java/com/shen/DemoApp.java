package com.shen;

import com.shen.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author 申宇强
 * @Date 2024/4/24 上午11:02
 */
@SpringBootTest
class DemoApp {
    @Resource
    private UserService service;
    @Test
    void test(){
        service.query().
                eq("id",1).
                one();
        System.out.println("id");
    }
}
