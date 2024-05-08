package com.shen.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringBootRedisApplicationTests {
    @Autowired
    StringRedisTemplate template;

    @Test
    void contextLoads() {
        ValueOperations<String, String> operations = template.opsForValue();
        operations.set("name", "shen");//设置值
        System.out.println(operations.get("name"));//获取值

        template.delete("name");
        System.out.println(template.hasKey("name"));
    }

}
