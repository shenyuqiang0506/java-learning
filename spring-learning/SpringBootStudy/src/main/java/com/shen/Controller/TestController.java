package com.shen.Controller;

import com.shen.entity.Student;
import com.shen.entity.User;
import com.shen.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/19 9:36
 */
@Controller
public class TestController {
    @Resource
    UserMapper mapper;
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @ResponseBody
    @GetMapping("/test")
    public User test(){
        return mapper.findUserById(1);
    }
}
