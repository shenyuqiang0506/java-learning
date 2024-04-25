package com.shen.controller;

import com.shen.entity.RestBean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 申宇强
 * @Date 2024/4/25 上午10:26
 */
@RestController   //为了方便，我们一律使用RestController，这样每个请求默认都返回JSON对象
@RequestMapping("/api/user")   //用户相关的接口，路径可以设置为/api/user/xxxx
public class UserController {
    @GetMapping("/name")
    public RestBean<String> username() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return RestBean.success(user.getUsername());
    }
}
