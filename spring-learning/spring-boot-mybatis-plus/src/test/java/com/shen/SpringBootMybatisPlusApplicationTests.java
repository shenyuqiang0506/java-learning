package com.shen;

import com.shen.entity.User;
import com.shen.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisPlusApplicationTests {
    @Resource
    UserMapper mapper;

    @Test
    void contextLoads() {
       System.out.println(mapper.selectById(1));  //同样可以直接selectById，非常快速方便
//        User user = new User();
//        user.setName("shen");
//        user.setEmail("123567@qq.com");
//        user.setPassword("123456");
//        int count = mapper.insert(user);
//        if (count > 0) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//
//        }
    }

}
