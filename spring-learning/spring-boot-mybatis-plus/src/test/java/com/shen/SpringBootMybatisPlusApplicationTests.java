package com.shen;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shen.entity.User;
import com.shen.mapper.UserMapper;
import com.shen.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisPlusApplicationTests {
    @Resource
    UserMapper mapper;
    @Qualifier("userService")
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
//       System.out.println(mapper.selectById(1));  //同样可以直接selectById，非常快速方便
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

//        条件构造器
//        对于一些复杂查询的情况，MybatisPlus支持我们自己构造QueryWrapper用于复杂条件查询：
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .select("id", "name", "email", "password")
                .ge("id", 2)
                .orderByDesc("id");

        System.out.println(mapper.selectList(wrapper));
    }
}
