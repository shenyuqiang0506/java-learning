package com.shen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 申宇强
 * @Date 2024/3/6 10:04
 */
@RestController
//@Controller
public class HelloController {
    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "hello world";
    }


    //异常处理
    @RequestMapping("/index")
    public String index() {
        System.out.println("我是处理！");
        if (true) throw new RuntimeException("您的氪金力度不足，无法访问！");
        return "index";
    }

}
